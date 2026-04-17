package Java.Funcoes;

public class Coordenador extends Professor {

    private int qtdePessoas;

    // Construtor vazio
    public Coordenador() {
        super();
    }

    // Construtor com todos os atributos
    public Coordenador(String nome, int idade, double altura, double salario, String disciplina, int qtdePessoas) {
        super(nome, idade, altura, salario, disciplina);
        this.qtdePessoas = qtdePessoas;
    }

    // Getter
    public int getQtdePessoas() {
        return qtdePessoas;
    }

    // Setter
    public void setQtdePessoas(int qtdePessoas) {
        this.qtdePessoas = qtdePessoas;
    }
}