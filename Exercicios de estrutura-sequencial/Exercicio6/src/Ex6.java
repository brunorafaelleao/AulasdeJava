/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B. */

import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

public class Ex6 {
    public static void main(String[] args) throws Exception {
        //Inserção dos dados para usarmos nas fórmulas
        System.out.print("****Cálculo de áreas geométricas****");
        System.out.print("\n\nDigite um valor para A: ");
        Locale.setDefault(Locale.US);
        Scanner valor = new Scanner(System.in);
        double A = valor.nextDouble();
        System.out.print("\nDigite um valor para B: ");
        double B = valor.nextDouble();
        System.out.print("\nDigite um valor para C: ");
        double C = valor.nextDouble();
        double pi = 3.14159;

        //Cálculo das áreas de acordo com o exercício
        System.out.printf("\n\nPara a área do triângulo retângulo que tem A por base e C por altura temos o seguinte valor: %.3f\n\n",(A*C)/2);
        System.out.printf("Para a área do círculo de raio C temos o seguinte valor: %.3f\n\n",Math.pow(C, 2)*pi);
        System.out.printf("Para a área do trapézio que tem A e B por bases e C por altura temos o seguinte valor: %.3f\n\n",((A+B)*C)/2);
        System.out.printf("Para a área do quadrado que tem lado B temos o seguinte valor: %.3f\n\n",Math.pow(B,2));
        System.out.printf("Para a área do retângulo que tem lados A e B temos o seguinte valor: %.3f\n\n",A*B);



        valor.close();



    }
}
