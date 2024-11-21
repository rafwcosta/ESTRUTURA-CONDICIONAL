import java.util.Scanner;
import java.util.Locale;

public class Exercicio5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Item 1: Cachorro quente -> R$ 4,00");
        System.out.println("Item 2: X-salada -> R$ 4,50");
        System.out.println("Item 3: X-bacon -> R$ 5,00");
        System.out.println("Item 4: Torrada -> R$ 2,00");
        System.out.println("Item 5: Refrigerante -> R$ 1,50");
        System.out.println();

        System.out.print("Código do item: ");
        int codigoDoItem = sc.nextInt();
        System.out.print("Quantidade desse item: ");
        int quantDoItem = sc.nextInt();

        double valorDaConta;

        if (codigoDoItem == 1) {
            valorDaConta = 4.0 * quantDoItem;
        }
        else if (codigoDoItem == 2) {
            valorDaConta = 4.5 * quantDoItem;
        }
        else if (codigoDoItem == 3) {
            valorDaConta = 5.0 * quantDoItem;
        }
        else if (codigoDoItem == 4) {
            valorDaConta = 2.0 * quantDoItem;
        }
        else {
            valorDaConta = 1.5 * quantDoItem;
        }

        System.out.printf("Você terá que pagar R$%.2f%n", valorDaConta);

        sc.close();

    }
}