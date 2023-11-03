import java.util.Scanner;


public class Exercicio4 {

    public static void main(String[] args) {
        System.out.println("*****Duração do jogo*****\n");
        System.out.print("Hora inicial da jogo: ");
        Scanner hora = new Scanner(System.in);
        int x = hora.nextInt();
        System.out.print("\nHora final da jogo: ");
        int y = hora.nextInt();

        if (x > y){
            System.out.printf("\n\nO jogo durou: %d horas\n\n",(y+24)-x);
        }
        else if(x == y) {
            System.out.printf("\n\nO jogo durou: 24 horas\n\n");
        }
        else {
            System.out.printf("\n\nO jogo durou: %d horas\n\n",y-x);

        }

       hora.close();

    }
}