// Leia uma variável n inteira. Em seguida, imprima uma mensagem informando se o número é par ou ímpar.
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o número:");
        int n = teclado.nextInt();

        if (n % 2 == 0)
            System.out.println("O número é par.");
        else
            System.out.println("O número é ímpar.");
    }
}
