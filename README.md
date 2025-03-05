# BankSystem

## Descrição

O **BankSystem** é um simulador de conta bancária desenvolvido em **Java com Spring Boot**, que permite realizar operações bancárias básicas, como **depósitos e saques**, aplicando taxas ou rendimentos conforme o tipo da conta.

## Funcionalidades

- Criar uma **conta bancária** informando:

  - Número da conta
  - Nome do titular
  - Saldo inicial
  - Tipo da conta (**Corrente** ou **Poupança**)

- Processamento de **operações bancárias**:

  - Depósito
  - Saque

- Cálculo do **saldo final**:

  - **Conta Corrente**: aplica uma taxa fixa de manutenção de R\$ 15,00 por operação.
  - **Conta Poupança**: aplica um rendimento de **0,5%** sobre o saldo após cada operação.

- Exibição do resultado no log do terminal.

## Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot**
- **Injeção de Dependencias**

## Estrutura do Projeto

```plaintext
BankSystem/
├── src/
│   ├── main/
│   │   ├── java/com/banksystem/
│   │   │   ├── entities/BankAccount.java
│   │   │   ├── entities/SavingsAccount.java
│   │   │   ├── entities/CurrentAccount.java
│   │   │   ├── service/TransactionService.java
│   │   │   ├── service/AccountService.java
│   │   │   ├── enums/AccountType.java
│   │   ├── resources/application.properties
├── pom.xml
└── README.md
```

## Como Executar

1. Clone o repositório:

   ```sh
   git clone https://github.com/Eduardovll/workspace-java-spring-bank-system
   ```

2. Acesse o diretório do projeto:

   ```sh
   cd BankSystem
   ```

3. Compile e execute o projeto:

   ```sh
   mvn spring-boot:run
   ```

4. Verifique os logs no terminal para conferir as operações bancárias simuladas.

## Exemplo de Saída no Terminal

**Exemplo 1** (Conta Corrente, saldo inicial de R\$ 1000, depósito de R\$ 200):

```plaintext
Conta: 777 - Eduardo Valle
Tipo: Poupança
Saldo final: R$ 1206,00
```

**Exemplo 2** (Conta Poupança, saldo inicial de R\$ 1000,00, saque de R\$ 200):

```plaintext
Conta: 777 - Eduardo Valle
Tipo: Corrente
Saldo final: R$ 785,00
```

## Desafio Extra

- Implementação de **transferências entre contas**, garantindo verificação de saldo suficiente antes da operação.

## Contribuição

Sinta-se à vontade para abrir **issues** ou enviar **pull requests** para melhorias.

## Licença

Este projeto é de uso livre para estudos e melhorias.

