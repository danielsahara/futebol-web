package br.com.futebol;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller(value = "/futebol")
public class FutebolController {

	@RequestMapping(value = "/teste", method = RequestMethod.GET)
	public void teste() {
		System.out.println("aaa");
	}
}
