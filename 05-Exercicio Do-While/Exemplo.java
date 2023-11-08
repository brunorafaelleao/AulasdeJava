import java.util.Scanner;

public class Exemplo {
   public static void main(String[] args) {
    System.out.print("****Conversão Celsius-Fahrenheit****\n\n");
    Scanner temp = new Scanner(System.in);
    String resp;

    do { 
        System.out.print("\nDigite o valor a ser convertido: ");
        double c = temp.nextDouble();
        double f = 9.0* c / 5 + 32;
        System.out.printf("\nO valor equivalente em Fahrenheut: %.1f\n",f);
        System.out.print("\nDeseja repetir a ação (sim/não)? ");
        resp = temp.next();

    } while (resp.equals("sim"));

    temp.close();

   } 
}
