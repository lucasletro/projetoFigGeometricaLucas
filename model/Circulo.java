package pc2.lab.aula09.projetoFigGeometricaLucas.model;

public class Circulo extends FiguraGeometrica {

    private double pi = 3.14;
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;

    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    
    
    /**
     * Função que retorna perimetro do circulo.
     * @return 
     */

    public double getPerimetroCirculo() {
        return 2 * pi * raio;
    }

    public double getAreaCirculo() {
        return pi * (raio * raio);
    }

    @Override
    public String toString() {
        return "\n\nCirculo: "
                + "\nPerimetro: " + getPerimetroCirculo()
                + "\nArea: " + getAreaCirculo();

    }

}
