package br.com.api.pharmamax.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.pharmamax.Repository.PharmamaxRepository;
import br.com.api.pharmamax.Service.PharmamaxService;
import br.com.api.pharmamax.domain.PharmamaxDomain;

@RestController
@RequestMapping("/pharma")
public class PharmamaxController {

	@Autowired
	PharmamaxService pharmamaxService;
	@Autowired
	PharmamaxRepository pharmamaxRepository;

	// LISTAR PRODUTOS DA LOJA
	// http://localhost:8080/pharma/produtos
	@GetMapping("/produtos")
	public List<PharmamaxDomain> listaProdutos() {
		return pharmamaxRepository.bancoProdutos();
	}

	// BUSCAR PRODUTO POR CODIGO
	// http://localhost:8080/pharma/{codigo}
	@GetMapping("/{codigo}")
	public PharmamaxDomain buscarProduto(@PathVariable Long codigo) {
		return pharmamaxService.buscarProduto(codigo);
	}

	// ATUALIZAR NOME E VALOR DO PRODUTO
	// http://localhost:8080/pharma/atualizar/{codigo}
	@PutMapping("/atualizar/{codigo}")
	public PharmamaxDomain atualizarProduto(@PathVariable(value = "codigo") Long codigo,
			@RequestParam(value = "produto") String produto, @RequestParam(value = "valor") String valor) {
		return pharmamaxService.atualizarProduto(codigo, produto, valor);
	}

	// DELETAR PRODUTO USANDO O CODIGO DO MESMO
	// http://localhost:8080/pharma/deletar/{codigo}
	@DeleteMapping("/deletar/{codigo}")
	public PharmamaxDomain deletarProduto(@PathVariable Long codigo) {
		return pharmamaxService.deletarProduto(codigo);
	}

	// ADICIONAR PRODUTO NO BANCO DE PRODUTOS
	// http://localhost:8080/pharma/adicionar/
	@PostMapping("/adicionar")
	public PharmamaxDomain cadastrarProduto(@RequestBody PharmamaxDomain produto) {
		return pharmamaxService.cadastrarProduto(produto);
	}
}