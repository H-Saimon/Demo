# Demo

## Descrição

Projeto de demonstração utilizando Spring Boot. Este projeto tem como objetivo apresentar uma aplicação base configurada com as melhores práticas para desenvolvimento de aplicações web com Java e Spring Boot.

## Funcionalidades Principais

- Aplicação web em Spring Boot configurada para desenvolvimento rápido
- Estrutura modular que possibilita fácil expansão e manutenção
- Suporte a testes automatizados
- Configuração padrão para gerenciamento de dependências com Maven

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.3.3
- Maven (gerenciador de dependências e build)

## Como Instalar e Rodar

1. **Pré-requisitos:**
   - Java JDK 17 instalado
   - Maven instalado ou utilizar o wrapper Maven fornecido no projeto

2. **Clonar o repositório:**

   ```bash
   git clone <URL_DO_REPOSITÓRIO>
   cd demo
   ```

3. **Compilar o projeto:**

   Usando Maven instalado:

   ```bash
   mvn clean install
   ```

   Ou usando o wrapper Maven (Linux/macOS):

   ```bash
   ./mvnw clean install
   ```

   Ou no Windows:

   ```bash
   mvnw.cmd clean install
   ```

4. **Executar a aplicação:**

   Com Maven:

   ```bash
   mvn spring-boot:run
   ```

   Ou com wrapper:

   ```bash
   ./mvnw spring-boot:run
   ```

   Ou executar o JAR gerado no diretório `target`:

   ```bash
   java -jar target/demo-0.0.1-SNAPSHOT.jar
   ```

5. **Acessar a aplicação:**

   Por padrão, estará rodando em `http://localhost:8080`

## Estrutura do Projeto

```
├── HELP.md                 # Documento auxiliar com informações adicionais
├── mvnw                    # Wrapper Maven para Linux/macOS
├── mvnw.cmd                # Wrapper Maven para Windows
├── pom.xml                 # Configuração do Maven e dependências do projeto
├── src
│   ├── main
│   │   ├── java            # Código-fonte principal Java
│   │   └── resources       # Configurações e arquivos estáticos
│   └── test                # Testes automatizados
└── target                  # Diretório gerado pelo Maven com artefatos compilados
    └── classes             # Classes compiladas
```

---

Este projeto serve como base para o desenvolvimento de aplicações Spring Boot e pode ser facilmente estendido para atender às necessidades específicas de seu sistema.