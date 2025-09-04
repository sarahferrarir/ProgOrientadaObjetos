/*
Ler notas de alunos até que o usuário digite -1.
Ao final imprimir a quantidade de alunos, a média da turma, a maior nota e a menor nota.
 */
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double soma = 0;
        double contador = 0;
        double maior = 0;
        double menor = 10;

        for (int i = 1; ;i++) {
            System.out.println("Informe a nota do aluno " + i + ":");
            double nota = teclado.nextDouble();
            if (nota == -1)
                break;
            if (nota > maior){
                maior = nota;
            } else if (nota < menor) {
                menor = nota;
            }
            soma += nota;
            contador++;
        }

        System.out.println("A turma possui " + contador + " alunos.");
        System.out.println("A média da turma é: " + (soma / contador));
        System.out.println("A maior nota da turma foi: " + maior);
        System.out.println("A menor nota da turma foi: " + menor);
    }
}
