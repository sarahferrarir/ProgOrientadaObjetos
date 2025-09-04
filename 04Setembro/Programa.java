/*
Ler um número real x e imprimi-lo arredondando seu valor para mais ou para menos.
Se a parte decimal for menor que 0.5 arredonda para menos.
Se for maior ou igual a 0.5 arredonda para mais.
 */
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um valor a ser arredondado: ");
        double valor = teclado.nextDouble();
        double dec = valor % 1;

        if (dec >= 0.5) {
            valor = valor + 1 - dec;
        } else {
            valor = valor - dec;
        }

        System.out.println("O valor arredondado é: " + valor);
    }
}
