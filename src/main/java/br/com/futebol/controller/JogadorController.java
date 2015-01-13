package br.com.futebol.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.com.futebol.model.Jogador;
import br.com.futebol.repository.JogadorRepository;

@Controller
public class JogadorController {
	
	@Autowired
	private JogadorRepository jogadorRepository;

	@RequestMapping(value = "/jogador", method = RequestMethod.GET)
	public ModelAndView form() {
		ModelAndView mav = new ModelAndView("jogador/form");
		return mav;
	}

	@RequestMapping(value = "/jogador", method = RequestMethod.POST)
	public String save(@Valid Jogador jogador, BindingResult bindingResult, Model model) {
		 if (bindingResult.hasErrors()) {
			 model.addAttribute(jogador);
			 return "jogador/form";
		 }
		 jogadorRepository.save(jogador);
		 
		 model.addAttribute("mensagem", new String("Atleta cadastrado com sucesso!"));
		 jogador = new Jogador();
		 model.addAttribute(jogador);
		 return "jogador/form";
	}
	
	@RequestMapping(value = "/jogador/listar", method = RequestMethod.GET)
	public ModelAndView listar() {
		ModelAndView mav = new ModelAndView("jogador/listar");
		return mav;
	}
	
	@RequestMapping(value = "/jogador/all", method = RequestMethod.GET)
	@ResponseBody
	public List<Jogador> list() {
		return jogadorRepository.findAll(new Sort(Sort.Direction.ASC, "nome"));
	}
}
