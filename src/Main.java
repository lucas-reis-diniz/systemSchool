//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Lucas", "001", Status.MATRICULADO, Campus.PAULISTA);
        Curso curso1 = new Curso("Engenharia de Software", "2ESPS");

        curso1.matricularAluno(aluno1, Campus.PAULISTA);

        System.out.println(aluno1);
        System.out.println(curso1);
    }
}