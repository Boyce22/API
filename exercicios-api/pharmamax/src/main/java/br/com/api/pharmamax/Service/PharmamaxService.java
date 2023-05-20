package br.com.api.pharmamax.Service;

import org.springframework.stereotype.Service;

import br.com.api.pharmamax.Repository.PharmamaxRepository;
import br.com.api.pharmamax.domain.PharmamaxDomain;

@Service
public class PharmamaxService {

	public PharmamaxDomain buscarProduto(Long codigo) {
		for (PharmamaxDomain produto : PharmamaxRepository.getLista()) {
			if (produto.getCodigo().equals(codigo))
				return produto;
		}
		return null;
	}

	public PharmamaxDomain deletarProduto(Long codigo) {
		for (PharmamaxDomain produto : PharmamaxRepository.getLista()) {
			if (produto.getCodigo().equals(codigo)) {
				produto.setIsAtivo(false);
			}
		}
		return null;
	}

	public PharmamaxDomain atualizarProduto(Long codigo, String produto, String valor) {
		PharmamaxDomain produtoAntigo = buscarProduto(codigo);
		if (produtoAntigo != null) {
			produtoAntigo.setProduto(produto);
			produtoAntigo.setValor(valor);
		}
		return produtoAntigo;
	}

	public PharmamaxDomain cadastrarProduto(PharmamaxDomain produto) {
		if (buscarProduto(produto.getCodigo()) == null) {
			PharmamaxRepository.getLista().add(produto);
			return produto;
		}
		return null;
	}

}
