import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        System.out.print("****Número par ou ímpar****\n\n");

        System.out.print("Digite o número: ");
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();

        if(x%2==0){
            System.out.println("\n\nNúmero digitado é par");
        }
        else {
            System.out.println("\n\nNúmero digitado é ímpar");
        }

        num.close();
    }
}
