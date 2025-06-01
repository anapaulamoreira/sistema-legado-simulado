# Sistema Legado Simulado

Este projeto é uma aplicação Java Spring Boot que serve como base para integração com sistemas legados. Ele fornece uma estrutura simples para expor endpoints REST, realizar processamento de dados e retornar respostas customizadas.

## Estrutura do Projeto

- `src/main/java/com/example/legado/`  
  - `LegadoApplication.java`: Classe principal da aplicação Spring Boot.
  - `controller/SistemaLegadoController.java`: Controlador REST responsável por expor os endpoints.
  - `service/SistemaLegadoService.java`: Camada de serviço com a lógica de negócio.
  - `model/DadoResponse.java`: Modelo de dados utilizado nas respostas da API.
- `src/main/resources/application.properties`: Configurações da aplicação.
- `src/test/java/com/example/legado/LegadoApplicationTests.java`: Testes automatizados.

## Como Executar

1. Certifique-se de ter o Java 17+ e o Maven instalados.
2. No terminal, execute:

   ```bash
   ./mvnw spring-boot:run
   ```
   ou, no Windows:
   ```cmd
   mvnw.cmd spring-boot:run
   ```

3. A aplicação estará disponível em `http://localhost:8080`.

## Endpoints

Consulte o controlador `SistemaLegadoController` para detalhes dos endpoints disponíveis.

## Testes

Para rodar os testes automatizados:

```bash
./mvnw test
```
