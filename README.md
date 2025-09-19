# Insurance Company WS

Este projeto é um Webservice SOAP desenvolvido em Java, utilizando Spring Boot, JPA e integração com banco de dados relacional. Ele simula operações de apólice de seguros, incluindo clientes, coberturas, pagamentos e sinistros, com endpoints SOAP e estrutura modularizada.

## Sumário
- [Insurance Company WS](#insurance-company-ws)
  - [Sumário](#sumário)
  - [Visão Geral](#visão-geral)
  - [Estrutura do Projeto](#estrutura-do-projeto)
  - [Principais Funcionalidades](#principais-funcionalidades)
  - [Tecnologias Utilizadas](#tecnologias-utilizadas)
  - [Como Executar](#como-executar)
  - [Exemplo de Requisição SOAP](#exemplo-de-requisição-soap)
  - [Testes](#testes)
  - [Contato](#contato)

## Visão Geral
O sistema expõe operações SOAP para manipulação de apólices de seguro, clientes, coberturas, pagamentos e sinistros. O projeto segue boas práticas de arquitetura, separando domínio, infraestrutura, aplicação e apresentação.

## Estrutura do Projeto
```
├── src/main/java/com/webservice/java/ws/webservice/
│   ├── claim/         # Módulo de sinistros
│   ├── core/          # Configurações centrais do webservice
│   ├── coverage/      # Módulo de coberturas
│   ├── customer/      # Módulo de clientes
│   ├── payment/       # Módulo de pagamentos
│   ├── policy/        # Módulo de apólices
│   │   ├── application/service/    # Serviços de aplicação
│   │   ├── domain/entity/          # Entidades de domínio
│   │   ├── infrastructure/repository/ # Repositórios JPA
│   │   └── presentation/http/      # Endpoints SOAP, requests e responses
│   └── util/          # Utilitários (ex: manipulação de headers SOAP)
│
├── src/main/resources/
│   ├── application.properties      # Configurações do Spring Boot
│   └── xsd/policy.xsd              # Esquema XML das operações SOAP
│
├── test/                          # Testes automatizados
├── pom.xml                        # Dependências Maven
├── docker-compose.yml             # (Opcional) Infraestrutura Docker
```

## Principais Funcionalidades
- Cadastro e consulta de apólices de seguro via SOAP
- Gerenciamento de clientes, coberturas, pagamentos e sinistros
- Validação de dados via XSD
- Arquitetura em camadas (apresentação, aplicação, domínio, infraestrutura)
- Integração com banco de dados relacional via JPA

## Tecnologias Utilizadas
- Java 17+
- Spring Boot
- Spring Web Services (SOAP)
- Spring Data JPA
- Jakarta XML Bind (JAXB)
- Maven
- Docker (opcional)

## Como Executar
1. **Pré-requisitos:**
   - Java 17+
   - Maven
   - (Opcional) Docker e Docker Compose

2. **Configuração:**
   - Ajuste o `application.properties` conforme seu ambiente (banco de dados, portas, etc).

3. **Build e execução:**
   ```sh
   mvn clean install
   mvn spring-boot:run
   ```
   Ou via Docker Compose:
   ```sh
   docker-compose up --build
   ```

4. **Acesso ao WSDL:**
   - O endpoint SOAP estará disponível em: `http://localhost:8080/ws/policy.wsdl`

## Exemplo de Requisição SOAP
```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:con="http://controller.webservice.ws.java.webservice.com/">
   <soapenv:Header/>
   <soapenv:Body>
      <con:createPolicyRequest>
         <con:policyNumber>12345</con:policyNumber>
         <con:holderName>João da Silva</con:holderName>
         <con:data>2025-09-15</con:data>
      </con:createPolicyRequest>
   </soapenv:Body>
</soapenv:Envelope>
```

## Testes
- Os testes automatizados estão em `src/test/java/com/webservice/java/ws/webservice/`
- Para rodar os testes:
  ```sh
  mvn test
  ```

## Contato
Dúvidas ou sugestões? Entre em contato com o mantenedor do projeto.
