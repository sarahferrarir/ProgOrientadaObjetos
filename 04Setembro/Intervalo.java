/*
Ler um número inteiro n e mais dois números (inferior e superior) que formam um intervalo.
Ao final, imprima uma mensagem informando se n está antes, dentro ou depois do intervalo.
 */
import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o número inteiro: ");
        int n = teclado.nextInt();
        System.out.println("Informe o número superior: ");
        double superior = teclado.nextDouble();
        System.out.println("Informe o número inferior: ");
        double inferior = teclado.nextDouble();

        if (n < superior && n < inferior) {
            System.out.println("O número informado está antes do intervalo");
        } else if (n < superior && n > inferior) {
            System.out.println("O número informado está dentro do intervalo");
        } else if (n > superior && n > inferior) {
            System.out.println("O número informado está depois do intervalo");
        }
    }
}
