package org.generation.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hallo")

public class ObjetivosSemana {
	
	@GetMapping
	public String hallo() {
		return "Objetivos da semana:Desenvolver aplicações em MYSQL e Spring";
	}

}
