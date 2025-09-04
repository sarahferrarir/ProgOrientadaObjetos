/*
Ler um caractere op representando uma operação aritmética (+, -, *, /)
e em seguida dois números reais a e b.
Imprimir a expressão matemática com o seu resultado no formato: a op b = resultado.
 */
import java.util.Scanner;

public class OperacaoAritmetica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a operação aritmética desejada: ");
        String op = teclado.next();
        System.out.println("Informe o primeiro número: ");
        double a = teclado.nextDouble();
        System.out.println("Informe o segundo número: ");
        double b = teclado.nextDouble();

        // == compara endereços de memória de objetos.
        // .equals() compara conteúdo da String.
        if (op.equals("+")){
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (op.equals("-")){
            System.out.println(a + " - " + b + " = " + (a - b));
        } else if (op.equals("*")){
            System.out.println(a + " * " + b + " = " + (a * b));
        } else if (op.equals("/")){
            System.out.println(a + " / " + b + " = " + (a / b));
        }
    }
}
