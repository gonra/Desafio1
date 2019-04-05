#Processo de Seleção Desenvolvedor Full-Stack Neomind 2019
---------------------------------------------------------

## Desafio1
Desenvolveu-se um projeto JavaEE consistente num webservice JSON usando gradle e que suporta :

- consulta por ID
- lista paginada
- criação
- edição 
- eliminação 

dos registros armazenados no banco de dados. Usou-se banco de dados HSQLDB que funciona no runtime do webserver, portanto não requer instalação, sendo a estrutura da tabela gerada na inicialização do Webservlet. A estrutura corresponde com os dados entregados :

    {"id": 1, "name": "fornec lorimospm", "email": "fornec@loripsom", "comment": "loreipsum", "cnpj": "00.000/0000-00"}

Para a função logica usa-se Hibernate/JPA.

Para rodar o programa se requer Java 1.8 e gradle. 
Para efetuar compilaçao e execuçao basta usar o comando:

  $ gradle appRun

Ficando acessivel na url [http://localhost:8080/desafio1/]
Funçoes disponibizadas 

Funçao          | method | url        | parametro  | resultado
----------------|--------|------------|------------|-----------
registro id     |   get  | `id?id=1`  | id: indice | `{"id","name","email","comment","cnpj"}`
numero total    |   get  | `count `   | -          | `{"count":5}`
lista paginada  |   get  | `list?p=0` | p: #pagina | `[{fornecedor1},{fornecedor2}, ..,{fornecedor10}]`
adicionar registro| post | `add   `   |`{"name","email","comment","cnpj"}` | `{"OK":#registro}`
editar registro |   post | `update`   |`{"id","name","email","comment","cnpj"}` | `{"OK":#registro}`
eliminar registro|  post | `delete`   |`{"id":1}`    | `{"OK":#registro}`


## Desafio2

De forma conjunta com a parte previa programou-se a interface com Bootstrap CSS e AngularJS usando estrategia de pagina 
unica, com as funções de criação e modificação usando formularios modais, e quadro de dialogo para eliminação de registros.

Ficando disponivel na url [http://localhost:8080/desafio1/desafio2.html]

Requer ter acesso a conexao de internet por incluir Bootstrap CSS/JS, AngularJS, JQuery e Popper.js desde os sites originais.
