# Sistema Legado Simulado

Este projeto é uma aplicação Java Spring Boot que simula o comportamento de um sistema legado para fins de experimentação, testes de integração e análise de estratégias de resiliência em arquiteturas modernas.

## Objetivo

O sistema legado simulado foi desenvolvido para servir como backend de referência para o projeto BFF SLS, permitindo a avaliação de técnicas como circuit breaker, retry, fallback, caching, paralelização e comunicação assíncrona. Os endpoints simulam diferentes cenários de resposta, como dados lentos, instáveis e normais, além de permitir testes de carga e tolerância a falhas.

## Estrutura do Projeto

- **src/main/java/com/example/legado/**
  - `LegadoApplication.java`: Classe principal da aplicação.
  - `controller/SistemaLegadoController.java`: Controlador REST que expõe os endpoints simulados.
  - `service/SistemaLegadoService.java`: Lógica de negócio e simulação de comportamento dos serviços legados.
  - `model/DadoResponse.java`: Modelo de dados das respostas da API.
- **src/main/resources/application.properties**: Configurações da aplicação (porta, etc).
- **src/test/java/com/example/legado/LegadoApplicationTests.java**: Testes automatizados.

## Como Executar

1. Certifique-se de ter Java 17+ e Maven instalados.
2. Execute o comando:

   ```bash
   ./mvnw spring-boot:run
   ```
   ou, no Windows:
   ```cmd
   mvnw.cmd spring-boot:run
   ```

3. A aplicação estará disponível em `http://localhost:8080`.

## Endpoints Simulados

Os principais endpoints disponíveis simulam diferentes comportamentos:

- `/legacy/slow-data`: Retorna dados com atraso proposital (simula lentidão).
- `/legacy/unstable-data`: Retorna dados com possibilidade de erro (simula instabilidade).
- `/legacy/normal-data`: Retorna dados normalmente.
- `/legacy/api/data`: Retorna um dado único.

Consulte o arquivo `SistemaLegadoController.java` para detalhes e parâmetros de cada endpoint.

## Testes

Para rodar os testes automatizados:

```bash
./mvnw test
```

---

Projeto desenvolvido para fins acadêmicos e experimentais, como apoio ao projeto BFF SLS.
