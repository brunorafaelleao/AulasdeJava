import java.util.Scanner;
import java.lang.Math;

public class Exercicio3{

    public static void main(String[] args) {
        System.out.println("*****Números múltiplos*****\n\n");
        
        System.out.print("Digite o primeiro número: ");
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();

        System.out.print("\nDigite o segundo número: ");
        int y = num.nextInt();

        if (Math.max(x, y)%Math.min(x, y)==0){
            System.out.println("\nOs números são múltiplos!\n");
        }
        else{
            System.out.println("\nOs números não são múltiplos!");
        }





        num.close();



    }

}