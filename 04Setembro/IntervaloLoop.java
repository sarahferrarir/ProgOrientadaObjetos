/*
Ler dois números inteiros (a e b) e imprimir os pares no intervalo a..b, além da soma e da média desses números.
Caso a seja maior que b, imprima os números no intervalo b..a.
 */
import java.util.Scanner;

public class IntervaloLoop {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int a = teclado.nextInt();
        System.out.println("Informe o segundo número: ");
        int b = teclado.nextInt();
        int maior, menor;

        if (a > b) {
            maior = a;
            menor = b;
        } else {
            maior = b;
            menor = a;
        }

        double soma = 0;
        double contador = 0;

        System.out.println("Esses são os números pares dentro do intervalo: " + menor + "..." + maior);
        for (int i = menor; i <= maior; i++) {
            if (i % 2 == 0){
                System.out.println(i);
                soma += i;
                contador++;
            }
        }

        if (contador > 0) {
            double media = soma / contador;
            System.out.println("Soma dos pares: " + soma);
            System.out.println("Média dos pares: " + media);
        } else {
            System.out.println("Não há números pares no intervalo.");
        }
    }
}
