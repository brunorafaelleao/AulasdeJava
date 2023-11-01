/*Exercício 3: Fazer um programa que leia 4 valores inteiros
A, B, C e D. A Seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D. (A*B)-(C*D)
 */
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) throws Exception {
        System.out.println("***Cálculo da Diferença do produto de A e B pelo produto de C e D***");
        System.out.println("\nDigite os valores:");
        System.out.print("Digite o valor de A: ");
        Scanner A = new Scanner(System.in);
        int a,b,c,d;
        a = A.nextInt();
        System.out.print("Digite o valor de B: ");
        b = A.nextInt();
        System.out.print("Digite o valor de C: ");
        c = A.nextInt();
        System.out.print("Digite o valor de D: ");
        d = A.nextInt();
    
    System.out.printf("\n\n(A x B) - (C x D) = %d\n\n",(a*b)-(c*d));
        A.close();

    }
}
