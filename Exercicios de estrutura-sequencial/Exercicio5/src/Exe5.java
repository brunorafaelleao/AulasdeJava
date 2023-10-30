/*Fazer um programa para ler o código de uma peça 1, o número de peças 1,
 o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2,
 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago na compra
 de todas a peças.
 Obs: separador de decimais brasileiro e número de casas igual a 2.
*/
import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) throws Exception {
        System.out.print("****Compra de peças****\n\n\n");
        
        //Inserção de dados da peça 1
        System.out.print("Digite o código da peça 1: ");
        Scanner peca = new Scanner(System.in);
        int peca1 = peca.nextInt();
        System.out.printf("\nNúmero de peças \"%d\" a serem compradas: ",peca1);
        int numpecas1 = peca.nextInt();
        System.out.printf("\nValor unitário da peça \"%d\": ",peca1);
        double valor1 = peca.nextDouble();
       
        //inserção de dados da peça 2
        System.out.print("\n\nDigite o código da peça 2: ");
        int peca2 = peca.nextInt();
        System.out.printf("\nNúmero de peças \"%d\" a serem compradas: ",peca2);
        int numpecas2 = peca.nextInt();
        System.out.printf("\nValor unitário da peça \"%d\": ",peca2);
        double valor2 = peca.nextDouble();

        //Cálculo do valor da compra das duas peças
        System.out.printf("\n\nO valor a ser pago na compra das peças é R$ %.2f reais.\n\n",(numpecas1*valor1)+(numpecas2*valor2));



        peca.close();
    }
}
