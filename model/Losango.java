package pc2.lab.aula09.projetoFigGeometricaLucas.model;

public class Losango extends Quadrilatero {

    private int diagonalInferior;
    private int diagonalSuperior;
    private float tamanhoLado;

    public int getDiagonalInferior() {
        return diagonalInferior;
    }

    public void setDiagonalInferior(int diagonalInferior) {
        this.diagonalInferior = diagonalInferior;
    }

    public int getDiagonalSuperior() {
        return diagonalSuperior;
    }

    public void setDiagonalSuperior(int diagonalSuperior) {
        this.diagonalSuperior = diagonalSuperior;
    }

    public float getTamanhoLado() {
        return tamanhoLado;
    }

    public void setTamanhoLado(int tamanhoLado) {
        this.tamanhoLado = tamanhoLado;
    }
    
    
    
    

    public Losango(int diagonalInferior, int diagonalSuperior) {
        this.diagonalInferior = diagonalInferior;
        this.diagonalSuperior = diagonalSuperior;
        this.tamanhoLado = (float) Math.sqrt(((float)diagonalInferior / 2 * (float)diagonalInferior / 2) + ((float)diagonalSuperior/ 2 * (float)diagonalSuperior/ 2));
    }

    //area = diagonal maior * diagonal menor / 2   D*d / 2
    public double getAreaLosango() {
        return tamanhoLado * tamanhoLado;
    }

    public double getPerimetroLosango() {
        return tamanhoLado * 4;
    }
//----------------------------------------------------------------------

    @Override
    public String toString() {
        return "\n\nLosango: "
                + "\nPerimetro: " + getPerimetroLosango()
                + "\nTamanhoLado: " + getTamanhoLado()
                + "\nArea: " + getAreaLosango();

    }

}
