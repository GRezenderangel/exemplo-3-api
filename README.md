# Exemplo 3

Instalar:

- Java 17
- Maven 3.9.4

----
- Spring Boot 3.1.4
- Spring Security 

## Executar test

```sheel
mvn clean test
```

## Executar projeto
```sheel
mvn clean spring-boot:run 
```
acessar:
- http://localhost:8080/swagger-ui/index.html


## Banco de dados

Utilizado Flyway para fazer a migração do banco, arquivos ficam em `src/main/resources/db/migration`

No arquivo `src/main/resources/application.yml` estão as configurações de conexão.
Que no momento estão usando um banco H2 em memória para desenvolvimento.

Neste mesmo aquivo tem as configs para utilizar o banco `PostgreSQL`, basta trocar as linhas comentadas. Existe um `docker-compose` na raiz do projeto para subir o banco, bastando apenas criar o database após iniciar.

## Docker

Para utilizar docker, já existe o arquivo pronto em `deploy/Dockerfile`
