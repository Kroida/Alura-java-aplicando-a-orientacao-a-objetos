# Java: Aplicando a Orientação a Objetos

## Descrição
Repositório contendo todos os projetos desenvolvidos durante o curso "Java: Aplicando a Orientação a Objetos" da Alura. Este curso aborda os fundamentos da programação orientada a objetos em Java, desde conceitos básicos até padrões mais avançados.

## Estrutura do Repositório

```
Alura-java-aplicando-a-orientacao-a-objetos/
├── modulo1DesafioHoraPratica/    # Conceitos básicos de OO
├── modulo2DesafioHoraPratica/    # Encapsulamento
├── modulo3DesafioHoraPratica/    # Herança e Polimorfismo
├── modulo4DesafioHoraPratica/    # Interfaces
├── oDesafio/                     # Projeto final integrador
└── screenMatch/                  # Sistema de gerenciamento de títulos
```

## Projetos

### 1. Módulo 1 - Desafio Hora Prática
**Conceitos:** Criação de classes, atributos e métodos básicos

Este projeto introdutório demonstra os fundamentos da orientação a objetos:
- Criação de classes simples
- Definição de atributos
- Criação de métodos
- Instanciação de objetos

**Classes principais:** Aluno, Calculadora, Musica, Pessoa

### 2. Módulo 2 - Desafio Hora Prática
**Conceitos:** Encapsulamento com modificadores de acesso

Focado em proteger os dados internos das classes:
- Uso de modificadores private
- Implementação de getters e setters
- Controle de acesso aos atributos
- Validação de dados

**Classes principais:** Aluno, ContaBancaria, IdadePessoa, Livro, Produto

### 3. Módulo 3 - Desafio Hora Prática
**Conceitos:** Herança e Polimorfismo

Demonstra reutilização de código através de herança:
- Criação de classes base
- Extensão de classes com extends
- Sobrescrita de métodos com @Override
- Modificador protected
- Polimorfismo

**Hierarquias principais:** Animal, ContaBancaria, NumerosPrimos

### 4. Módulo 4 - Desafio Hora Prática
**Conceitos:** Interfaces e contratos

Introduz o conceito de interfaces para definir contratos:
- Definição de interfaces
- Implementação de múltiplas interfaces
- Separação de contrato e implementação
- Polimorfismo através de interfaces

**Interfaces principais:** CalculoGeometrico, Calculavel, ConversaoFinanceira, ConversorTemperatura, Tabuada, Vendavel

### 5. O Desafio
**Conceitos:** Projeto integrador combinando todos os conceitos

Sistema completo de player de áudio que aplica todos os conceitos aprendidos:
- Herança múltipla de níveis
- Implementação de interfaces
- Encapsulamento completo
- Polimorfismo
- Sistema de classificação dinâmico

**Classes principais:** Audio, Musica, Podcast

### 6. ScreenMatch
**Conceitos:** Sistema real de gerenciamento de títulos

Aplicação prática de OO em um sistema de filmes e séries:
- Herança com classe base Titulo
- Implementação de interface Classificavel
- Polimorfismo em calculadoras
- Sistema de avaliação e recomendação

**Classes principais:** Titulo, Filme, Serie, Episodio, CalculadoraTempo, FiltroRecomendacao

## Progresso de Aprendizado

O curso segue uma progressão lógica:

1. **Fundamentos** (Módulo 1): Entendendo o que são classes e objetos
2. **Encapsulamento** (Módulo 2): Protegendo dados e controlando acesso
3. **Herança** (Módulo 3): Reutilizando código e criando hierarquias
4. **Interfaces** (Módulo 4): Definindo contratos e comportamentos
5. **Integração** (O Desafio): Aplicando todos os conceitos juntos
6. **Prática Real** (ScreenMatch): Sistema completo com cenários reais

## Como Utilizar

Cada projeto possui seu próprio README com instruções específicas. Para executar qualquer projeto:

```bash
cd [nome-do-projeto]
javac src/*.java
java -cp src [ClassePrincipal]
```

## Requisitos

- Java Development Kit (JDK) 8 ou superior
- IDE compatível com Java (IntelliJ IDEA, Eclipse, VS Code, etc.)

## Conceitos de OO Abordados

- **Classes e Objetos:** Estrutura básica da programação OO
- **Encapsulamento:** Proteção de dados e controle de acesso
- **Herança:** Reutilização de código e especialização
- **Polimorfismo:** Comportamento diferente para subclasses
- **Interfaces:** Contratos e comportamentos abstratos
- **Abstração:** Foco no essencial, ocultando detalhes

## Autor

Projetos desenvolvidos como parte do curso da Alura sobre Orientação a Objetos em Java.
