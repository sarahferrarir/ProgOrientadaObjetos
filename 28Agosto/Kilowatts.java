/*
Leia duas variáveis com a quantidade de kilowatts consumidos em uma casa e o valor do kilowatt.
Em seguida, calcule o valor a ser pago, concedendo um desconto de 10% caso o consumo seja menor que 150Kw.
 */
import java.util.Scanner;

public class Kilowatts {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a quantidade de kilowatts consumidos:");
        double kW = teclado.nextDouble();
        System.out.println("Informe o valor do kilowatt:");
        double valor = teclado.nextDouble();
        double valorPago = kW * valor;

        if (kW < 150)
            valorPago = valorPago * 0.9;

        System.out.println("Valor a ser pago: " + valorPago + " reais.");
    }
}
