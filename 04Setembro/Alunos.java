/*
Ler um número de alunos n. Em seguida, ler as notas dos n alunos e imprimir, ao final, a média da turma.
 */
import java.util.Scanner;

public class Alunos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o número de alunos: ");
        int n = teclado.nextInt();

        double soma = 0;
        double contador = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Informe a nota do aluno " + i + ":");
            double nota = teclado.nextDouble();
            soma += nota;
            contador++;
        }

        System.out.println("A média da turma é: " + (soma / contador));
    }
}
