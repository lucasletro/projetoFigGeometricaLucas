package pc2.lab.aula09.projetoFigGeometricaLucas.model;

import pc2.lab.aula09.projetoFigGeometricaLucas.model.enums.OpcoesMenuEnum;

public class Quadrado extends Retangulo  {

    private int tamanhoLado;

    public Quadrado() {
        this(1);
    }

    public Quadrado(int tamanhoLado) {
        this(new Ponto(0, 0), tamanhoLado);
        this.tamanhoLado = tamanhoLado;
    }
    

    public Quadrado(Ponto origem, int tamanhoLado) {
        this.tamanhoLado = tamanhoLado;
        this.origem = origem;
        this.setInferiorEsquerdo(origem);

        this.getInferiorEsquerdo().setX(origem.getX() + tamanhoLado);
        this.getInferiorEsquerdo().setY(origem.getY());

        this.setInferiorDireito(new Ponto(origem.getX() + tamanhoLado, origem.getY()));

        this.setSuperiorDireito(new Ponto(origem.getX() + tamanhoLado, origem.getY() + tamanhoLado));
        this.setSuperiorEsquerdo(new Ponto(origem.getX(), origem.getY() + tamanhoLado));
    }

    public void setTamanho(int tamanhoLado) {
        inferiorEsquerdo = new Ponto(0, 0);
        inferiorDireito = new Ponto(0, tamanhoLado);
        superiorDireito = new Ponto(tamanhoLado, tamanhoLado);
        superiorEsquerdo = new Ponto(tamanhoLado, 0);
    }

    public void setOrigem(int tamanhoLado) {
        inferiorEsquerdo = new Ponto(0, 0);
        inferiorDireito = new Ponto(0, tamanhoLado);
        superiorDireito = new Ponto(tamanhoLado, tamanhoLado);
        superiorEsquerdo = new Ponto(tamanhoLado, 0);
    }

    @Override
    public double getArea() {
        return tamanhoLado * tamanhoLado;
    }

    @Override
    public double getPerimetro() {
        return tamanhoLado * 4;
    }

    @Override
    public String toString() {
        return "\nQuadrado: "
                + "\nTamanho do lado: " + tamanhoLado + " Perimetro: " + getPerimetro()
                + " Area: " + getArea();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Quadrado quadrado = (Quadrado) o;

        return tamanhoLado == quadrado.tamanhoLado;
    }

    @Override
    public int hashCode() {
        return tamanhoLado;
    }

    public int getTamanhoLado() {
        return tamanhoLado;
    }
    
    
    

}
