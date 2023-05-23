package Triangulo;

public class Triangulo {
    private  double lado1;
    private  double lado2;
    private  double lado3;

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public double calculaArea(){
        double s = (this.lado1+this.lado2+this.lado3)/2;
        return Math.sqrt(s*(s - this.lado1) * (s - this.lado2) * (s - this.lado3));
    }
    public double calculaPerimetro(){
        return this.lado1 + this.lado2 + this.lado3;
    }
    public String getClassificacao(){
        if(this.lado1 == this.lado2 && this.lado2 == this.lado3){
            return "Equilatero";
        }if(this.lado1 == this.lado2 || this.lado2 == this.lado3|| this.lado3 == this.lado1){
            return "Isosceles";
        }else{
            return "Scaleno";
        }
    }
}

