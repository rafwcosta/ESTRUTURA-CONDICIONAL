import java.util.Scanner;
import java.util.Locale;

public class Exemplo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Seu plano: R$50,00/100min");
        System.out.print("Quanto minutos você consumiu no telefone?: ");
        int minutos = sc.nextInt();

        double valor = 50.0;
        if (minutos > 100) {
            valor = valor + (minutos - 100) * 2;
        }

        System.out.printf("Valor da conta a ser paga: R$ %.2f%n", valor);

        sc.close();

    }
}