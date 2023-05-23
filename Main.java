package Principal;


    import Circulo.Circulo;
    import Quadrilatero.Quadrilatero;
    import Triangulo.Triangulo;


    public class Main {
        public static void main(String[] args) {
            Circulo circulo = new Circulo(5);
            System.out.println("Circulo");
            System.out.println("Area: " + circulo.calculaArea());
            System.out.println("Perimetro: " + circulo.calculaPerimetro());
            System.out.println("Raio : " + circulo.getRaio());
            System.out.println();

            Quadrilatero quadrilatero = new Quadrilatero(5, 7);
            System.out.println("Quadrilatero");
            System.out.println("Area: " + quadrilatero.calculaArea());
            System.out.println("Perimetro: " + quadrilatero.calculaPerimetro());
            System.out.println("Classificação : " + quadrilatero.getClassificacao());
            System.out.println();

            Triangulo triangulo = new Triangulo(3, 3, 3);
            System.out.println("Triangulo");
            System.out.println("Area: " + triangulo.calculaArea());
            System.out.println("Perimetro: " + triangulo.calculaPerimetro());
            System.out.println("Classificação: " + triangulo.getClassificacao());
        }
    }
