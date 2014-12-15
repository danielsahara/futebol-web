package br.com.futebol.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.futebol.model.Jogador;
import br.com.futebol.repository.JogadorRepository;

@Controller
public class JogadorController {
	
	@Autowired
	private JogadorRepository jogadorRepository;

	@RequestMapping(value = "/jogador", method = RequestMethod.GET)
	public void form() {

	}

	@RequestMapping(value = "/jogador", method = RequestMethod.POST)
	public String save(Jogador jogador) {
		jogadorRepository.save(jogador);
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/jogador/all", method = RequestMethod.GET)
	@ResponseBody
	public List<Jogador> list() {
		return jogadorRepository.findAll();
	}
}
