package br.com.futebol.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
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
	private MailSender mailSender;
	 
	@RequestMapping(value = "/email", method = RequestMethod.GET)
	public ModelAndView email() {
		ModelAndView mav = new ModelAndView("email/form");
		return mav;
	}
	
	@RequestMapping(value = "/email/enviar", method = RequestMethod.POST)
	public void enviarEmail(Email email) {
		SimpleMailMessage message = new SimpleMailMessage();
		
		message.setFrom("teste@dsahara.com.br");
		message.setTo("d.otasahara@gmail.com");
		message.setCc(getEmailJogares());
		message.setSubject(email.getAssunto());
		message.setText(email.getTexto());
		//mailSender.send(message);	
	}
	
	public String[] getEmailJogares(){
		List<Jogador> jogadores = jogadorRepository.findAll();
		List<String> emails = new ArrayList<String>();
		
		for(Jogador jogador : jogadores){
			emails.add(jogador.getEmail());
		}
		
		return emails.toArray(new String[emails.size()]);
	}
	
	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}
}
