package org.generation.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hallo")
public class BSMGen {
	
	@GetMapping
	public String hallo() {
		return "BSM's Generation: Persistencia e Orientação aos detalhes!";
	}

}
