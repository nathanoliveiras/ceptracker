# 📦 CEP Tracker API

API REST para consulta de CEP utilizando serviço externo, com persistência de histórico de consultas.

---

## 🚀 Tecnologias utilizadas

* Java 17
* Spring Boot
* Spring Data JPA
* PostgreSQL
* Docker / Docker Compose
* Swagger (OpenAPI)

---

## 📌 Funcionalidades

* 🔍 Consulta de CEP via API externa
* 💾 Persistência do histórico de consultas
* 📜 Listagem de logs de consultas realizadas
* 📖 Documentação interativa com Swagger

---

## ⚙️ Como executar o projeto

### 🔧 Pré-requisitos

* Java 17+
* Maven
* Docker e Docker Compose

---

A aplicação estará disponível em:

```
http://localhost:8080
```

---

### ▶️ Executando localmente

1. Suba o banco de dados:

```bash
docker compose up -d
```

2. Execute a aplicação:

```bash
mvn clean install
mvn spring-boot:run
```

---

## 📚 Documentação da API

Swagger disponível em:

```
http://localhost:8080/swagger-ui/index.html
```

---

## 🔎 Endpoints principais

### 📍 Buscar CEP

```
GET /api/ceps/{cep}
```

#### Exemplo:

```
GET /api/ceps/01001000
```

---

### 📜 Listar histórico de consultas

```
GET /api/ceps/logs
```

---

## 🗄️ Banco de dados

* PostgreSQL
* Banco: `cepdb`
* Usuário: `postgres`
* Senha: `postgres`

---

## 🐳 Docker

O projeto utiliza Docker para:

* Subir banco PostgreSQL
* Facilitar execução e portabilidade

---

## 🧠 Arquitetura

O projeto segue separação de responsabilidades:

* **Controller** → camada de entrada (API REST)
* **Service** → regras de negócio
* **Client** → consumo de API externa
* **Repository** → persistência no banco

---

## 👨‍💻 Autor

Desenvolvido por Nathan Santos

