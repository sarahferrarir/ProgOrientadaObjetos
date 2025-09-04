/*
Ler um caractere op representando uma operação aritmética (+, -, *, /)
e em seguida dois números reais a e b.
Imprimir a expressão matemática com o seu resultado no formato: a op b = resultado.
Usando "Switch case"
 */
import java.util.Scanner;

public class OpAritSwitch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a operação aritmética desejada: ");
        char op = teclado.next().charAt(0);
        System.out.println("Informe o primeiro número: ");
        double a = teclado.nextDouble();
        System.out.println("Informe o segundo número: ");
        double b = teclado.nextDouble();

        switch(op)
        {
            case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case '/':
                System.out.println(a + " / " + b + " = " + (a / b));
                break;
        }
    }
}
