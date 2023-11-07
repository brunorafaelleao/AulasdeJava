import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        System.out.println("******Leitura de coordenadas cartesianas não-nulas******\n");
        System.out.println("Digite o valor das coordenadas:");
        Scanner coordenada = new Scanner(System.in);
        System.out.print("Valor de x: ");
        double x = coordenada.nextDouble();
        System.out.print("Valor de y: ");
        double y = coordenada.nextDouble();

        while (x!=0 && y!=0) {
            if (x>0 && y>0){
                System.out.println("\nCoordendas digitadas ("+x+";"+y+") pertencem ao primeiro quadrante\n");
            }
            else if (x<0 && y>0){
                System.out.println("\nCoordendas digitadas ("+x+";"+y+") pertencem ao segundo quadrante\n");
            }
            else if (x<0 && y>0){
                System.out.println("\nCoordendas digitadas ("+x+";"+y+") pertencem ao segundo quadrante\n");
            }
            else if (x<0 && y<0){
                System.out.println("\nCoordendas digitadas ("+x+";"+y+") pertencem ao terceiro quadrante\n");
            }
            else if (x>0 && y<0){
                System.out.println("\nCoordendas digitadas ("+x+";"+y+") pertencem ao quarto quadrante\n");
            }
            System.out.print("Valor de x: ");
             x = coordenada.nextDouble();
             System.out.print("Valor de y: ");
             y = coordenada.nextDouble();
          }
          System.out.println("Acabou o programa");
    coordenada.close();
    }
}
