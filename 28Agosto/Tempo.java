/*
Leia uma variável t com um tempo qualquer em segundos e imprima esse valor em hora, minuto e segundo.
 */
import java.util.Scanner;

public class Tempo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o tempo em segundos:");
        int t = teclado.nextInt();

        System.out.println("Tempo em segundos: " + t);
        System.out.println("Tempo em minutos: " + t / 60.0);
        System.out.println("Tempo em horas: " + t / (60.0 * 60.0));

        int min = 0;
        int horas = 0;

        if (t >= 3600) {
            horas = t / 3600;
            t = t - (horas * 3600);
        }

        if (t >= 60) {
            min = t / 60;
            t = t - (min * 60);
        }

        System.out.println("Esse valor equivale a " + horas + " horas, " + min + " minutos e " + t + " segundos.");
    }
}
