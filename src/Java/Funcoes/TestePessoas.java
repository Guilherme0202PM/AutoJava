package Java.Funcoes;

public class TestePessoas {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();

        Pessoa p2 = new Pessoa("João", 25, 1.75);
        Pessoa p3 = new Pessoa("Maria", 30, 1.65);

        System.out.println("Pessoas criadas com sucesso!");

        Pessoa p = new Pessoa();
        p.setNome("Carlos");
        System.out.println(p.getNome());

        // Criando um Professor
        Professor prof = new Professor("Ana", 40, 1.68, 5000.0, "Matemática");

        System.out.println("\nProfessor criado:");
        System.out.println("Nome: " + prof.getNome());
        System.out.println("Idade: " + prof.getIdade());
        System.out.println("Altura: " + prof.getAltura());
        System.out.println("Salário: " + prof.getSalario());
        System.out.println("Disciplina: " + prof.getDisciplina());
        // Testando aumento de salário
        System.out.println("\nAplicando aumento...");
        prof.aumentarSalario(500);

        Professor prof2 = new Professor("Ana", 40, 1.68, 5000.0, "Matemática");
        prof2.aumentarSalario(500);


        // Criando um Aluno
        Aluno aluno = new Aluno("Pedro", 20, 1.78, "MAT2026001");

        System.out.println("\nAluno criado:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Altura: " + aluno.getAltura());
        System.out.println("Matrícula: " + aluno.getMatricula());

        // Criando um Coordenador (HERDA de Professor e Pessoa)
        Coordenador coord = new Coordenador(
                "Roberto",
                45,
                1.80,
                8000.0,
                "Engenharia",
                25
        );

        System.out.println("\nCoordenador criado:");
        System.out.println("Nome (Pessoa): " + coord.getNome());
        System.out.println("Altura (Pessoa): " + coord.getAltura());

        System.out.println("Salário (Professor): " + coord.getSalario());
        System.out.println("Disciplina (Professor): " + coord.getDisciplina());

        System.out.println("Qtd Pessoas (Coordenador): " + coord.getQtdePessoas());

        // Teste: alterar salário herdado de Professor
        System.out.println("\nAumentando salário do coordenador...");
        coord.aumentarSalario(1000);
    }
}