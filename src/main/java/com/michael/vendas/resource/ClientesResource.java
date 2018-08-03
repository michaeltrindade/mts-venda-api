package com.michael.vendas.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.michael.vendas.model.Cliente;
import com.michael.vendas.repository.Clientes;
//3º pacote criado, tambem poderia ser chamada de serviço ou implementação, para gerar uma nova venda
//1.3º classe criada, tambem poderia ser chamada de controller
@CrossOrigin("*")//poderia colocar a URL da aplicação, por ex: ("http://localhost:4200"), no entando, da forma como deixei permite requisição a partir de um browser pra qualquer URL
@RestController
@RequestMapping("/clientes")
public class ClientesResource {
	
	@Autowired
	private Clientes clientes;//intanciando o repository de clientes para usar o método antes de usar na linha abaixo
	
	//criando o método que vai listar todos os clientes da base de dados
	@GetMapping
	public List<Cliente> listar(){
		return clientes.findAll();
	}
	
}
