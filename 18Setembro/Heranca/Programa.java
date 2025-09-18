public class Programa {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.matricula = "123";
        aluno1.nome = "Letícia";
        aluno1.cr = 9.1;

        Aluno aluno2 = new Aluno();
        aluno2.matricula = "987";
        aluno2.nome = "Vinícius";
        aluno2.cr = 7.3;

        Professor professor1 = new Professor();
        professor1.matricula = "171";
        professor1.nome = "Thiago";
        professor1.nps = 6.0;

        System.out.println("CR dos alunos: ");
        System.out.println(aluno1.nome + " - " + aluno1.cr);
        System.out.println(aluno2.nome + " - " + aluno2.cr);
    }
}
