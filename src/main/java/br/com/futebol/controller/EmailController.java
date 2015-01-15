package br.com.futebol.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.futebol.model.Email;
import br.com.futebol.model.Jogador;
import br.com.futebol.repository.JogadorRepository;

@Controller
public class EmailController {
	@Autowired
	private JogadorRepository jogadorRepository;
	
	@Autowired
	private JavaMailSender mailSender;
	 
	@RequestMapping(value = "/email", method = RequestMethod.GET)
	public ModelAndView email() {
		ModelAndView mav = new ModelAndView("email/form");
		return mav;
	}
	
	@RequestMapping(value = "/email/enviar", method = RequestMethod.POST)
	public String enviarEmail(Email email, Model model) throws UnsupportedEncodingException {
		MimeMessage message = mailSender.createMimeMessage();
		
		try {
			MimeMessageHelper helper = new MimeMessageHelper(message, true);
			String emailRemetente = "d.otasahara@gmail.com";
			helper.setFrom("futebol@dsahara.com.br", "Luis Claudio");
			helper.setCc(getEmailJogares());
			helper.setTo(emailRemetente);
			helper.setReplyTo("lugawal@ig.com.br");
			helper.setSubject(email.getAssunto());
			helper.setText(email.getTexto(), true);
			mailSender.send(message);
			
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
		model.addAttribute("mensagem", new String("Email enviado aos atletas"));
		return "email/form";
	}
	
	public String[] getEmailJogares(){
		List<Jogador> jogadores = jogadorRepository.findAll();
		List<String> emails = new ArrayList<String>();
		
		for(Jogador jogador : jogadores){
			emails.add(jogador.getEmail());
		}
		
		return emails.toArray(new String[emails.size()]);
	}
	
	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}
}
