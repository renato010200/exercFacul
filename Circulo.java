package Circulo;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    public double getRaio() {
        return this.raio;
    }
    public double calculaArea(){
        return Math.PI * this.raio * this.raio;
    }
    public double calculaPerimetro(){
        return 2 * Math.PI * this.raio;
    }

}
