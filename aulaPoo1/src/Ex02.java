import java.util.Scanner;

import entidade.Funcionario;

public class Ex02 {
    public static void main(String[] args) {
        System.out.println("****Calcular o salário de um funcionário****\n\n");
        Scanner sc = new Scanner(System.in, "UTF-8");
        Funcionario x = new Funcionario();
        System.out.print("Insira o nome do funcionário: ");
        x.nomefunc = sc.nextLine();
        System.out.print("\n\nInsira o salário bruto do funcionário: ");
        x.salarioBruto = sc.nextDouble();
        System.out.print("\n\nInsira o imposto sobre salário bruto do funcionário: ");
        x.imposto = sc.nextDouble();
        System.out.printf("\n\nO funcionário se chama %s, recebe um salário bruto de R$ %.2f, e tem um valor de imposto sobre seu salário de R$ %.2f. O que faz o seu salário líquido ser: R$ %.2f\n\n",x.nomefunc, x.salarioBruto, x.imposto, x.salarioLiquido());
        
        System.out.print("\nInsira o percentual de incremento: ");
        double porcentagem = sc.nextDouble();
        x.novosalario(porcentagem);

        System.out.printf("\nO salário do funcionário atualizado é: R$ %.2f",x.novosalario(porcentagem));
                     

        sc.close();

    }
    
}
