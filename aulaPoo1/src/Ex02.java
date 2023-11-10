import java.util.Scanner;

import entidade.Funcionario;

public class Ex02 {
    public static void main(String[] args) {
        System.out.println("****Calcular o salário de um funcionário****\n\n");
        Scanner func = new Scanner(System.in);
        Funcionario x = new Funcionario();
        System.out.print("Insira o nome do funcionário: ");
        x.nomefunc = func.nextLine();
        System.out.print("\n\nInsira o salário bruto do funcionário: ");
        x.salarioBruto = func.nextDouble();
        System.out.print("\n\nInsira o imposto sobre salário bruto do funcionário: ");
        x.imposto = func.nextDouble();
        System.out.printf("\n\nO funcionário se chama %s, recebe um salário bruto de R$ %.2f, e tem um valor de imposto sobre seu salário de R$ %.2f.\n\n",x.nomefunc, x.salarioBruto, x.imposto);
              

        func.close();

    }
    
}
