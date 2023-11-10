package entidade;

public class Retangulo {
    public double largura;
    public double altura;

    public double areaRet(){
        double area = altura * largura;
        return area;
    }
    public double perimeRet(){
        double perimetro = 2*(largura + altura);
        return perimetro;
    }
    public double diagoRet(){
        double diagonal = Math.sqrt((altura*altura + largura*largura));
        return diagonal;
    }

    }