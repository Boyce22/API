package aulaum.projeto.calculadora.api.Controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // anotação de start do controller
@RequestMapping("/calc") // anotação utilizada para mapear
public class CalculadorController {

	@GetMapping("/soma/") // anotação que indica o verbo HTTP da requisição
	public Integer somar(@RequestParam Integer valor, @RequestParam Integer valor2) {
		return valor + valor2;
	}

	@GetMapping("/sub/{valor}/{valor2}") // anotação que indica o verbo HTTP da requisição
	public Integer somar2(@PathVariable Integer valor, @PathVariable Integer valor2) {
//		return Integer.parseInt(valor) - Integer.parseInt(valor);
		return valor - valor2;
	}

	@PutMapping("/multi/") // anotação que indica o verbo HTTP da requisição
	public Integer multi(@RequestBody Map<String, Integer> valores) {
		Integer valor = valores.get("valor");
		Integer valor2 = valores.get("valor2");
		return valor * valor2;
	}

}