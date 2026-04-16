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
    }
}

