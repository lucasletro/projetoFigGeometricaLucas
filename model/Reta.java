package pc2.lab.aula09.projetoFigGeometricaLucas.model;

public class Reta extends FiguraGeometrica{
    
    
    private int tamanho;
    
    
    
    public Reta(int tamanho) {
        this.tamanho = tamanho;
    }
    
    
    
     public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    
    @Override
    public String toString() {
        return "Reta{" + "tamanho=" + tamanho + '}';
    }
    
    
    
    
    
    
    
    
    
    
    

    /*private Ponto pontoInicia;
    private Ponto pontoFinal;

    public Reta() {
        pontoInicia = new Ponto(0,0);
        pontoFinal = new Ponto(0, 1);
    }

    public Reta(int xInicial, int yInicial, int xFinal, int yFinal) {
        pontoInicia = new Ponto(xInicial,yInicial);
        pontoFinal = new Ponto(xFinal, yFinal);
    }

    public Reta(Ponto pInicial, Ponto pFinal) {
        this.pontoInicia = pInicial;
        this.pontoFinal = pFinal;
    }

    public Ponto getPontoInicia() {
        return pontoInicia;
    }

    public void setPontoInicia(Ponto pontoInicia) {
        this.pontoInicia = pontoInicia;
    }

    public Ponto getPontoFinal() {
        return pontoFinal;
    }

    public void setPontoFinal(Ponto pontoFinal) {
        this.pontoFinal = pontoFinal;
    }

    @Override
    public String toString() {
        return "Reta{" + "pontoInicia=" + pontoInicia + ", pontoFinal=" + pontoFinal + '}';
    }*/

   

    
    
    
    
    
}
