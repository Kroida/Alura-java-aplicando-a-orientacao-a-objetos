# Módulo 4 - Desafio Hora Prática

## Descrição
Projeto do Módulo 4 do curso "Java: Aplicando a Orientação a Objetos" da Alura. Este projeto demonstra o uso de interfaces em Java, permitindo definir contratos que as classes devem implementar.

## Estrutura do Projeto
- `calculadora/` - Pacote com cálculos geométricos
  - `CalculoGeometrico.java` - Interface para cálculos geométricos
  - `CalculadoraSalaRetangular.java` - Implementação da interface
- `calculavel/` - Pacote com cálculo de preços finais
  - `Calculavel.java` - Interface para calcular preço final
  - `Livro.java` - Implementação com desconto de 10%
  - `ProdutoFisico.java` - Implementação com desconto de 60%
- `conversorMoeda/` - Pacote com conversão de moedas
  - `ConversaoFinanceira.java` - Interface para conversão financeira
  - `ConversorMoeda.java` - Implementação com taxa de R$ 5,04
- `conversorTemperatura/` - Pacote com conversão de temperaturas
  - `ConversorTemperatura.java` - Interface para conversão de temperaturas
  - `ConversorTemperaturaPadrao.java` - Implementação padrão
- `tabuada/` - Pacote com tabuada
  - `Tabuada.java` - Interface para mostrar tabuada
  - `TabuadaMultiplicacao.java` - Implementação de tabuada de multiplicação
- `vendavel/` - Pacote com cálculo de preços de venda
  - `Vendavel.java` - Interface para calcular preço total
  - `Produto.java` - Implementação com desconto por quantidade
  - `Servico.java` - Implementação com acréscimo por crédito

## Funcionalidades

### Calculadora Geométrica
- **CalculoGeometrico**: Interface com métodos:
  - `calcularArea(double base, double altura)`
  - `calcularPerimetro(double lado)`
- **CalculadoraSalaRetangular**: Implementa a interface para salas retangulares

### Calculável
- **Calculavel**: Interface com método `calcularPrecoFinal()`
- **Livro**: Preço base R$ 50,00 com desconto de 10%
- **ProdutoFisico**: Preço base R$ 150,00 com desconto de 60%

### Conversor de Moeda
- **ConversaoFinanceira**: Interface com método `converterDolarParaReal(double moeda)`
- **ConversorMoeda**: Implementação com taxa de conversão R$ 5,04

### Conversor de Temperatura
- **ConversorTemperatura**: Interface com métodos:
  - `celsiusParaFahrenheit(double celsius)`
  - `fahrenheitParaCelsius(double fahrenheit)`
- **ConversorTemperaturaPadrao**: Implementação padrão das conversões

### Tabuada
- **Tabuada**: Interface com método `mostrarTabuada(int numero)`
- **TabuadaMultiplicacao**: Mostra tabuada de multiplicação de 1 a 10

### Vendável
- **Vendavel**: Interface com método `precoTotal(double qtd)`
- **Produto**: Preço R$ 12,50 com desconto de 10% para mais de 5 unidades
- **Servico**: Custo R$ 200,00 com acréscimo de 10% se for no crédito

## Como Executar
Este projeto não possui uma classe Main. As interfaces e suas implementações podem ser testadas criando uma classe principal.

```bash
javac src/**/*.java
```

## Conceitos Aprendidos
- Definição de interfaces com `interface`
- Implementação de interfaces com `implements`
- Contratos e polimorfismo através de interfaces
- Múltiplas implementações de uma mesma interface
- Separação de contrato e implementação
