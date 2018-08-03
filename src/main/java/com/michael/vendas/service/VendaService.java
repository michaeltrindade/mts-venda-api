package com.michael.vendas.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michael.vendas.model.Venda;
import com.michael.vendas.repository.Produtos;
import com.michael.vendas.repository.Vendas;

//4º pacote criado regras de negócios, tambem poderia ser chamada de serviço ou implementação, para gerar uma nova venda
//1º classe criada, tambem poderia ser chamada de regras de negócios
@Service
public class VendaService {
	
	@Autowired
	private Vendas vendas;
	
	@Autowired
	private Produtos produtos;
	
	public Venda adicionar(Venda venda) {
		venda.setCadastro(LocalDateTime.now());//setando a data de cadastro
		//configurando a venda dentro de cada item
		//para cada item eu recebo  dentro do parametro no lambda "forEach(i ->"
		venda.getItens().forEach(i ->{
			i.setVenda(venda);//setando venda
			i.setProduto(produtos.findById(i.getProduto().getId()).get());//setando o produto, quando o produto for enviado eu utilizar no calculo do total, o valor do produto e vou pegar esse valor atualizado dentro do banco de dados
		});
		//aqui abaixo será feito o calculo do total
		BigDecimal totalItens = venda.getItens().stream()
				//aqui estou transformando uma lista "venda.getItens", em uma lista de bigdecimal para depois utilizar o metodo reduce para somar todos esses itens
				//ou seja vou pegar o valor do produto e multiplicar pela quantidade
				.map(i -> i.getProduto().getValor().multiply(new BigDecimal(i.getQuantidade())))
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		
		venda.setTotal(totalItens.add(venda.getFrete()));
		//salvando e retornando
		return vendas.save(venda);
		
		//agora eu volto para a "classe VendasResource" para criar o método "adicionar"
	}
}
