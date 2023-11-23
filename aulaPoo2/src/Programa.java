import java.util.Scanner;

import utilitarios.ConversorMoeda;

public class Programa {
    public static void main(String[] args) throws Exception {
        System.out.print("*****Calculadora Dólar/Real*****\n\n");

        System.out.print("Preço do dólar em reais(valor atual): ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();

        System.out.print("\nQuantos dólares deseja comprar: ");
        double y = sc.nextDouble();

        double valor = x*y;

        System.out.printf("\nValor a pagar sem IOF: R$ %.2f",valor);

        Double valorFinal = ConversorMoeda.valorFinal(valor);

         System.out.printf("\n\nValor final com o acréscimo do IOF: R$ %.2f\n\n",valorFinal);

        sc.close();
        
    }
}
