# Estrutura Condicional – Switch

O **switch** é um comando de seleção semelhante ao `if-else`, mas é mais recomendado quando temos **muitos caminhos possíveis** a partir de uma única condição.

## Características

- A expressão do `switch` deve ser obrigatoriamente do tipo **caractere (`char`)** ou **inteiro (`byte`, `short`, `int` ou `long`)**.  
- O comando `break` é usado para **terminar a execução do switch**.  
- Se nenhum `case` corresponder à expressão, é executado o **default**.  

## Sintaxe

```java
switch (expressão) {
    case valor1:
        comando1;
        comando2;
        break;
    case valor2:
        comando3;
        break;
    case valor3:
        comando4;
        comando5;
        break;
    default:
        comando6;
        break;
}
```
**Observações:**
- `valor1`, `valor2`, `valor3`, etc., podem ser variáveis ou constantes;
- Quando um `break` é executado, o switch termina imediatamente;
- O `default` é opcional e executa caso nenhum case seja satisfeito.

  
# Estrutura de Repetição
As estruturas de repetição permitem executar um bloco de código várias vezes, enquanto uma condição é verdadeira ou por um número determinado de vezes.  
Escolha o tipo de loop de acordo com a *condição* de repetição:
- `for` → número conhecido de repetições.
- `while` → número desconhecido, baseado em condição.
- `do-while` → garante execução mínima de uma vez.

##  Estrutura de Repetição WHILE

Comando WHILE
- Avalia uma expressão lógica e executa um bloco de comando enquando ela for verdadeira;
- O bloco é executado ZERO ou mais vezes.

**Sintaxe:**

```java
while (expressao_logica)
    comando;
    
while (expressao_logica){
    bloco_de_comandos
}
```
##  Estrutura de Repetição DO WHILE

Comando DO...WHILE  
- Avalia uma expressão lógica e executa um bloco de comando enquanto ela for verdadeira;
- O bloco é executado UMA ou mais vezes.

**Sintaxe:**

```java
do{
    bloco_de_comandos
} while (expressao_logica);
```
## Estrutura de Repetição FOR

Comando FOR:
- Executa um bloco de comandos enquanto uma expressão booleana for verdadeira;
- É composto de três partes (**nenhuma é obrigatória**);

**Sintaxe:**

```java
for (expr_inicializacao; expr_logica; expr_incremento)
    comando;

for (expr_inicializacao; expr_logica; expr_incremento) {
    bloco_de_comandos;
}
```
#### A execução do for se dá da seguinte forma:
1. Executa a expressão de inicialização;
2. Testa a expressão lógica. Se for *falsa* termina o for;
3. Executa o bloco de comandos;
4. Executa a expressão de incremento;
5. Volta para o passo 2.

```java
for (expr_inicializacao; expr_logica; expr_incremento){
    comando1;
    comando2;
}
```
#### Exemplos de Estruturas de Repetição `for` em Java

1) Loop simples com incremento padrão
```java
for (int i = 0; i < 10; i++) {
    // i inicia em 0, enquanto i for menor que 10, o loop continua
    // a cada iteração, i é incrementado em 1 automaticamente
    System.out.println(i); // imprime i de 0 a 9
}
```

2) Loop com incremento dentro do corpo
```java
for (int i = 0; i < 10; ) {
    // Inicialização: i = 0
    // Condição: i < 10
    // Incremento vazio no cabeçalho, incremento feito dentro do bloco

    System.out.println(i); // imprime i
    i += 2; // incrementa i em 2
}
// Saída: 0, 2, 4, 6, 8
```

3) Loop com incremento multiplicativo
```java
int i = 1;

for ( ; i < 50; i *= 2) {
    // Inicialização fora do for
    // Condição: i < 50
    // Incremento: i é multiplicado por 2 a cada iteração
    System.out.println(i); // imprime i = 1, 2, 4, 8, 16, 32
}
```

4) Loop decrescente com decremento manual
```java
int i = 20;

for ( ; i >= 0; ) {
    // Inicialização fora do for
    // Condição: i >= 0
    // Incremento vazio, decremento dentro do corpo
    System.out.println(i); // imprime de 20 até 0
    i--; // decrementa i em 1
}
```

5) Loop infinito com incremento
```java
for (int i = 0; ; i++) {
    // Sem condição de parada → loop infinito
    // i é incrementado a cada iteração
    System.out.println(i); // imprime i infinitamente
}
```

6) Loop infinito com incremento fora do cabeçalho
```java
int i = 0;

for ( ; ; i++) {
    // Sem inicialização e sem condição → loop infinito
    // Incremento em i dentro do cabeçalho
    System.out.println(i); // imprime i infinitamente
}
```

7) Loop infinito puro
```java
int i = 0;

for ( ; ; ) {
    // Sem inicialização, condição ou incremento → loop infinito
    System.out.println(i); // imprime sempre 0
}
```

**Observações gerais:**
- Se a condição do `for` estiver vazia, o loop é considerado infinito;
- Incrementos podem ser feitos dentro do corpo ou no cabeçalho do `for`;
- Loops multiplicativos e decrementos permitem manipular contadores de forma mais flexível;
- Sempre cuidado com loops infinitos: podem travar o programa.


---
## Estrutura de Controle em Repetição

Os seguintes comandos for e while são equivalentes:

```java
for (expr_inicializacao; expressao_logica; expr_incremento){
   comando1;
   comando2;
}

expr_inicializacao;
while (expressao_logica){
   comando1;
   comando2;
   expr_incremento;
}
```

O comando ***break*** força a saída do loop mais interno de um comando de repetição (while, do...while ou for) ou em um comando switch.
- Exemplo:

```java
int n;

while(...)
{
    for(...){
        n = n - 1
        if (n == 0)
            break; // Sai do "for", que é o comando de repetição mais interno. Não executa o n++.
        n++;
    }
    System.out.println(n); // Caso break ^, o programa vem para essa linha.
}
```
O comando ***continue*** força o início da próxima interaçã do loop mais interno de um comando de repetição.
- Exemplo:

```java
int n;

while(...)
{
    for(...){
        n = n - 1
        if (n == 0)
            continue; // Para o comando for, reinicia o loop executando a expressão de incremento e depois testando a expressão lógica.
        System.out.println(n);
    }
    if (n < 0)
        continue; // No while e do...while reinicia o loop testando a expressão lógica.
    System.out.println(n); 
}
```
