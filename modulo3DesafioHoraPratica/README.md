# Módulo 3 - Desafio Hora Prática

## Descrição
Projeto do Módulo 3 do curso "Java: Aplicando a Orientação a Objetos" da Alura. Este projeto demonstra o uso de herança e polimorfismo em Java, com exemplos de classes base e subclasses.

## Estrutura do Projeto
- `Animal/` - Pacote com hierarquia de animais
  - `Animal.java` - Classe base para animais
  - `Cachorro.java` - Subclasse que estende Animal
  - `Gato.java` - Subclasse que estende Animal
- `Carro/` - Pacote com classe de carro
  - `Carro.java` - Classe para representar um carro com preços
  - `ModeloCarro.java` - Classe principal para testar Carro
- `contaBancaria/` - Pacote com hierarquia de contas
  - `ContaBancaria.java` - Classe base para contas bancárias
  - `ContaCorrente.java` - Subclasse com tarifa mensal
- `numerosPrimos/` - Pacote com verificação de números primos
  - `NumerosPrimos.java` - Classe base para verificação de primalidade
  - `VerificarPrimo.java` - Subclasse para verificar se um número é primo
  - `GeradorPrimo.java` - Subclasse para gerar o próximo primo

## Funcionalidades

### Hierarquia Animal
- **Animal**: Classe base com método `emitirSom()`
- **Cachorro**: Sobrescreve `emitirSom()` para "Au au" e adiciona `abanarRabo()`
- **Gato**: Sobrescreve `emitirSom()` para "Miau miau" e adiciona `arranharMoveis()`

### Carro
- Armazena nome do modelo e preços de 3 anos
- Método `calcularMenorPreco()` - retorna o menor preço entre os 3 anos
- Método `calcularMaiorPreco()` - retorna o maior preço entre os 3 anos

### Hierarquia ContaBancaria
- **ContaBancaria**: Classe base com atributo protegido `saldo`
  - `depositar(double valor)` - deposita valor se positivo
  - `sacar(double valor)` - saca valor se saldo suficiente
  - `consultarSaldo()` - exibe saldo atual
- **ContaCorrente**: Estende ContaBancaria com tarifa mensal de R$ 50,00
  - `cobrarTarifaMensal()` - deduz tarifa do saldo

### Hierarquia NumerosPrimos
- **NumerosPrimos**: Classe base com métodos de primalidade
  - `verificarPrimalidade(int numero)` - verifica se número é primo
  - `listarPrimos(int limite)` - lista todos os primos até o limite
- **VerificarPrimo**: Adiciona método `verificarSeEhPrimo(int numero)`
- **GeradorPrimo**: Adiciona método `gerarProximoPrimo(int ultimoPrimoConhecido)`

## Como Executar
Execute a classe `ModeloCarro.java` para ver o exemplo de uso da classe Carro:

```bash
javac src/desafioHoraPratica/Carro/ModeloCarro.java
java -cp src desafioHoraPratica.Carro.ModeloCarro
```

## Conceitos Aprendidos
- Herança com palavra-chave `extends`
- Sobrescrita de métodos com `@Override`
- Modificador de acesso `protected`
- Polimorfismo
- Reutilização de código através de herança
