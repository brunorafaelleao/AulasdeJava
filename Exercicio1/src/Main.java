/*Exercício 1:
Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
soma desses números com uma mensagem explicativa.*/
//início da resolução
/*importando a classe Scanner da biblioteca java.util
para poder fazer entrada de dados*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print("Vamos calcular a soma de dois números.\n\n\n");
        System.err.print("Digite o primeiro número: ");
        Scanner num1 = new Scanner(System.in);
        int numero1 = num1.nextInt();
        System.err.print("Digite o segundo número: ");
        Scanner num2 = new Scanner(System.in);
        int numero2 = num2.nextInt();

        System.out.printf("A soma dos números é: %d\n\n\n",numero1 + numero2);

        num1.close();
        num2.close();
    
    }
}
