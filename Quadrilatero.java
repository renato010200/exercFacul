package Quadrilatero;

public class Quadrilatero {
    private  double lado1;
    private  double lado2;

    public double getLado1() {
        return this.lado1;
    }

    public double getLado2() {
        return this.lado2;
    }

    public Quadrilatero(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public double calculaArea(){
        return this.lado1 * this.lado2;
    }
    public double calculaPerimetro(){
        return  2 * this.lado1 * this.lado2;
    }
    public String getClassificacao(){
        if(this.lado1 == this.lado2){
            return "Quadrado";
        }else
            return "Retangulo";
    }
}


