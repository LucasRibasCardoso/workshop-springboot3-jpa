# Workshop WS
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/LucasRibasCardoso/workshop-springboot3-jpa/blob/main/LICENSE) 

# Sobre o projeto
Workshop WS é um Web Service desenvolvido como parte do curso de Java da DevSuperior, com foco na aplicação de boas práticas de Clean Code. O projeto tem como objetivo simular a gestão de um workshop, permitindo o gerenciamento de pedidos, produtos, clientes e categorias, proporcionando uma experiência prática na criação de uma aplicação RESTful robusta e escalável.

Durante o desenvolvimento, buscou-se seguir princípios como legibilidade, simplicidade e organização, para garantir que o código seja fácil de entender e manter.

## Funcionalidades
- Gerenciamento de Pedidos: Listar todos os produtos e listar por ID.
- Gerenciamento de Produtos: Listar todos os produtos e listar por ID.
- Gerenciamento de Clientes: Registro, listagem e exclusão de clientes.
- Gerenciamento de Categorias: Listar todas as categorias e listar por ID.

## Diagrama de Classes
O diagrama abaixo representa as entidades e relacionamentos principais do sistema, incluindo Clientes, Pedidos, Produtos, Categorias e Pagamento.
![Diagrama](https://github.com/LucasRibasCardoso/workshop-springboot3-jpa/blob/main/assets/DiagramaDeClasses.png)

## Arquitetura utilizada  
![Arquitetura](https://github.com/LucasRibasCardoso/workshop-springboot3-jpa/blob/main/assets/Arquitetura.png)
Este projeto segue a separação de camadas de acordo com a seguinte estrutura:

- Resource: Camada responsável por expor as APIs REST e lidar com as requisições HTTP.
- Service: Camada que contém a lógica de negócio da aplicação.
- Repository: Camada que faz a comunicação com o banco de dados utilizando JPA/Hibernate para persistência dos dados.

# Tecnologias utilizadas
- Java: Linguagem principal para o desenvolvimento.
- Spring Boot: Framework para criação rápida e eficiente de aplicações baseadas em Spring.
- Spring Data JPA / Hibernate: Para mapeamento objeto-relacional (ORM) e manipulação dos dados.
- H2 Database: Banco de dados em memória para desenvolvimento e testes rápidos.
- Maven: Gerenciamento de dependências e build.
- Postman: Ferramenta para testes de envio e retorno de requisições.

# Autor
Lucas Ribas Cardoso

www.linkedin.com/in/lucasribascardoso

