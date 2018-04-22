Projeto Loja Virtual (Livraria)
Projeto de loja virtual de uma livraria que consiste em telas de cadastro de cliente, fornecedor e livros.
onde pode-se cadastrar o cliente com a foto, nome endereço, telefone, sexo cpf, cidade e estado e numero de telefone e sexo, profissão.
cadastro do fornecedor com os dados de foto razão social ,nome fantasia,endereço,telefone cnpj,inscriçao estadual,cidade e estado.
cadastro de livro, onde a foto do livro,titulo,autores,descriçao resumida, isnb, ano, páginas, fornecedor, preço.
A tela inicial de login onde o usuario é admin e a senha é 123, para se ter acesso as páginas.
A um menu vetical a esquerda da tela com as opções de clientes , fornecedores e livros.
Só clicar no ícone "NOVO+" para abrir a tela de cadastro.
para editar e excluir é so voltar na tela de listagem e escolher as opções na tabela.
e isso serve para todas as telas.

como configurar:
este desafio foi feito em eclipse neon,utilizando java 1.8 e o servidor tomcat 8.5, e plugin angular IDE e angular 1.2 do eclipse
é so ter estas ferramentas e exportar o projeto e rodar , configurar o project facets(uma opção de menu de configuração do eclipse) para Dynamic Web, Java.
Só subir a aplicação.
Organização do projeto.
pacotes curso.angular.controller(esta com este nome pois foi o projeto final do meu curso de angular e spring), o qual contem as classes controllerdo spring boot
pacote angular.dao o qual contem os daos genericos do hibrnate.
pacote angular.filter o qual contem a configurações OpenSessionLnView.
angular.Hibernate onde contem o session do Hibernate.
angular.model onde contem as minhas classes de objeto em java
e o pacote teste onde foram feito os testes com o metodo junit.

 E o web Content onde estão as pastas do front-end cliente fornecedor, livro,loja, e os arquivos dockerfile.
 e a pasta resource , que estão os arquivo do angular js, json, configurações do bootstrap e etc.
 Tecnologias Usadas no Back-end:
 Java 1.8, framework hibernate(jpa), framework spring boot e spring security.
 Tecnologias Usadas no Front-End:
 Angular js, html, javascript,json,bootstrap,themify(tecnologia spring boot)
 e arquivo app.js na pasta js onde estão configurados os modulos e rotas da aplicação.
 
 Banco de dados:
 PostGreSql para armazenamento de dados, ide pgAdmin III, a também documentos sql no projeto para inserir elementos direto para o banco.
 
 
 







