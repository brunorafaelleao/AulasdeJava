import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        System.out.println("******A qual quadrante pertence as coordenadas?******\n");
        System.out.print("Digite os valores:\n");
        System.out.print("Valor 1 (x): ");
        Locale.setDefault(Locale.US);
        Scanner num = new Scanner(System.in);
        double x = num.nextDouble();
        System.out.print("Valor 2 (y): ");
        double y = num.nextDouble();
        
        if(x==0 && y==0){
            System.out.printf("Para x = %.1f e y = %.1f, temos as coordenadas que pertencem à Origem.\n\n",x,y);
        }
        else if (x>0 && y>0){
             System.out.printf("Para x = %.1f e y = %.1f, temos as coordenadas que pertencem ao Q1.\n\n",x,y);
        }
        else if (x<0 && y>0){
             System.out.printf("Para x = %.1f e y = %.1f, temos as coordenadas que pertencem ao Q2.\n\n",x,y);
        }
        else if (x<0 && y<0){
             System.out.printf("Para x = %.1f e y = %.1f, temos as coordenadas que pertencem ao Q3.\n\n",x,y);
        }
        else if (x>0 && y<0){
             System.out.printf("Para x = %.1f e y = %.1f, temos as coordenadas que pertencem ao Q4.\n\n",x,y);
        }
        else if (x==0 && y!=0){
             System.out.printf("Para x = %.1f e y = %.1f, temos as coordenadas que pertencem ao Eixo Y.\n\n",x,y);
        }
        else if (x!=0 && y==0){
             System.out.printf("Para x = %.1f e y = %.1f, temos as coordenadas que pertencem ao Eixo X.\n\n",x,y);
            }


        num.close();

    }
}
