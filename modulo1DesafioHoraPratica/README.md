# Módulo 1 - Desafio Hora Prática

## Descrição
Projeto do Módulo 1 do curso "Java: Aplicando a Orientação a Objetos" da Alura. Este projeto demonstra conceitos básicos de orientação a objetos em Java, incluindo criação de classes, atributos e métodos.

## Estrutura do Projeto
- `Aluno.java` - Classe que representa um aluno com nome e idade
- `Calculadora.java` - Classe com método para calcular o dobro de um número
- `Musica.java` - Classe que representa uma música com título, artista, ano de lançamento e sistema de avaliações
- `Pessoa.java` - Classe simples com método de saudação
- `Main.java` - Classe principal para testar as funcionalidades

## Funcionalidades

### Aluno
- Armazena nome e idade do aluno
- Método `exibirInfo()` para exibir informações do aluno

### Calculadora
- Método `dobroNum(double numero)` que retorna o dobro do número informado

### Musica
- Armazena título, artista, ano de lançamento, avaliação e número de avaliações
- Método `exibirFichaTecnica()` para exibir detalhes da música
- Método `avaliar(double _avaliacao)` para adicionar avaliações
- Método `mediaAvaliacoes()` para calcular a média das avaliações

### Pessoa
- Método `ola()` que exibe "Olá Mundo!"

## Como Executar
Compile e execute a classe `Main.java` para ver o exemplo de uso da classe `Aluno`.

```bash
javac src/Main.java
java -cp src Main
```

## Conceitos Aprendidos
- Criação de classes em Java
- Definição de atributos
- Criação de métodos
- Instanciação de objetos
- Chamada de métodos
