package Java.Funcoes;

public class Aluno extends Pessoa {

    private String matricula;

    // Construtor vazio
    public Aluno() {
        super();
    }

    // Construtor com todos os atributos
    public Aluno(String nome, int idade, double altura, String matricula) {
        super(nome, idade, altura);
        this.matricula = matricula;
    }

    // Getter
    public String getMatricula() {
        return matricula;
    }

    // Setter
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}