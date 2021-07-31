package pc2.lab.aula09.projetoFigGeometricaLucas.model;

public class Trapezio extends Quadrilatero {

    private Reta superior;
    private Reta inferior;
    private Reta direita;
    private Reta esquerda;

    /* private Reta lado */

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
    }
    
    //=====================================================================================================

    public Reta getSuperior() {
        return superior;
    }

    public void setSuperior(Reta superior) {
        this.superior = superior;
    }

    public Reta getInferior() {
        return inferior;
    }

    public void setInferior(Reta inferior) {
        this.inferior = inferior;
    }

    public Reta getDireita() {
        return direita;
    }

    public void setDireita(Reta direita) {
        this.direita = direita;
    }

    public Reta getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Reta esquerda) {
        this.esquerda = esquerda;
    }
    
    // area = ((B*b)/2)*h
    
    public double getAreaTrapezio(){
        return 
    }
    
    public double getPerimetroTrapezio(){
        return 
    }

    @Override
    public String toString() {
        return "\n\Trapezio: " + "\nBase: " + superiorDireito.getX() +     //criar area e perimetro e alterar
                "\nAltura: " + superiorDireito.getY() +
                "\nPerimetro: " + getPerimetroTrapezio() + 
                "\n Area: " + getAreaTrapezio();
    }
    
    
    

}
