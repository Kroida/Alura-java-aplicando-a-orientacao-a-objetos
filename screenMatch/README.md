# ScreenMatch

## Descrição
Projeto ScreenMatch - Sistema de gerenciamento de títulos de filmes e séries. Este projeto demonstra o uso avançado de orientação a objetos em Java, incluindo herança, interfaces, polimorfismo e encapsulamento.

## Estrutura do Projeto
- `br.com.alura.screenmatch.calculos/` - Pacote com cálculos e filtros
  - `CalculadoraTempo.java` - Calculadora de tempo total de títulos
  - `Classificavel.java` - Interface para classificação
  - `FiltroRecomendacao.java` - Filtro de recomendações baseado em classificação
- `br.com.alurascreenmatch.modelos/` - Pacote com modelos de títulos
  - `Titulo.java` - Classe base para todos os títulos
  - `Filme.java` - Subclasse para filmes
  - `Serie.java` - Subclasse para séries
  - `Episodio.java` - Classe para episódios de séries
- `main.java` - Classe principal para testar o sistema

## Funcionalidades

### Titulo (Classe Base)
- Atributos privados: nome, ano de lançamento, incluído no plano, soma de avaliações, total de avaliações, duração em minutos
- Métodos:
  - `exibeFichaTecnica()` - Exibe informações técnicas do título
  - `avalia(double avaliacao)` - Adiciona uma avaliação
  - `pegaMedia()` - Calcula a média das avaliações
  - Getters e setters para todos os atributos

### Filme (Subclasse)
- Extende Titulo e implementa Classificavel
- Atributo adicional: diretor
- Sobrescreve `getClassificacao()` - Retorna média das avaliações dividida por 2

### Serie (Subclasse)
- Extende Titulo
- Atributos adicionais: temporadas, ativa, episódios por temporada, minutos por episódio
- Sobrescreve `getDuracaoMinutos()` - Calcula duração total (temporadas × episódios × minutos)

### Episodio
- Implementa Classificavel
- Atributos: número, nome, série, total de visualizações
- Implementa `getClassificacao()` - Retorna 4 se visualizações > 100, senão 2

### CalculadoraTempo
- Calcula tempo total de múltiplos títulos
- Método `inclui(Titulo titulo)` - Adiciona duração do título ao total
- Demonstração de polimorfismo: aceita qualquer subclasse de Titulo

### Classificavel (Interface)
- Método `getClassificacao()` - Contrato para classificação

### FiltroRecomendacao
- Método `filtra(Classificavel classificavel)` - Filtra baseado na classificação:
  - >= 4: "Está entre os preferidos do momento"
  - >= 2: "Muito bem avaliado no momento"
  - < 2: "Horrível"

## Como Executar
Compile e execute a classe `main.java` para ver o exemplo completo do sistema:

```bash
javac src/main.java
java -cp src main
```

## Exemplo de Uso
O main.java demonstra:
- Criação de filmes "Homem Aranha" e "Batman o cavaleiro das trevas"
- Criação da série "Lost" com temporadas e episódios
- Cálculo de tempo total usando CalculadoraTempo
- Avaliação e filtragem de filmes
- Criação e filtragem de episódios

## Conceitos Aplicados
- Herança com extends
- Implementação de interfaces
- Polimorfismo (CalculadoraTempo aceita qualquer Titulo)
- Sobrescrita de métodos
- Encapsulamento com getters/setters
- Uso de interfaces para contratos
- Sistema de avaliação e classificação
