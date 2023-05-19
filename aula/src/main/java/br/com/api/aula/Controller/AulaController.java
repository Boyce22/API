package br.com.api.aula.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.aula.Service.AulaService;
import br.com.api.aula.domain.Aluno;

@RestController
@RequestMapping("/alunos")
public class AulaController {

	@Autowired

	AulaService aulaService;

	@GetMapping
	public List<Aluno> listar() {
		return aulaService.bancoAluno();
	}

	@GetMapping("/{matricula}")
	public Aluno buscarAluno(@PathVariable Long matricula) {
		return aulaService.buscarAluno(matricula);
	}

	@GetMapping("/count")
	public int count() {
		return aulaService.count();
	}
	@DeleteMapping("/{matricula}")
	
	public void deletarAluno (@PathVariable Long matricula) {
		aulaService.deletarAluno(matricula);
	}
	
	@PostMapping
	public Aluno cadastrarAluno(@RequestBody Aluno aluno) {
		return aulaService.cadastrarAluno(aluno);
	}
	
	@PutMapping ("/{matricula}") //@PatchMapping
	public Aluno atualizarAluno(@RequestBody Aluno aluno, @PathVariable Long matricula) {
		return aulaService.atualizarAluno(aluno, matricula);
	}
}
