# Revisão para a AP1

## 1. Características da Linguagem Java

Java é uma linguagem de programação **orientada a objetos (POO)** criada por James Gosling em 1991, inicialmente para desenvolver software interativo para dispositivos embarcados. Com o crescimento da internet, Java passou a ser amplamente usada no desenvolvimento de **aplicações web interativas**.

Principais características:

- **Orientação a Objetos (POO):** O fluxo de um programa Java é definido pelo uso de **sobrescrita** e **sobrecarga** de métodos que utilizam **polimorfismo**, e não apenas por `if-else`.
- **Simplicidade:** A sintaxe dos comandos básicos segue a linguagem C, enquanto a orientação a objetos é mais simples que C++.
- **Independência de Plataforma:** Baseada no princípio **WORA** ("Write once, run anywhere"). O código `.java` é compilado para um código intermediário chamado **bytecode** `.class`, executado pela **JVM**, permitindo que o mesmo código rode em diferentes sistemas operacionais sem alterações.

## 2. O Método `main`

Todo programa Java deve conter um método `main`, que indica o ponto de início da execução. Como Java é **POO**, o `main` deve estar dentro de uma **classe**.

Sintaxe:

```java
public static void main(String[] args)
```

Componentes:  
- `public`: Define a visibilidade do método.
- `static`: Permite chamar o método sem instanciar a classe.
- `void`: Indica que o método não retorna valor.
- `String[] args`: Permite receber parâmetros pela linha de comando.

---
## 3. Tipagem em Java

Java é uma linguagem **fortemente** e **estaticamente tipada**.

- **Tipagem Estática:** Todos os dados manipulados por um programa Java são associados a um tipo específico. Isso significa que os tipos das variáveis são verificados em tempo de compilação.    
- **Tipagem Forte:** Ocorre uma verificação rigorosa de tipos. Não há conversão implícita entre tipos diferentes, e qualquer incompatibilidade de tipo de dados é acusada como um erro pelo compilador.

---

## 4. Tipos Primitivos de Dados

Java possui **oito tipos primitivos**, independentes da arquitetura:

- `boolean`: valores lógicos `true` ou `false`.
- `char`: um caractere em aspas simples, ex: `'a'`.
- `byte`: inteiro de -128 a 127.
- `short`: inteiro de -32.768 a 32.767.
- `int`: inteiro maior que `short`.
- `long`: inteiro maior que `int`, que deve ser finalizado com a letra `L` (maiúscula)..
- `float`: ponto flutuante de 32 bits, finalizado com `f` (minúscula).
- `double`: ponto flutuante de 64 bits, maior que `float`.

> **Observação:** `String` não é um tipo primitivo; representa uma sequência de caracteres entre aspas duplas.

---

## 5. Regras para Nomear Identificadores

Identificadores são nomes usados para variáveis, constantes, classes e métodos.

### Regras básicas
- Devem começar com **letra**, **`$`** ou **`_`**.  
- Após o primeiro caractere, podem conter letras, dígitos, `$` ou `_`.  
- **Case-sensitive:** `pessoa` ≠ `Pessoa`.  
- Evitar uso de acentos.  
- Palavras reservadas como `public`, `class`, `void`, `int` **não podem** ser usadas.  

### Convenções de nomenclatura
- **Variáveis e métodos:** `camelCase` → `nomeCliente`.  
- **Constantes:** caixa alta com `_` → `LIMITE_SUPERIOR`.  
- **Classes:** `PascalCase` → `SistemaAcademico`.

---
## 6. Declaração e Atribuição de Variáveis e Constantes

### Variáveis
A declaração de uma variável em Java define o **tipo** e o **nome**.  
A atribuição associa um valor a essa variável.

```java
int idade;     // declaração
idade = 25;    // atribuição
```

Também é possível declarar e atribuir na mesma linha:
```java
int idade = 25;
```
> Variáveis não inicializadas têm valor indefinido, e tentar usá-las antes de atribuir um valor resultará em um erro de compilação.
> 
### Atribuição Encadeada
O Java permite atribuir um mesmo valor a várias variáveis de uma vez, encadeando o operador `=`.

```java
int a, b, c;
a = b = c = 10;   // todas recebem o valor 10
```

### Constantes
Para criar uma constante (um valor que não pode ser alterado), utilizamos a palavra-chave `final`.   
Por convenção, o nome da constante é escrito em maiúsculas.

```java
final double PI = 3.1415;
```
> O valor de uma constante **não** pode ser alterado após a inicialização, e uma tentativa de fazê-lo gerará um erro de compilação.
---

## 7. Operadores Aritméticos em Java

### Operadores e suas descrições

| Operador | Descrição                        |
|----------|----------------------------------|
| `+`      | soma                             |
| `-`      | subtração                        |
| `*`      | multiplicação                    |
| `/`      | divisão                          |
| `%`      | resto da divisão (inteiros)      |
| `++`     | incremento (soma 1)              |
| `--`     | decremento (subtrai 1)           |

---

### Precedência dos Operadores
A ordem em que as operações são avaliadas segue a seguinte hierarquia:

1. `++`, `--`  
2. `*`, `/`, `%`  
3. `+`, `-`  

> **Observação:** o uso de **parênteses** altera a ordem de avaliação, tornando a expressão mais clara e evitando ambiguidades.

---

### Operadores de Atribuição Combinados
Além da atribuição simples (`=`), o Java possui operadores que **combinam operação aritmética e atribuição**:

- `+=`
- `-=`
- `*=`
- `/=`
- `%=`  

---

### Exemplo em Código
```java
int quantidade = 5;

// usando operador de atribuição combinado
quantidade += 10;   // equivalente a quantidade = quantidade + 10;

System.out.println(quantidade); // saída: 15
```
---

### 8. Classe `Scanner`

Para entrada de dados pelo console (teclado):

```java
import java.util.Scanner;

Scanner teclado = new Scanner(System.in);
int idade = teclado.nextInt();
String nome = teclado.nextLine();
```

Métodos Comuns:
- `nextInt()`, `nextDouble()`, `nextFloat()`, `nextLong()`, `nextLine()`.

Saída de dados:
- `System.out.print()` → imprime sem pular linha  
- `System.out.println()` → imprime e pula para a próxima linha  
- `System.out.printf()` → imprime formatando a saída (ex.: casas decimais)  

---

## 9. Operadores de Incremento e Decremento

- **Pós-fixado (`x++`)**: usa o valor atual da variável e **depois** incrementa.  
- **Pré-fixado (`++x`)**: incrementa o valor da variável e **depois** usa o novo valor.  

#### Exemplo
```java
int x = 5;

System.out.println(x++); // imprime 5, depois x passa a valer 6
System.out.println(++x); // incrementa primeiro (x=7), depois imprime 7
```
--- 
## 10. Operadores Relacionais e Lógicos em Java

### Operadores Relacionais
São usados para comparar valores.

| Operador | Significado     |
|----------|-----------------|
| `>`      | maior que       |
| `<`      | menor que       |
| `>=`     | maior ou igual  |
| `<=`     | menor ou igual  |
| `==`     | igual           |
| `!=`     | diferente       |
> Os operadores aritméticos têm precedência sobre os relacionais.

### Operadores Lógicos
Usados para combinar expressões relacionais.

| Operador | Significado  |
|----------|--------------|
| `&&`     | E / AND      |
| `||`     | OU / OR      |
| `!`      | Negação / NOT|

---

#### Exemplo em Código
```java
int a = 10, b = 20;

System.out.println(a > 5 && b > 15); // true (ambas as condições são verdadeiras)
System.out.println(a > 15 || b > 15); // true (apenas uma condição é verdadeira)
System.out.println(!(a == 10));       // false (negação de true)
```
---
## 11. Estruturas Condicionais e de Repetição

### Estruturas Condicionais

#### if...else
Analisa uma expressão lógica para decidir o fluxo de execução.  
- Se a expressão for verdadeira, o bloco dentro do `if` é executado.  
- Caso contrário, o bloco do `else` é executado.  
- É possível utilizar múltiplos `else if`.

```java
int idade = 18;

if (idade < 18) {
    System.out.println("Menor de idade");
} else if (idade < 60) {
    System.out.println("Adulto");
} else {
    System.out.println("Idoso");
}
```

#### switch
Usado quando há múltiplos caminhos possíveis a partir de uma condição.
- A expressão do `switch` deve ser de tipo char ou inteiro (`byte`, `short`, `int`, `long`).
- O comando `break` encerra a execução do `switch`.
- Se nenhum `case` corresponder, o `default` é executado.

```java
int dia = 3;

switch (dia) {
    case 1: System.out.println("Domingo"); break;
    case 2: System.out.println("Segunda"); break;
    case 3: System.out.println("Terça"); break;
    default: System.out.println("Outro dia");
}
```

### Estruturas de Repetição (Loops)

#### while
Avalia uma expressão lógica e executa o bloco enquanto ela for verdadeira.  
Pode executar **zero ou mais vezes**.

```java
int i = 0;
while (i < 5) {
    System.out.println("i = " + i);
    i++;
}
```

#### do...while
Executa o bloco **ao menos uma vez**, depois avalia a condição lógica.
Continua repetindo enquanto a expressão for verdadeira.

```java
int j = 0;
do {
    System.out.println("j = " + j);
    j++;
} while (j < 5);
```

#### for
Estrutura mais compacta, com inicialização, condição e incremento.

```java
for (int k = 0; k < 5; k++) {
    System.out.println("k = " + k);
}
```

### Comandos de Controle em Loops
- **break**: Força a saída imediata do loop mais interno ou de um `switch`.
- **continue**: Pula o restante do código da iteração atual e vai direto para a próxima iteração do loop.

```java
for (int n = 0; n < 5; n++) {
    if (n == 2) continue; // pula quando n = 2
    if (n == 4) break;    // encerra o loop quando n = 4
    System.out.println("n = " + n);
}
```
---
## 12. Classes e Herança em POO

### Classes
Em Java, todo código deve estar dentro de uma classe.
- Definida com a palavra-chave `class` seguida do nome da classe.
- O corpo da classe é delimitado por `{}`.

```java
class Pessoa {
    String nome;
    int idade;

    void apresentar() {
        System.out.println("Meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}
```

### Herança
A herança permite que uma classe (subtipo) aproveite atributos e métodos definidos em outra classe (supertipo).
- Utiliza a palavra-chave `extends`.
- Subtipos podem adicionar ou sobrescrever métodos do supertipo.

```java
class Animal {
    void emitirSom() {
        System.out.println("Som genérico de animal");
    }
}

class Cachorro extends Animal {
    @Override
    void emitirSom() {
        System.out.println("Latido");
    }
}
```

Neste exemplo:
- `Animal` é o supertipo.
- `Cachorro` é o subtipo, que herda de `Animal`.
