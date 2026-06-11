# Módulo 2 - Desafio Hora Prática

## Descrição
Projeto do Módulo 2 do curso "Java: Aplicando a Orientação a Objetos" da Alura. Este projeto demonstra o uso de encapsulamento em Java, utilizando modificadores de acesso private, getters e setters.

## Estrutura do Projeto
- `Aluno.java` - Classe que representa um aluno com encapsulamento completo
- `ContaBancaria.java` - Classe que representa uma conta bancária com atributos privados
- `IdadePessoa.java` - Classe para verificar maioridade com encapsulamento
- `Livro.java` - Classe que representa um livro com encapsulamento
- `Produto.java` - Classe que representa um produto com método de desconto

## Funcionalidades

### Aluno
- Atributos privados: nome, nota1, nota2, nota3
- Getters e setters para todos os atributos
- Método `calcularMedia()` que retorna a média das três notas

### ContaBancaria
- Atributos privados: numeroConta, saldo
- Atributo público: titular
- Getters e setters para atributos privados

### IdadePessoa
- Atributos privados: nome, idade
- Getters e setters para todos os atributos
- Método `verificarIdade()` que verifica se a pessoa é maior ou menor de idade

### Livro
- Atributos privados: titulo, autor
- Getters e setters para todos os atributos
- Método `exibirDetalhes()` que exibe título e autor usando text blocks

### Produto
- Atributos privados: nome, preco
- Getters e setters para todos os atributos
- Método `aplicarDesconto(int percentual)` que aplica desconto ao preço

## Como Executar
Este projeto não possui uma classe Main. As classes foram criadas para demonstrar o uso de encapsulamento e podem ser instanciadas em qualquer classe principal.

```bash
javac src/*.java
```

## Conceitos Aprendidos
- Encapsulamento com modificadores de acesso private
- Criação de getters e setters
- Proteção de dados internos da classe
- Controle de acesso aos atributos
