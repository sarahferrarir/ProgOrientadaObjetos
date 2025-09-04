/*
Ler caracteres até que o usuário digite '.' (ponto). Ao final imprimir: a quantidade de vogais, a quantidade de dígitos e a quantidade dos demais caracteres.
 */
import java.util.Scanner;

public class Caracteres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int vogais = 0;
        int contador = 0;
        int resto = 0;

        for (int i = 0; ;i++) {
            System.out.println("Digite os carácteres: ");
            char car = teclado.next().charAt(0);
            if (car == '.')
                break;
            if (car == 'a' || car == 'e' || car == 'i' || car == 'o' ||car == 'u') {
                vogais++;
            } else {
                resto++;
            }
            contador++;
        }

        System.out.println("A quantidade total de digitos foi: " + contador);
        System.out.println("A quantidade total de vogais foi: " + vogais);
        System.out.println("A quantidade dos demais caracteres foi: " + resto);
    }
}
