import javax.swing.*;
import java.util.Scanner;

// declaração padrão do método main
public class Programa {

    public static void main(String[] args) {

        // instanciação da classe Scanner
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        String nome = teclado.next();

        // Imprimindo uma mensagem no console (saída padrão de IDE)
        System.out.println("Informe a sua idade: ");
        // declaração e atribuição da variável idade, recebendo o
        // conteúdo informado pelo o usuário via teclado
        int idade = teclado.nextInt();

        // Imprimindo uma mensagem no console, concatenando com
        // o valor da variável idade
        System.out.println("O nome informado é " + nome);
        System.out.println("A idade informada é " + idade);
    }
}
