# Lojinha Mobile Automação
Esse é um projeto que contém a automação de alguns testes de Mobile de um software denominado Lojinha. Os sub-tópicos abaixo descrevem algumas decisões tomadas na estruturação do projeto.

## Tecnologias Utilizadas

- [Java](https://www.oracle.com/br/java/technologies/downloads/)
- [JUnit](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.8.0-M1)
- [Appium](https://mvnrepository.com/artifact/io.appium/java-client/7.6.0)
- [Maven](https://maven.apache.org)
- [Android Studio](https://developer.android.com/studio?hl=pt&gclid=Cj0KCQjwnbmaBhD-ARIsAGTPcfX_0M27ypzf2NIAvnAFhBYNl9B-q-lLk3eQXwWjy2O4AmwAwYZUpDUaAghmEALw_wcB&gclsrc=aw.ds)
## Testes Automatizados
Testes para validar as partições de equivalência ao valor do produto da Lojinha, que estão vinculadas a regra de negócio que diz que o valor do produto deve estar entre R$ 0,01 e R$ 7.000,00.

## Notas Gerais
-   Sempre utilizamos a anotação Before Each para capturar o token que será utilizado posteriormente nos métodos de teste.
-   Nesse projeto fazemos uso do JUnit 5, o que nos dá a possibilidade de usar a anotação Display Name para dar descrições em português para nossos testes.