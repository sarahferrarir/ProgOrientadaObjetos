/*
Leia a distância percorrida por um carro, o tempo gasto e a quantidade de gasolina consumida.
Em seguida, imprima a velocidade média (KM/h) e o consumo de combustível (KM/l).
 */
import java.util.Scanner;

public class ConsumoCarro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Distância percorrida em km:");
        double distancia = teclado.nextDouble();
        System.out.println("Tempo gasto em horas:");
        double tempo = teclado.nextDouble();
        System.out.println("Gasolina consumida em litros:");
        double gas = teclado.nextDouble();

        System.out.println("A velocidade média foi de " + (distancia / tempo) + " km/h.");
        System.out.println("O consumo médio de combustível foi de " + (distancia / gas) + " km/l.");
    }
}
