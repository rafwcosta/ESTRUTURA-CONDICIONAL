import java.util.Scanner;
import java.util.Locale;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um número inteiro: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Número positivo.");
        }
        else {
            System.out.println("Número negativo.");
        }

        sc.close();

    }
}