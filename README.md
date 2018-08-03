mts-vendas-api
# Como executar a aplicação
Certifique-se de ter o Spring Tool Suite instalado , assim como o Git.
```
git clone https://github.com/michaeltrindade/mts-vendas-api

# Importando o projeto no STS
No STS aberto, importe o projeto como projeto Maven, File --> Import --> Maven --> Projeto Maven Existente -->
```
Acesse http://localhost:8080/vendas
Utilize o usuário "user" e a senha que é impressa no terminal do STS ao executar a aplicação para autenticar.

# APIs endpoints
GET http://localhost:8080/vendas [lista todos os vendas]  
GET http://localhost:8080/vendas/{id} [lista um vendas por ID]  
POST http://localhost:8080/vendas [cadastra um novo vendas]  
PUT http://localhost:8080/vendas/{id} [atualiza os dados de um vendas]  
DELETE http://localhost:8080/vendas/{id} [remove um vendas por ID]
