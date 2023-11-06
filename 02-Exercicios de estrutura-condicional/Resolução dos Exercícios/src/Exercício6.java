import java.util.Locale;
import java.util.Scanner;

public class Exercício6 {
    public static void main(String[] args) {
        System.out.println("*****Intervalo de números*****\n");
        System.out.print("Intervalos acessíveis:\n");
        System.out.println("[0,25];[25,50];[50,75];[75,100]\n");
        System.out.print("Digite o valor para saber a qual intervalo pertence (formato americano): ");
        Locale.setDefault(Locale.US);
        Scanner num = new Scanner(System.in);
        double x = num.nextDouble();
        
        if (x>=0 && x<=25){
            System.out.printf("\nO valor \"%.2f\" pertence ao intervalo \"[0,25]\"\n\n",x);
        }
        else if (x>25 && x<=50){
             System.out.printf("\nO valor \"%.2f\" pertence ao intervalo \"[25,50]\"\n\n",x);
        }
        else if (x>50 && x<=75){
            System.out.printf("\nO valor \"%.2f\" pertence ao intervalo \"[50,75]\"\n\n",x);
        }
        else if (x>75 && x<=100){
            System.out.printf("\nO valor \"%.2f\" pertence ao intervalo \"[75,100]\"\n\n",x);
        }
        else {
            System.out.printf("\nO valor \"%.2f\" está fora dos intervalos disponíveis!\n\n",x);
        }
    

        num.close();
        
    }
    
}
