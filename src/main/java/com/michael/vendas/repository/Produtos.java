package com.michael.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michael.vendas.model.Produto;
//2º pacote criado, tambem poderia ser chamada de serviço ou implementação, para gerar uma nova venda
//2.2º "classe" interface criada, este pacote tambem pode ser chamado de DAO
public interface Produtos extends JpaRepository<Produto, Long> {

}
