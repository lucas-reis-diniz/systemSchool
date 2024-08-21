public class Curso {
    private String nomeCurso;
    private String codigoCurso;

    public Curso(String nomeCurso, String codigoCurso) {
        this.nomeCurso = nomeCurso;
        this.codigoCurso = codigoCurso;
    }

    public void matricularAluno(Aluno aluno, Campus campus) {
        aluno.setStatus(Status.MATRICULADO, campus);
        System.out.println("Aluno " + aluno.getNome() + " matriculado no curso " + this.nomeCurso + " no campus FIAP " + campus);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nomeCurso='" + nomeCurso + '\'' +
                ", codigoCurso='" + codigoCurso + '\'' +
                '}';
    }
}
