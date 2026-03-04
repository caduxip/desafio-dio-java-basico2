# Desafio DIO - Controle de Fluxo (Java)

Projeto desenvolvido para o desafio **Controle de Fluxo** da trilha de Java básico da DIO.

Repositório no GitHub: [git@github.com:caduxip/desafio-dio-java-basico2.git](git@github.com:caduxip/desafio-dio-java-basico2.git)

## Objetivo

Criar um programa Java que:

- receba dois números inteiros via terminal;
- valide se o segundo parâmetro é maior que o primeiro;
- calcule a quantidade de interações (`parametroDois - parametroUm`);
- imprima no console os números da contagem;
- lance uma exceção customizada quando os parâmetros forem inválidos.

## Regras do desafio

1. O usuário informa dois parâmetros inteiros.
2. Se `parametroUm` for maior que `parametroDois`, o sistema lança `ParametrosInvalidosException`.
3. Caso contrário, o programa imprime no console:
   - `Imprimindo o número 1`
   - `Imprimindo o número 2`
   - ... até o total de interações calculado.

## Estrutura do projeto

```text
src/
  Main.java
  Contador.java
  ParametrosInvalidosException.java
```

### `Main.java`
Ponto de entrada padrão do projeto. Ele delega a execução para `Contador.main(args)`.

### `Contador.java`
Classe principal da lógica:

- lê os dados com `Scanner`;
- trata entrada inválida (`InputMismatchException`);
- chama o método `contar`;
- valida parâmetros e imprime o resultado.

### `ParametrosInvalidosException.java`
Exceção checked customizada utilizada para sinalizar regra de negócio violada.

## Pré-requisitos

- Java JDK 17+ (ou compatível)
- Terminal (bash, zsh, PowerShell etc.)

## Como compilar

No diretório raiz do projeto:

```bash
javac src/*.java
```

## Como executar

### Executando pelo `Main`

```bash
java -cp src Main
```

### Executando diretamente pelo `Contador`

```bash
java -cp src Contador
```

## Exemplos

### Cenário válido
Entrada:

```text
2
6
```

Saída:

```text
Digite o primeiro parâmetro
Digite o segundo parâmetro
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
Imprimindo o número 4
```

### Cenário inválido (regra de negócio)
Entrada:

```text
9
3
```

Saída:

```text
Digite o primeiro parâmetro
Digite o segundo parâmetro
O segundo parâmetro deve ser maior que o primeiro
```

### Cenário inválido (entrada não numérica)
Entrada:

```text
x
2
```

Saída:

```text
Digite o primeiro parâmetro
Entrada inválida. Digite apenas números inteiros.
```

## Boas práticas aplicadas

- classes utilitárias com construtor privado;
- uso de constantes para mensagens e formatação;
- exceção customizada para regra de negócio;
- separação clara de responsabilidades entre classes;
- `.gitignore` configurado para ignorar arquivos de IDE e compilados (`*.class`).

## Autor

Projeto mantido por **Ivanildo Pereira**.
