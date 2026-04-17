package Java.Funcoes;

public class TestePessoas {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();

        Pessoa p2 = new Pessoa("João", 25, 1.75);
        Pessoa p3 = new Pessoa("Maria", 30, 1.65);

        System.out.println("Pessoas criadas com sucesso!");
    }
}