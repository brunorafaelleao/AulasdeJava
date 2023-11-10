import java.util.Scanner;
import entidade.Retangulo;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println("*****Cálculo da área, perímetro e diagonal de um retângulo*****\n\n");
        System.out.print("Digite o valor da altura do retângulo: ");
        Scanner ret = new Scanner(System.in);
        Retangulo x;
        x = new Retangulo();
        x.altura = ret.nextDouble();      
        System.out.printf("\nA altura do retângulo é: %.1f\n",x.altura);

        System.out.print("\nDigite o valor da largura do retângulo: ");
        x.largura = ret.nextDouble();
        System.out.printf("\nA largura do retângulo é: %.1f\n",x.largura);

        System.out.printf("\nA área do retângulo é: %.2f\n",x.areaRet());

        



        ret.close();
    }
}
