package pc2.lab.aula09.projetoFigGeometricaLucas.model;

public class Trapezio extends Quadrilatero {

    /*private Reta superior;
    private Reta inferior;
    private Reta direita;
    private Reta esquerda;

     private Reta lado 

    public Trapezio() {
        inferior = new Reta(0,0,2,0);
        direita = new Reta(2,0,1,1);
        superior = new Reta(1,1,0,1);
        esquerda = new Reta(0,1,0,0);
    }

    public Trapezio(Ponto pontoInicial, Ponto ponto2, Ponto ponto3, Ponto ponto4) {
        inferior = new Reta(pontoInicial.getX(),pontoInicial.getY(),ponto2.getX(),ponto2.getY());
        direita = new Reta(ponto2, ponto3);
        superior = new Reta(ponto3, ponto4);
        esquerda = new Reta(ponto4, pontoInicial);
    }*/
    //=====================================================================================================
    // area = ((B*b)/2)*h
    private double baseMaior;
    private double baseMenor;
    private double altura;
    private double lado;

    public Trapezio(double baseMaior, double baseMenor, double altura, double lado) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado = lado;
    }

    public double getAreaTrapezio() {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    public double getPerimetroTrapezio() {
        return baseMaior + baseMenor + (lado * 2);
    }

    @Override
    public String toString() {
        return "\n\nTrapezio: "
                + "\nPerimetro: " + getPerimetroTrapezio()
                + "\nArea: " + getAreaTrapezio();
    }

}
