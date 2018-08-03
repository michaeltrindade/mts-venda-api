package com.michael.vendas.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//1º pacote criado, tambem poderia ser chamada de serviço ou implementação, para gerar uma nova venda
@Entity//2.1º classe criada, estou dizendo que esta classe é uma entidade no banco de dados
public class Produto {

	@Id//estou definindo meu identificador da chave primaria no banco de dados
	@GeneratedValue(strategy = GenerationType.IDENTITY)//o banco irá gerar a chave primaria
	private long id;
	private String nome;
	private BigDecimal valor;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
