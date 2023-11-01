/*Exercício 2: Fazer um programa para ler o raio de um círculo,
e depois mostrar o valor da área desse círculo com 4 casas decimais
fórmula do raio: pi.r², sendo pi = 3.14159
Obs: Para separador de casas decimais usar formato norteamericano
 */

import java.util.Scanner;
import java.lang.Math;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
        double pi = 3.14159;
        double quadRaio;
        double area;
        System.out.print("Cálculo da área de um círculo\n\n\n");
        
        Locale.setDefault(Locale.US);
        System.out.print("Digite o valor do raio: ");
        Scanner raio = new Scanner(System.in);
        double x;
        x = raio.nextDouble();
        quadRaio = Math.pow(x,2);
        area = pi*quadRaio;
        System.out.printf("\n\nValor do raio digitado foi: %.2f e a área do círculo é: %.4f\n\n\n",x,area); 

        raio.close();
    }
}
