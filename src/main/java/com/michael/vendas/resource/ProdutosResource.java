package com.michael.vendas.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.michael.vendas.model.Produto;
import com.michael.vendas.repository.Produtos;
//3º pacote criado, tambem poderia ser chamada de serviço ou implementação, para gerar uma nova venda
//2.3º classe criada, tambem poderia ser chamada de controller
@CrossOrigin("*")//poderia colocar a URL da aplicação, por ex: ("http://localhost:4200"), no entando, da forma como deixei permite requisição a partir de um browser pra qualquer URL
@RestController
@RequestMapping("/produtos")
public class ProdutosResource {
	
	@Autowired
	private Produtos produtos;//intanciando o repository de produtos para usar o método antes de usar na linha abaixo 
	
	//criando o método que vai listar todos os produtos da base de dados
	@GetMapping
	public List<Produto> listar(){
		return produtos.findAll();
	}
}
