import java.util.Scanner;
import java.util.Locale;

public class Exercicio6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um valor qualquer de 0 a 100: ");
        double valor = sc.nextDouble();

        if (valor < 0 || valor > 100) {
            System.out.println("Fora de intervalo.");
        }
        else if (valor <= 25) {
            System.out.println("[0,25]");
        }
        else if (valor <= 50) {
            System.out.println("[25,50]");
        }
        else if (valor <= 75) {
            System.out.println("[50,75]");
        }
        else {
            System.out.println("[75,100]");
        }

        sc.close();

    }
}