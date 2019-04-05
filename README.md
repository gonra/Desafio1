#Processo de Seleção Desenvolvedor Full-Stack Neomind 2019
---------------------------------------------------------

## Desafio1
Desenvolveu-se um projeto JavaEE consistente num webservice em REST usando gradle e que suporta :

- consulta por ID
- lista paginada
- criação
- edição 
- eliminação 

de registros armazenados em banco de dados. Usou-se banco de dados HSQLDB que funciona no runtime do webserver,
e nao requer instalaçao, sendo a estrutura da tabela gerada na inicializaçao do Webservlet. A estrutura entregada :

    {"id": 1, "name": "fornec lorimospm", "email": "fornec@loripsom", "comment": "loreipsum", "cnpj": "00.000/0000-00"}

Para a funçao logica usa-se Hibernate/JPA com classes geradas por ferramenta modificados para caso.

Para rodar o programa 

   gradle appRun

Ficando acessivel na url [http://localhost:8080/desafio1/]: http://localhost:8080/desafio1/ ""

## Desafio2

De forma conjunta com a parte previa programou-se a interface com Bootstrap CSS e AngularJS usando estrategia de pagina 
unica, com as funçoes de criaçao e modificaçao usando formularios modais, e quadro de dialogo para eliminaçao de registros.

Ficando disponivel na url [http://localhost:8080/desafio1/desafio2.html]: http://localhost:8080/desafio1/desafio2.html ""

Requer ter acesso a conexao de internet por incluir Bootstrap CSS/JS, AngularJS, JQuery e Popper.js desde os sites originais.