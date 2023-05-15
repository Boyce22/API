package Mentoria.mapping.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class MapaMentoriaController {

	private static int id = 1;
	private Map<Integer, String> NewMapa = new HashMap<>();

	@GetMapping
	public Map<Integer, String> getContent() {
		return NewMapa;
	}

	@PostMapping
	public void adicionarcontent(@RequestBody String content) {
		NewMapa.put(id, content);
		id++;
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		NewMapa.remove(id);
	}

	@PutMapping("/{contador}")
	public void update(@PathVariable Integer id, @RequestBody String content) {
		NewMapa.put(id, content);
	}
}