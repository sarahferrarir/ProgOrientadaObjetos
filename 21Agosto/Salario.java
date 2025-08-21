import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o seu salário atual:");
        float salario = teclado.nextFloat();

        System.out.println("Informe o número do percentual de seu aumento:");
        float percent = teclado.nextFloat();

        float aumento = 1 + (percent / 100);

        System.out.println("O seu salário atual é: " + salario);
        System.out.println("O seu novo salário com aumento de " + percent + "% é: " + (salario * aumento));
    }
}
