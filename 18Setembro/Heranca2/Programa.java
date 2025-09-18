import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite 1 para cadastrar um carro ou 2 para cadastrar uma moto:");
        int tipo = teclado.nextInt();

        if (tipo == 1){
            Carro carro1 = new Carro();
            System.out.println("Informe o chassi do carro: ");
            carro1.chassi = teclado.next();
            System.out.println("Informe a placa do carro: ");
            carro1.placa = teclado.next();
            System.out.println("Informe o número de portas do carro: ");
            carro1.numeroPortas = teclado.nextInt();

            System.out.println("Informações do carro cadastrado:");
            System.out.println("Chassi: " + carro1.chassi);
            System.out.println("Placa: " + carro1.placa);
            System.out.println("Número de portas: " + carro1.numeroPortas);
        } else if (tipo == 2) {
            Moto moto1 = new Moto();
            System.out.println("Informe o chassi da moto: ");
            moto1.chassi = teclado.next();
            System.out.println("Informe a placa da moto: ");
            moto1.placa = teclado.next();

            System.out.println("Informações da moto cadastrada:");
            System.out.println("Chassi: " + moto1.chassi);
            System.out.println("Placa: " + moto1.placa);
        }
    }
}
