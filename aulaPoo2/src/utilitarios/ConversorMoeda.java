package utilitarios;

public class ConversorMoeda {

    public static final double IOF = 0.06; 

    public static double valorFinal(double valor){
        return valor + (valor * IOF);
    }
    
}