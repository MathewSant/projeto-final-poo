# 🌿 Hera API — Projeto de POO (Grupo 11)

API desenvolvida para a disciplina de Programação Orientada a Objetos (POO), utilizando **Java + Spring Boot**, com foco em boas práticas, arquitetura em camadas (MVC) e operações CRUD completas.

## 🎯 Objetivo

A aplicação tem como objetivo o gerenciamento de produtos e componentes do setor agroecológico, utilizando um backend robusto com separação clara entre camadas `model`, `repository`, `service` e `controller`.

---

## 📦 Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database (ou MySQL)
- Lombok
- Swagger / Postman (para testes)

---

## 🧱 Estrutura do Projeto

O projeto segue o padrão MVC com os seguintes pacotes principais:

com.hera
┣ model
┣ repository
┣ service
┗ controller



---

## 👥 Integrantes do Grupo 11

| Nome               | Entidade Responsável     |
|--------------------|---------------------------|
| Mateus Santiago   | Produto                   |
| [Integrante 2]     | Cliente                   |
| [Integrante 3]     | Pedido                    |
| [Integrante 4]     | Fornecedor                |
| [Integrante 5]     | ItemPedido                |

---

## 🔗 Endpoints Principais (exemplo - Produto)

| Método | Rota                     | Descrição                     |
|--------|--------------------------|-------------------------------|
| GET    | `/produtos`              | Listar todos os produtos      |
| GET    | `/produtos/{id}`         | Buscar produto por ID         |
| POST   | `/produtos`              | Criar novo produto            |
| PUT    | `/produtos/{id}`         | Atualizar produto existente   |
| DELETE | `/produtos/{id}`         | Deletar produto               |
| GET    | `/produtos/categoria/{categoria}` | Filtrar por categoria |

> 💡 As demais entidades seguem o mesmo padrão de rotas RESTful.

---

## ▶️ Como executar o projeto

1. Clone este repositório:
   ```bash
   git clone https://github.com/sin-disciplina-poo/projeto-poo-pi-grupo-11.git

    Importe no seu IDE (IntelliJ / Eclipse / VSCode com suporte Maven)

    Execute a aplicação via Spring Boot (main do projeto)

    Acesse no navegador:

        API Swagger (se disponível): http://localhost:8080/swagger-ui.html

        Ou teste via Postman

## ✅ Status das Entidades

Produto

Cliente

Pedido

Fornecedor

    ItemPedido

##  📅 Entrega

    Data limite: 11/06/2025

    Apresentação: 12/06/2025

## 📌 Observações

    Cada integrante é responsável por uma entidade completa (model, repository, service, controller)

    A aplicação deverá estar funcional e testada

    Cada commit no repositório deve indicar o autor e a entidade correspondente

    Este projeto faz parte da disciplina de Programação Orientada a Objetos — Curso de Sistemas de Informação — Universidade Católica de Pernambuco.