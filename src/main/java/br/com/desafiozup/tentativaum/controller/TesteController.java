package br.com.desafiozup.tentativaum.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class TesteController {

	
	@GetMapping
	public String home(Model model) {
		
		return "home";
	}
	
}
