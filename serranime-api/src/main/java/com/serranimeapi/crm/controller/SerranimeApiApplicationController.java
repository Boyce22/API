package com.serranimeapi.crm.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/teste")
public class SerranimeApiApplicationController {

	private static int contador = 1;
	private Map<Integer, String> db = new HashMap<>();

	@GetMapping
	public Map<Integer, String> getAnime() {
		return db;
	}

	@PostMapping
	public void adicionarConteudo(@RequestBody String conteudo) {
		db.put(contador, conteudo);
		contador++;
	}

	@DeleteMapping("/{contador}")
	public void delete(@PathVariable Integer contador) {
		db.remove(contador);
	}

	@PutMapping("/{contador}")
	public void update(@PathVariable Integer contador, @RequestBody String conteudo) {
		db.put(contador, conteudo);
	}

}
