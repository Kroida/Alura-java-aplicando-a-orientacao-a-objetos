# O Desafio

## Descrição
Projeto final do curso "Java: Aplicando a Orientação a Objetos" da Alura. Este projeto é um sistema de player de áudio que demonstra o uso combinado de herança, interfaces, encapsulamento e polimorfismo em Java.

## Estrutura do Projeto
- `interfaces/` - Pacote com interfaces
  - `Detalhes.java` - Interface para exibir detalhes de áudio
- `models/` - Pacote com modelos de áudio
  - `Audio.java` - Classe base para todos os tipos de áudio
  - `Musica.java` - Subclasse para músicas
  - `Podcast.java` - Subclasse para podcasts
- `Main.java` - Classe principal para testar o sistema

## Funcionalidades

### Audio (Classe Base)
- Atributos privados: título, duração, total de reproduções, curtidas, classificação, estado de pausa
- Métodos:
  - `reproduzir()` - Incrementa reproduções e despausa
  - `pausar()` - Alterna estado de pausa
  - `curtir()` - Incrementa curtidas (valida se curtidas < reproduções)
  - `exibirClassificacao()` - Exibe mensagem baseada na classificação e reproduções
  - `getClassificacao()` - Calcula classificação baseada em curtidas/reproduções

### Musica (Subclasse)
- Extende Audio e implementa Detalhes
- Atributos adicionais: álbum, banda, letras, estado de repetição
- Métodos:
  - `repetirMusica()` - Alterna repetição
  - `definirLetras(String letras)` - Define as letras da música
  - `exibirLetras()` - Exibe as letras se definidas
  - `exibirDetalhes()` - Exibe informações detalhadas da música

### Podcast (Subclasse)
- Extende Audio e implementa Detalhes
- Atributos adicionais: nome do podcast, velocidade de reprodução, tempo restante
- Métodos:
  - `aumentarVelocidade()` - Aumenta velocidade em 0.5 (máximo 2.0)
  - `diminuirVelocidade()` - Diminui velocidade em 0.5 (mínimo 0.5)
  - `avancarSegundos()` - Avança 0.15 segundos
  - `avancarSegundos(Double segundos)` - Avança segundos específicos
  - `voltarSegundos()` - Volta 0.15 segundos
  - `voltarSegundos(Double segundos)` - Volta segundos específicos
  - `exibirDetalhes()` - Exibe informações detalhadas do podcast

### Detalhes (Interface)
- Método `exibirDetalhes()` - Contrato para exibir detalhes

## Como Executar
Compile e execute a classe `Main.java` para ver o exemplo completo do sistema:

```bash
javac src/Main.java
java -cp src Main
```

## Exemplo de Uso
O Main.java demonstra:
- Criação de uma música "Riot" do Three Days Grace
- Reprodução, pausa, curtida e exibição de classificação
- Definição e exibição de letras
- Ativação de repetição
- Criação de um podcast "Entrevistando o Xandão" do Flow Podcast
- Controle de velocidade de reprodução
- Avanço e retorno de segundos

## Conceitos Aplicados
- Herança múltipla de níveis
- Implementação de interfaces
- Encapsulamento completo
- Polimorfismo
- Sobrescrita de métodos
- Validação de dados
- Sistema de classificação dinâmico
