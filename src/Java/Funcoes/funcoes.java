package Java.Funcoes;

public class funcoes {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        int soma;
        soma = somar(a, b);

        System.out.println("Resultado: " + soma);

        dizerOi();

    }

    public static int somar(int a, int b) {
        int resultado = a + b;
        return resultado; // return a + b
    }

    public static void dizerOi() {
        System.out.println("Oi!");
    }
}