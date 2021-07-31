package pc2.lab.aula09.projetoFigGeometricaLucas.model;

public class Losango extends Quadrilatero{
    
    public Losango(int base, int altura){
        inferiorEsquerdo = new Ponto(0,0);
        inferiorDireito = new Ponto(base,0);
        superiorDireito = new Ponto(base,altura);
        superiorEsquerdo = new Ponto(0,altura);
    }
    
    // GETTERS AND SETTERS ------------------------

    public Ponto getOrigem() {
        return origem;
    }

    public void setOrigem(Ponto origem) {
        this.origem = origem;
    }

    public Ponto getInferiorEsquerdo() {
        return inferiorEsquerdo;
    }

    public void setInferiorEsquerdo(Ponto inferiorEsquerdo) {
        this.inferiorEsquerdo = inferiorEsquerdo;
    }

    public Ponto getInferiorDireito() {
        return inferiorDireito;
    }

    public void setInferiorDireito(Ponto inferiorDireito) {
        this.inferiorDireito = inferiorDireito;
    }

    public Ponto getSuperiorDireito() {
        return superiorDireito;
    }

    public void setSuperiorDireito(Ponto superiorDireito) {
        this.superiorDireito = superiorDireito;
    }

    public Ponto getSuperiorEsquerdo() {
        return superiorEsquerdo;
    }

    public void setSuperiorEsquerdo(Ponto superiorEsquerdo) {
        this.superiorEsquerdo = superiorEsquerdo;
    }
    
    //area = diagonal maior * diagonal menor / 2   D*d / 2
    
    public double getAreaLosango(){
        return superiorDireito.getX() * superiorEsquerdo.getY() / 2;  //revisar ------------------------ 
    }
    
    public double getPerimetroRetangulo(){
        return 
    }

    @Override
    public String toString() {
        return "\n\Losango: " + "\nBase: " + superiorDireito.getX() +     //alterar criar area e perimetro
                "\nAltura: " + superiorDireito.getY() +
                "\nPerimetro: " + getPerimetroRetangulo() + 
                "\n Area: " + getAreaLosango();
    }
    }
    
    
}
