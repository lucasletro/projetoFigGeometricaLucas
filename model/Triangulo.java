package pc2.lab.aula09.projetoFigGeometricaLucas.model;

public class Triangulo extends FiguraGeometrica {

    private Ponto inferiorEsquerdo;
    private Ponto inferiorDireito;
    private Ponto superior;
    
    private int base, altura;
    
    public Triangulo(int base, int altura) {
        inferiorEsquerdo = new Ponto(0, 0);
        inferiorDireito = new Ponto(base, 0);
        superior = new Ponto(base / 2, altura);
        
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }
    
    
    
    
    

    public double AreaTriangulo() {
        return -1;
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

    public Ponto getSuperior() {
        return superior;
    }

    public void setSuperior(Ponto superior) {
        this.superior = superior;
    }

    public double getAreaTriangulo() {
        return inferiorDireito.getX() * superior.getY() / 2;
    }

    public double getPerimetroTriangulo() {
        //calculo distancia pontos inferior direito e esquerdo
        int x1 = inferiorEsquerdo.getX();
        int y1 = inferiorEsquerdo.getY();

        int x2 = inferiorDireito.getX();
        int y2 = inferiorDireito.getY();
        
        double dist1 = distance(x1,y1,x2,y2);
//----------------------------------------------
        x1 = inferiorEsquerdo.getX();
        y1 = inferiorEsquerdo.getY();

        x2 = superior.getX();
        y2 = superior.getY();
        
        double dist2 = distance(x1,y1,x2,y2);
//--------------------------------------------------
        x1 = inferiorDireito.getX();
        y1 = inferiorDireito.getY();

        x2 = superior.getX();
        y2 = superior.getY();
        
        double dist3 = distance(x1,y1,x2,y2);

        return dist1+dist2+dist3;
    }
    public double distance(int x1, int y1, int x2, int y2)
    {
        return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }

    @Override
    public String toString() {
        return "\nTriangulo: " + "\nBase: " + inferiorDireito.getX() +
                " Altura: " + superior.getY() +
                " Perimetro: " + getPerimetroTriangulo() + 
                " Area: " + getAreaTriangulo();
    }
    
}
