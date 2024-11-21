import java.util.Scanner;
import java.util.Locale;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor do salário: ");
        double salario = sc.nextDouble();

        double imposto;

        if (salario <= 2000) {
            imposto = 0;
        }
        else if (salario <= 3000) {
            imposto = (salario - 2000) * 0.08;
        }
        else if (salario <= 4500) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0) {
            System.out.println("Isento de imposto");
        }
        else {
            System.out.printf("Imposto a pagar: R$ %.2f%n", imposto);
        }

        sc.close();

    }
}