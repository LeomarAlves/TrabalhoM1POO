# Sistema de Gestão de Indústria - Trabalho M1 POO

Este projeto foi desenvolvido como parte da disciplina de Programação Orientada a Objetos. Ele consiste em um sistema simples de gestão para uma indústria, permitindo o cadastro e gerenciamento de pessoas, fornecedores e diferentes tipos de funcionários (Operários e Vendedores).

## 🚀 Funcionalidades

- **Cadastro de Fornecedores:** Registro de nome, telefone, crédito e dívida.
- **Cadastro de Funcionários:** 
  - **Operário:** Registro com cálculo de salário base, impostos e horas extras.
  - **Vendedor:** Registro com cálculo de salário base, impostos e comissões sobre vendas.
- **Listagem de Cadastros:** Exibição de todas as pessoas cadastradas no sistema.
- **Folha de Pagamento:** Cálculo automático do salário líquido de todos os funcionários (Empregados) cadastrados.

## 🏗️ Estrutura do Código

O projeto utiliza os conceitos fundamentais de POO, como Herança, Polimorfismo e Classes Abstratas.

### Hierarquia de Classes

1.  **Pessoa (Abstract):** Classe base que contém os atributos comuns: `nome` e `telefone`. Possui um contador estático para rastrear o número total de cadastros.
2.  **Fornecedor (extends Pessoa):** Adiciona atributos de `valorCredito` e `valorDivida`.
3.  **Empregado (Abstract, extends Pessoa):** Classe base para funcionários, adicionando `codigoSetor`, `salarioBase` e `imposto`. Define o método `calcularSalario()`.
4.  **Operario (extends Empregado):** Especialização de Empregado que inclui `valorHoraExtra` e `horasExtras` no cálculo salarial.
5.  **Vendedor (extends Empregado):** Especialização de Empregado que inclui `valorVendas` e `comissao` no cálculo salarial.

### Classe Main

A classe `Main` fornece uma interface de linha de comando (CLI) interativa para:
- Incluir novos fornecedores.
- Incluir novos funcionários (escolhendo entre Operário ou Vendedor).
- Listar todos os cadastros realizados.
- Exibir a folha de pagamento processada.

## 🛠️ Como Executar

1. Certifique-se de ter o Java JDK instalado em sua máquina.
2. Compile os arquivos fonte:
   ```bash
   javac src/*.java -d out/
   ```
3. Execute a aplicação:
   ```bash
   java -cp out/ Main
   ```


