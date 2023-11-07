import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();
        
        for (int i=1; i<=x; i++){
            if (i%2 != 0){
                System.out.println(i);
            }
        }
     num.close();
    }
}
