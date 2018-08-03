package com.michael.vendas.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.michael.vendas.model.Venda;
import com.michael.vendas.repository.Vendas;
import com.michael.vendas.service.VendaService;
//3º pacote criado, tambem poderia ser chamada de serviço ou implementação, para gerar uma nova venda
//4.3º classe criada, tambem poderia ser chamada de controller
@CrossOrigin("*")//poderia colocar a URL da aplicação, por ex: ("http://localhost:4200"), no entando, da forma como deixei permite requisição a partir de um browser pra qualquer URL
@RestController
@RequestMapping("/vendas")
public class VendasResource {
	
	@Autowired
	private Vendas vendas;//intanciando o repository de vendas para usar o método antes de usar na linha abaixo
	
	@Autowired
	private VendaService vendaService;
	//criando o método que vai listar todos os vendas da base de dados
	@GetMapping
	public List<Venda> listar(){
		return vendas.findAll();
	}
	@PostMapping
	private Venda adicionar(@RequestBody @Valid Venda venda) {
		return vendaService.adicionar(venda);
	}
}
