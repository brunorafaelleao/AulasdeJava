import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        System.out.println("*****Senha válida ou inválida*****\n");
        System.out.println("Digite a senha para acessar o sistema:");
        Scanner senha = new Scanner(System.in);
        int x = 2002;
        int y = senha.nextInt();

        while (y != x) {
            System.out.println("\nSenha inválida");
            System.out.println("\nDigite a senha para acessar o sistema:");
            y = senha.nextInt();

        }
        System.out.print("\nAcesso permitido.Bem vindo!\n");

        senha.close();
    }
}