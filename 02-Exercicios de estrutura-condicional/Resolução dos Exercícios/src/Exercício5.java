import java.util.Scanner;

public class Exercício5 {
    public static void main(String[] args) {
     System.out.println("*****Valor a pagar pelo produto*****\n");
     System.out.print("*****Produtos disponíveis******\n-----------------------------------\nCODIGO    ESPECIFICAÇÃO    PREÇO\n1        Cachorro quente   R$ 4,00\n2        X-Salada          R$ 4,50\n3        X-Bacon           R$ 5,00\n4        Torrada Simples   R$ 2,00\n5        Refrigerante      R$ 1,50\n-----------------------------------\n\n");
     System.out.print("Para iniciar a compra, digite o código do produto: ");
     Scanner num = new Scanner(System.in);
     int x = num.nextInt();

     if (x==1){
        System.out.print("Produto escolhido: Cachorro quente.\n");
        System.out.print("Digite a quantidade desejada: ");
        int y = num.nextInt();
        double z = y*4;
        System.out.printf("\nO valor a pagar por %d Cachorro quente é: R$ %.2f\n\n",y,z);
     }
     else if (x==2){
        System.out.print("Produto escolhido: X-Salada.\n");
        System.out.print("Digite a quantidade desejada: ");
        int y = num.nextInt();
        double z = y*4.5;
        System.out.printf("\nO valor a pagar por %d X-Salada é: R$ %.2f\n\n ",y,z);
     }
     else if (x==3){
        System.out.print("Produto escolhido: X-Bacon.\n");
        System.out.print("Digite a quantidade desejada: ");
        int y = num.nextInt();
        double z = y*5;
        System.out.printf("\nO valor a pagar por %d X-Bacon é: R$ %.2f\n\n ",y,z);
     }
     else if (x==4){
        System.out.print("Produto escolhido: Torrada Simples ");
        int y = num.nextInt();
        double z = y*2;
        System.out.printf("\nO valor a pagar por %d Torrada Simples é: R$ %.2f\n\n ",y,z);
     }
     else if (x==5){
        System.out.print("Produto escolhido: Refrigerante.\n");
        System.out.print("Digite a quantidade desejada: ");
        int y = num.nextInt();
        double z = y*1.5;
        System.out.printf("\nO valor a pagar para %d Refrigerante é: R$ %.2f\n\n",y,z);
     }



     num.close();




    }
}
