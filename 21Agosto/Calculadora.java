import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        float num1 = teclado.nextFloat();

        System.out.println("Informe o segundo número:");
        float num2 = teclado.nextFloat();

        // Float ao invés de int para poder usar números que não são inteiros
        float soma = num1 + num2;
        float sub = num1 - num2;
        float mult = num1 * num2;
        float div = num1 / num2;

        System.out.println("A soma é: " + soma);
        System.out.println("A subtração é: " + sub);
        System.out.println("A multiplicação é: " + mult);
        System.out.println("A divisão é: " + div);

        // Poderia ser feito sem a criação das variáveis para ficar mais curto
        System.out.println("A soma é: " + (num1 + num2));
        System.out.println("A subtração é: " + (num1 - num2));
        System.out.println("A multiplicação é: " + (num1 * num2));
        System.out.println("A divisão é: " + (num1 / num2));
    }
}
