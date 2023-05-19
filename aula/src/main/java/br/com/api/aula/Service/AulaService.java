package br.com.api.aula.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.api.aula.domain.Aluno;

@Service
public class AulaService {

	private List<Aluno> lista = new ArrayList<>();

	public List<Aluno> bancoAluno() {
		if (lista.isEmpty()) {
			lista.add(new Aluno(2023001L, "Ana", "98844-2211", true));
			lista.add(new Aluno(2023002L, "Bernardo", "98844-2211", true));
			lista.add(new Aluno(2023003L, "Caio", "98844-2211", true));
			lista.add(new Aluno(2023004L, "Gabriel", "98844-2211", true));
		}
		return lista;
	}

	public Aluno buscarAluno(Long matricula) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getMatricula().equals(matricula)) {
				return lista.get(i);
			}
		}
		return null;
	}

	public int count() {
		return lista.size();
	}

//	public void deletarAluno (Long matricula) {
//		lista.remove(buscarAluno(matricula));
//	}

	public void deletarAluno(Long matricula) {
		Aluno aluno = buscarAluno(matricula);
		if (aluno.getIsAtivo()) {
			aluno.setIsAtivo(false);
		}
	}

	public Aluno cadastrarAluno(Aluno aluno) {
		if (buscarAluno(aluno.getMatricula()) == null) {
			lista.add(aluno);
			return aluno;
		}
		return null;
	}

	public Aluno atualizarAluno(Aluno alunoAtualizado, Long matricula) {
		Aluno alunoAntigo = buscarAluno(matricula);
		if (alunoAntigo != null) {
			alunoAntigo.setMatricula(alunoAtualizado.getMatricula());
			alunoAntigo.setNome(alunoAtualizado.getNome());
			alunoAntigo.setTelefone(alunoAtualizado.getTelefone());
			alunoAntigo.setIsAtivo(alunoAtualizado.getIsAtivo());
			//salvar o registro atualizado
			
			
			return alunoAntigo;
//			Integer idRecuperado = aluno.id;
//			deletarAluno(matricula);
//			cadastrarAluno(aluno);
//			aluno.setId(idRecuperado);
//			return aluno;
		}
		return null;
	}
}
