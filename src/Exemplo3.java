import java.util.Scanner;
import java.util.Locale;

public class Exemplo3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println();
        System.out.println("1 - domingo");
        System.out.println("2 - segunda");
        System.out.println("3 - terça");
        System.out.println("4 - quarta");
        System.out.println("5 - quinta");
        System.out.println("6 - sexta");
        System.out.println("7 - sábado");
        System.out.println();
        System.out.print("Digite um valor inteiro de 1 a 7: ");
        int valorInteiro = sc.nextInt();

        System.out.println();
        if (valorInteiro == 1) {
            System.out.println("Dia da semana: Domingo");
        }
        else if (valorInteiro == 2) {
            System.out.println("Dia da semana: Segunda");
        }
        else if (valorInteiro == 3) {
            System.out.println("Dia da semana: Terça");
        }
        else if (valorInteiro == 4) {
            System.out.println("Dia da semana: Quarta");
        }
        else if (valorInteiro == 5) {
            System.out.println("Dia da semana: Quinta");
        }
        else if (valorInteiro == 6) {
            System.out.println("Dia da semana: Sexta");
        }
        else if (valorInteiro == 7) {
            System.out.println("Dia da semana: Sábado");
        }
        else {
            System.out.println("Valor inválido");
        }
        System.out.println();

        sc.close();

    }
}