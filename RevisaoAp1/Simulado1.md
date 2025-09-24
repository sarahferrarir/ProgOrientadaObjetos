# Lista de Exercícios – Java

## Questões de Múltipla Escolha

### **1. A respeito da independência de plataforma em Java, qual das seguintes alternativas descreve corretamente o processo?**  
a) O código-fonte (.java) é compilado diretamente para código nativo que pode ser executado em qualquer sistema operacional.  
b) O código-fonte (.java) é interpretado linha por linha pela Máquina Virtual Java (JVM), que garante a execução em diferentes plataformas.  
c) O bytecode (.class) gerado a partir do código-fonte é executado pela JVM, permitindo a portabilidade do programa sem a necessidade de recompilação.  
d) A linguagem Java não é independente de plataforma, pois o compilador precisa ser específico para cada sistema operacional.  

### resposta: (c)

---

### **2. No contexto da sintaxe do método main, qual é o propósito da palavra-chave static?**  
a) Indica que o método não retorna nenhum valor.  
b) Define que o método main é público e pode ser acessado de qualquer lugar.  
c) Permite que o método seja chamado sem a necessidade de instanciar um objeto da classe.  
d) Especifica que o método main pode receber argumentos de linha de comando.  

### resposta: (c)

---

### **3. De acordo com as convenções de nome clatura para identificadores em Java, qual das seguintes opções está correta?**  
a) O nome de classe `sistemaacademico` está correto.  
b) O nome de variável `limite_superior` está correto.  
c) O nome de constante `maximo` está correto.  
d) O nome de método `dataNascimento` está correto.  

### resposta: (d)

---

### **4. Em Java, qual dos seguintes tipos de dados é considerado primitivo?**  
a) String  
b) Integer  
c) float  
d) Array  

### resposta: (c)

---

### **5. Qual a finalidade de usar a palavra-chave final em uma declaração de variável?**  
a) Torna a variável imutável, impedindo que seu valor seja alterado após a inicialização.  
b) Define a visibilidade da variável para que seja acessível apenas dentro da classe.  
c) Indica que a variável pode ser acessada sem a necessidade de instanciar um objeto.  
d) Permite que a variável seja usada em estruturas de controle de repetição.  

### resposta: (a)

---

### **6. Qual é o resultado da expressão `10 / 4` em Java, considerando que ambos os operandos são do tipo int?**  
a) 2.5  
b) 2  
c) 0  
d) Um erro de compilação.  

### resposta: (b)

---

### **7. Qual o resultado da expressão `(4 / 3.0) + (3 * 5)`?**  
a) 16.333  
b) 16.0  
c) 15.0  
d) 16  

### resposta: (a)

---

## Questões Discursivas

### **8. Explique em detalhes o conceito de tipagem estática e forte em Java, e o que acontece quando há uma incompatibilidade de tipos de dados.**

- Tipagem estática significa que os tipos das variáveis são verificados em tempo de compilação, e tipagem forte significa que ocorre uma verificação rigorosa desses tipos. Não pode haver conversão entre tipos diferentees e qualquer incompatibilidade de tipo de dados é acusada como um erro pelo compilador.

---

### **9. Descreva o fluxo de execução de um programa Java, desde o código-fonte (.java) até a execução na máquina, incluindo o papel do compilador, do bytecode e da JVM.**

- O código `.java` é compilado para um código intermediário chamaddo bytecode `.class`, executado pela JVM, permitindo que o mesmo código rode em diferentes sistemas operacionais (sem a necessidade de alterações). 

---

### **10. Explique a diferença entre os operadores break e continue em uma estrutura de repetição, fornecendo um exemplo de uso para cada um.**

- O break força a saída de um loop caso sua condição for verdadeira, e o continue faz com que o código pule a iteração atual e vá direto para a próxima iteração. Por exemplo:  
```java
// break
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break; // Sai do loop 'for' completamente
    }
    System.out.println("Número: " + i);
}
// O loop termina aqui. A saída será:
// Número: 0
// Número: 1
// Número: 2
// Número: 3
// Número: 4

// continue
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        continue; // Pula a iteração atual quando i é 5
    }
    System.out.println("Número: " + i);
}
// A saída será:
// Número: 0
// Número: 1
// Número: 2
// Número: 3
// Número: 4
// Número: 6
// Número: 7
```
---

### **11. Descreva como a classe Scanner e a classe System são usadas para realizar a entrada e saída de dados via console.**

- A classe Scanner serve para a entrada de dados pelo console. Ela pertence à biblioteca padrão `java.util`, então precisa ser importada com o comando `import java.util.Scanner;`  para ser usada. Para ler dados do teclado (que é a entrada padrão), você cria um objeto da classe Scanner e passa `System.in` como argumento.
- `System.in` é um objeto da classe System que representa a entrada padrão, que, neste caso, é o teclado.
- A classe System é a responsável pela saída de dados. Ela pertence à biblioteca padrão `java.lang` e já vem disponível por padrão. O objeto `out` da classe System representa a saída padrão. Por exemplo: `System.out.print`.

---

## Questões de Codificação

### **12. Leia duas variáveis inteiras e imprima a soma, a subtração, a multiplicação e a divisão entre elas. Utilize a classe Scanner para a entrada de dados.**

```java
public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int a = teclado.nextInt();
        System.out.println("Digite o segundo valor: ");
        int b = teclado.nextInt();

        System.out.println("A soma dos valores é: " + (a + b));
        System.out.println("A subtração dos valores é: " + (a - b));
        System.out.println("A multiplicação dos valores é: " + (a * b));
        System.out.println("A divisão dos valores é: " + (a / b));
    }
}    
```
---
### **13. Leia o raio de um círculo, em seguida, imprima o perímetro (2πR) e a área (πR²) do círculo. Utilize a classe Scanner para a entrada de dados.**

```java
public class Circulo {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite o raio do círculo: ");
    double raio = teclado.nextDouble();

    System.out.println("O perímetro do círculo é: " + (2 * Math.PI * raio));
    System.out.println("A área do círculo é: " + (Math.PI * raio * raio));
    }
}
```
---
### **14. Leia uma variável inteira n. Em seguida, imprima uma mensagem informando se o número é par ou ímpar. Utilize uma estrutura condicional (if-else).**

```java
public class ParImpar {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe o número: ");
    int n = teclado.nextInt();

    if(n % 2 == 0) {
        System.out.println("O número é par.");
    } else {
        System.out.println("O número é ímpar.");
    }
    }
}
```
---
### **15. Leia um número de alunos n. Em seguida, leia as notas dos n alunos e imprima, ao final, a média da turma. Utilize uma estrutura de repetição (for ou while).**

```java
public class Turma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o número de alunos: ");
        int alunos = teclado.nextInt();

        System.out.println("Informe as notas dos alunos: ");
        double notas = 0.0;

        for (int i = 0; i < alunos; i++) {
            notas = notas + teclado.nextDouble();
        }

        System.out.println("A média dos alunos é:" + (notas / alunos));
    }
}
```
