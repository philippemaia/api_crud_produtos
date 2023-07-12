# API de Autenticação CRUD de Produtos

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![SpringBoot](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=springboot&logoColor=white)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-black?style=for-the-badge&logo=JSON%20web%20tokens)

O projeto é usado pelas seguintes tecnologias **Java 17, Maven, Spring Boot 3, Spring Security, JPA, Hibernate, PostgresSQL, Flyway Migrations e JWT.**

## Configuração de Ambiente

1. Clonar o repositório com o seguinte comando abaixo:

```bash
git clone https://github.com/philippemaia/api_crud_produtos.git
```

2. Instalar as dependências do maven no arquivo pom.xml

3. Instalar o banco de dados [PostgresSQL](https://www.postgresql.org/) as tabelas são gerenciadas através de Flyway Migrations.

## Uso da API

Iniciar a aplicação com Maven e a API poderá ser acessada pela url http://localhost:8080

## Endpoints da API
A API possui os seguintes endpoints abiaxo:

```markdown
GET /produtos - Retorna uma lista de produtos. (Todos os usuários acessa este recurso desde que esteja logado).

GET /produtos/{id} - Busca apenas um produto através do id. (Todos os usuários acessa este recurso desde que esteja logado).

POST /produtos - Cadastra um novo produto. (Somente os usuários com o perfil ADMIN acessa este recurso desde que esteja logado).

PUT /produtos - Atualiza um produto. (Somente os usuários com o perfil ADMIN acessa este recurso desde que esteja logado).

DELETE /produtos/{id} - Deleta um produto através do id. (Somente os usuários com o perfil ADMIN acessa este recurso desde que esteja logado).

POST /auth/login - Loga um usuário na aplicação.

POST /auth/register - Cadastra um novo usuário com o perfil ADMIN(Administrador) ou USER(Usuário) na aplicação.
```

## Autenticação 
A API usa o Spring Security com JWT para controle de autenticação, os seguintes perfis estão disponíveis abaixo:

```
USER -> Perfil usuário tem apenas acesso de buscar um produto e listar produtos.
ADMIN -> Perfil administrador além de buscar um produto e listar produtos tem também o privilégio de cadastrar, atualizar e deletar um produto.
```
