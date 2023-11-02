import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        System.out.print("****Número negativo ou positivo****\n\n\n");
        System.out.print("Digite o valor: ");
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();

        if (x < 0) {
            System.out.println("O número digitado é negativo");
        }
        else if (x==0) {
            System.out.println("Número digitado é zero");
        }
        else {
            System.out.println("Número digitado é positivo");
        } 


        num.close();
    }
}
