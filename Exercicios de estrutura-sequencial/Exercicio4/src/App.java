/* Faça um programa que leia:
1) um número de um funcionário
2) seu número de horas trabalhadas
3) valor por hora
4) Cálculo do salário do funcionário
5) Exibe o número do funcionário e o salário com duas casas decimais */

import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("****Cálculo de horas trabalhadas****\n\n\n");

        System.out.print("Digite o número do funcionário: ");
        Locale.setDefault(Locale.US);
        Scanner numFuncionario = new Scanner (System.in);
        int x = numFuncionario.nextInt();
        System.out.print("\nHoras trabalhadas pelo funcionário: ");
        Scanner horaTrabalhada = new Scanner(System.in);
        double y = horaTrabalhada.nextDouble();
        System.out.print("\nDigite o valor da hora trabalho: ");
        Scanner valorHora = new Scanner(System.in);
        double z = valorHora.nextDouble();

        System.out.printf("\n\nO salário do servidor \"%d\" será de R$ %.2f\n\n",x,y*z);





        numFuncionario.close();
        horaTrabalhada.close();
        valorHora.close();
    }
}
