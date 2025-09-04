## Incremento e Decremento

Os operadores `++` e `--` são muito utilizados em Java e podem ser **prefixados** ou **pósfixados**:

- `x++` → usa o valor de `x` e depois incrementa `x`.
- `++x` → incrementa `x` primeiro e depois usa o valor já incrementado.

### Exemplo de uso

```java
int i, j, k;
i = 10;
j = i++;  // j recebe 10, depois i é incrementado para 11
k = ++j;  // j é incrementado para 11 e k recebe 11
```

Este trecho pode ser reescrito como: 
```java
i = 10;
j = i;   // j = 10
i++;     // i = 11
++j;     // j = 11
k = j;   // k = 11
```

## Operador de Atribuição Aritmética

Em Java, é muito comum **combinar operadores aritméticos com o operador de atribuição** para simplificar o código.

### Sintaxe da Atribuição Aritmética

| Expressão Normal       | Expressão com Atribuição Aritmética |
|------------------------|------------------------------------|
| `var = var + expressão` | `var += expressão`                 |
| `var = var - expressão` | `var -= expressão`                 |
| `var = var * expressão` | `var *= expressão`                 |
| `var = var / expressão` | `var /= expressão`                 |
| `var = var % expressão` | `var %= expressão`                 |

### Exemplo Prático

```java
int x = 10;
x += 5;  // Equivalente a: x = x + 5
x -= 3;  // Equivalente a: x = x - 3
x *= 2;  // Equivalente a: x = x * 2
x /= 4;  // Equivalente a: x = x / 4
x %= 3;  // Equivalente a: x = x % 3
```
## Casting

Em Java, para forçar a **conversão de um tipo para outro**, usamos o operador de **casting**.

### Sintaxes

- `(tipo) variável` → converte a variável para o tipo especificado.  
- `(tipo) (expressão)` → converte o **resultado da expressão** para o tipo especificado.

### Exemplos

```java
int i = 6, j = 3, k = 4;

// Converte i para float antes da divisão
float resultado1 = (float) i / j;  // i = 6.0, resultado = 2.0

// Converte i para float antes da divisão por k
float resultado2 = (float)(i) / k; // i = 6.0, resultado = 1.5

// Converte o resultado da divisão para float
float resultado3 = (float)(i / k); // i/k = 1, depois convertido para 1.0
```

> ⚠️ **Observação:** A posição do cast altera o resultado. Fazer o cast antes da operação afeta a divisão, enquanto fazer depois converte apenas o resultado final.

## Operadores Relacionais

Em Java, os **operadores relacionais** são usados para comparar valores. A sintaxe das operações relacionais é:

| Operador | Significado       |
|----------|-----------------|
| `>`      | Maior que       |
| `<`      | Menor que       |
| `>=`     | Maior ou igual a|
| `<=`     | Menor ou igual a|
| `==`     | Igual a         |
| `!=`     | Diferente de    |

### Exemplo Prático

```java
int a = 5, b = 10;

boolean resultado1 = a > b;   // false
boolean resultado2 = a < b;   // true
boolean resultado3 = a >= 5;  // true
boolean resultado4 = b <= 10; // true
boolean resultado5 = a == b;  // false
boolean resultado6 = a != b;  // true
```

## Operadores Lógicos

Em Java, os **operadores lógicos** são usados para combinar expressões booleanas.  

### Sintaxe e Significado

| Operador | Significado    |
|----------|---------------|
| `&&`     | E (AND)       |
| `||`     | OU (OR)       |
| `!`      | Negação (NOT) |

### Exemplos Práticos

```java
boolean a = true;
boolean b = false;

boolean resultado1 = a && b; // false, pois ambos precisam ser true
boolean resultado2 = a || b; // true, pois pelo menos um é true
boolean resultado3 = !a;     // false, nega o valor de a
boolean resultado4 = !b;     // true, nega o valor de b
```
