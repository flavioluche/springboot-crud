package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@RestController
//Com a anotação Restcontroller, a anotação controller não precisa mais ser usada e ela substitui também a anotação ResponseBody para todos os
// métodos de exposição dos endpoints.
public class TopicoController {

	@RequestMapping("/topicos")
	public List<Topico> lista() {
		Topico topico = new Topico("Dúvida", "Duvida com Spring", new Curso("Spring", "Programação"));
		
		return Arrays.asList(topico, topico, topico);
	}
}
