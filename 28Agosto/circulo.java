// Correção do exercício da última aula
import java.util.Scanner;

public class circulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o raio do Círculo:");
        double raio = teclado.nextDouble();
        // Quando não é especificado no enunciado, é melhor usar double do que float, para garantir.

        System.out.println("O perímetro do Círculo de raio " + raio + " é: ");
        System.out.println(2 * Math.PI * raio);
        System.out.println("A área do Círculo de raio " + raio + " é: ");
        System.out.println(Math.PI * Math.pow(raio, 2.0));
        // Melhor usar os métodos da classe Math pois eles tem uma precisão melhor.
    }
}
