/*
Ler caracteres até que o usuário digite '.' (ponto). Ao final imprimir: a quantidade de vogais, a quantidade de dígitos e a quantidade dos demais caracteres.
 */
import java.util.Scanner;

public class Caracteres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int vogais = 0;
        int digitos = 0;
        int resto = 0;

        // Lembrando que no loop for, você não precisa dar nenhuma condição inicial
        for (;;) {
            System.out.println("Digite os carácteres: ");
            char car = teclado.next().charAt(0);
            if (car == '.')
                break;
            if (car == 'a' || car == 'e' || car == 'i' || car == 'o' ||car == 'u') {
                vogais++;
            } else if (car >= '0' && car <= '9') {
                digitos++;
            } else {
                resto++;
            }
        }

        System.out.println("A quantidade total de digitos foi: " + digitos);
        System.out.println("A quantidade total de vogais foi: " + vogais);
        System.out.println("A quantidade dos demais caracteres foi: " + resto);
    }
}
