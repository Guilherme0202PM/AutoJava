package Java.Funcoes;

public class Professor extends Pessoa {

    private double salario;
    private String disciplina;

    public Professor() {
        super(); // chama o construtor vazio de Pessoa
    }

    public Professor(String nome, int idade, double altura, double salario, String disciplina) {
        super(nome, idade, altura); // chama o construtor de Pessoa
        this.salario = salario;
        this.disciplina = disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Getter e Setter para disciplina
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void aumentarSalario(double aumento) {
        System.out.println("Salário antes: " + this.salario);

        this.salario += aumento;

        System.out.println("Aumento aplicado: " + aumento);
        System.out.println("Salário atual: " + this.salario);
    }
}