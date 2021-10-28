package com.primeiraaplicacaospring.App.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PrimeriaAplicacao {

	@GetMapping("atividade1")
	public String habilidadesMentalidadesGen() {
		String habilidades = "Trabalho em equipe, Atenção aos detalhes, Proatividade e Comunicação.";
		String mentalidades = "Orientação ao futuro, Responsabilidade Pessoal, Mentalidade de Crescimento e Persistência.";
		
		return ("Habilidades: " + habilidades + "\n" + "Mentalidades: " + mentalidades);
	}
	
	@GetMapping("/atividade2")
	public String objetivosSemana() {
		
		return "Aprender o máximo dos conteúdos da semana.";
	}
	
}
