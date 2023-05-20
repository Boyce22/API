package br.com.api.pharmamax.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.api.pharmamax.domain.PharmamaxDomain;


@Repository
public class PharmamaxRepository {
	private static List<PharmamaxDomain> lista = new ArrayList<>();

	public List<PharmamaxDomain> bancoProdutos() {
		if (lista.isEmpty()) {
			lista.add(new PharmamaxDomain(20231010L, "BUDESONIDA", "R$ 40,00", true));
			lista.add(new PharmamaxDomain(20232020L, "CAPTOPRIL", "R$ 30,00", true));
			lista.add(new PharmamaxDomain(20233030L, "HISTAMIN", "R$ 10,00", true));
			lista.add(new PharmamaxDomain(20234040L, "DESLORATADINA ", "R$ 35,00", true));
			lista.add(new PharmamaxDomain(20235050L, "LORATADINA", "R$ 60,00", true));
		}

		return lista;

	}

	public static List<PharmamaxDomain> getLista() {
		return lista;
	}

	public static void setLista(List<PharmamaxDomain> lista) {
		PharmamaxRepository.lista = lista;
	}
	
	
}