# mts-vendas-api
Como executar a aplicação
Certifique-se de ter o Spring Tool Suite instalado , assim como o Git.
```
git clone https://github.com/michaeltrindade/mts-vendas-api

# Importando o projeto no Spring Tool Suite (STS)
Com STS aberto, importe o projeto como projeto Maven, File --> Import --> Maven --> Projeto Maven Existente
Acesse http://localhost:8080/usuarios
```
APIs endpoints
GET http://localhost:8080/vendas [lista todas as vendas]
GET http://localhost:8080/vendas/{id} [lista uma venda por ID]
POST http://localhost:8080/vendas [cadastrar uma nova venda]
PUT http://localhost:8080/vendas/{id} [atualiza os dados de uma venda]
DELETE http://localhost:8080/vendas/{id} [remove uma venda por ID]
