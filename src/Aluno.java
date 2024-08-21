import java.io.ObjectInputFilter;

public class Aluno {
    private String nome;
    private String matricula;
    private Status status;
    private Campus campus;

    public Aluno(String nome, String matricula,Status status, Campus campus) {
        this.nome = nome;
        this.matricula = matricula;
        this.status = status;
        this.campus = campus;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public Campus getCampus() {
        return campus;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status, Campus campus) {
        this.status = status;
        this.campus = campus;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", status=" + status +
                ", campus=" + campus +
                '}';
    }
}
