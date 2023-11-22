package entidade;

public class Funcionario {
    public String nomefunc;
    public Double salarioBruto;
    public Double imposto;

    public double salarioLiquido(){
        return salarioBruto - imposto;
    }
    public double novosalario(Double porcentagem){
        return (salarioBruto + (salarioBruto*porcentagem / 100.0)) - imposto;

    }

    
}
