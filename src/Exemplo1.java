import java.util.Scanner;
import java.util.Locale;

public class Exemplo1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // ENTRADA
        System.out.print("Quantas horas?: ");
        int horas = sc.nextInt();

        // ESTRUTURA CONDIIONAL IF E ELSE
        if (horas < 12) {
            System.out.println("Bom dia!");
        }
        else if (horas < 18) {
            System.out.println("Boa tarde!");
        }
        else {
            System.out.println("Boa noite!");
        }

        // FECHAMENTO DO CÓDIGO
        sc.close();

    }
}

// Data: 21/11/24