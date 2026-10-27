# ApiCRUD

API REST para **gerenciamento de usuários**, desenvolvida com Java e Spring Boot para praticar operações CRUD e organização de código em camadas.

## Tecnologias

- Java 21 e Spring Boot 4.1.2
- Spring Web e Spring Data JPA
- Banco de dados H2
- Maven

## Funcionalidades

- Cadastrar, listar, consultar, atualizar e excluir usuários.
- Persistir dados com JPA.
- Tratar erros, como usuário não encontrado (`404`).

## Endpoints

| Método | Rota | Ação |
| --- | --- | --- |
| `POST` | `/user` | Cadastrar usuário |
| `GET` | `/user` | Listar usuários |
| `GET` | `/user/{id}` | Buscar por ID |
| `PUT` | `/user/{id}` | Atualizar usuário |
| `DELETE` | `/user/{id}` | Excluir usuário |

**Exemplo de JSON para cadastro:**

```json
{
  "name": "Maria Silva",
  "login": "mariasilva",
  "password": "senha123"
}
```
