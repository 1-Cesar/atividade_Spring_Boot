package com.generation.devSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

	@GetMapping("/hello world")
	public String atividade1() {
		return "mentalidade de crescimento, orientação para o futuro,"
				+ "persistência, proatividade";
	}
	
	@GetMapping("/objetivos")
	public String atividade2() {
		return "desenvolvimento constânte, geração de valor, aprofundar meu conhecimento"
				+ "conseguir certificações na linguagem, sistemas completos";
	}
}
