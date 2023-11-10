import java.util.Scanner;
import entidade.Retangulo;

public class App {
    public static void main(String[] args) {
        System.out.println("*****Cálculo da área, perímetro e diagonal de um retângulo*****\n\n");
        System.out.print("Digite o valor da altura do retângulo: ");

        Scanner ret = new Scanner(System.in);
        Retangulo x, y;
        x = new Retangulo();
        y = new Retangulo();

        x.altura = ret.nextDouble();

        
        System.out.printf("A altura do retângulo é: %.1f\n",x.altura);

        ret.close();
    }
}
