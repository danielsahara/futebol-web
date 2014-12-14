package br.com.futebol;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.futebol.model.Jogador;
import br.com.futebol.repository.JogadorRepository;

@Controller(value = "/futebol")
public class FutebolController {

	@Autowired
	private JogadorRepository jogadorRepository;
	
	@RequestMapping(value = "/teste", method = RequestMethod.GET)
	public void teste() {
		System.out.println("aaa");
		
		Jogador jogador = new Jogador();
		jogador.setNome("daniel");
		
		
		jogadorRepository.save(jogador);
	}
	@RequestMapping(value = "/teste2", method = RequestMethod.GET)
	@ResponseBody
	public List<Jogador> teste2() {
		System.out.println("bbb");
		
		Jogador jogador = new Jogador();
		jogador.setNome("daniel");
		
		
		return jogadorRepository.findAll();
	}
	
}
