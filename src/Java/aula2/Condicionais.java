package Java.aula2;

public class Condicionais {
    public static void main(String[] args) {

        int idade = 20;
        if(idade < 12){
            System.out.println("Você é uma criança");
        }else if(idade < 18){
            System.out.println("Você é um adolecente");
        } else{
            System.out.println("Você é maior de idade");
        }


        boolean temCarteira = true;
        boolean temDocumento = true;

        if(temCarteira && idade > 18){
            System.out.println("Você pode dirigir");

        }

        boolean estaChovendo = true;
        if (!estaChovendo){
            System.out.println("Não está chovendo, pode sair!");
        }else{
            System.out.println("Está chovendo, não posso sair!");

        }

        int diaDaSemana = 1;

        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número inválido!");
        }
    }
}

