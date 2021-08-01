package pc2.lab.aula09.projetoFigGeometricaLucas.model;

public class Losango extends Quadrilatero {

    private int diagonalInferior;
    private int diagonalSuperior;
    private int tamanhoLado;

    public Losango(int diagonalInferior, int diagonalSuperior, int tamanhoLado) {
        this.diagonalInferior = diagonalInferior;
        this.diagonalSuperior = diagonalSuperior;
        this.tamanhoLado = tamanhoLado;
    }

    public Losango(int base, int altura) {
        inferiorEsquerdo = new Ponto(0, 0);
        inferiorDireito = new Ponto(base, 0);
        superiorDireito = new Ponto(base, altura);
        superiorEsquerdo = new Ponto(0, altura);
    }

    //area = diagonal maior * diagonal menor / 2   D*d / 2
    public double getAreaLosango() {
        return diagonalInferior * diagonalSuperior / 2;
    }

    public double getPerimetroLosango() {
        return tamanhoLado * 4;
    }
//----------------------------------------------------------------------

    @Override
    public String toString() {
        return "\n\nLosango: "
                + "\nPerimetro: " + getPerimetroLosango()
                + "\nArea: " + getAreaLosango();

    }

}
