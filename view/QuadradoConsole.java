package pc2.lab.aula09.projetoFigGeometricaLucas.view;

import pc2.lab.aula09.projetoFigGeometricaLucas.model.Quadrado;

public class QuadradoConsole extends BasicConsole{

    public Quadrado askQuadrado(){
        showMsg("Digite um interio para o tamanho do lado do quadrado");
        int tamanho  = in.nextInt();
        Quadrado quad = new Quadrado(tamanho);

        return quad;
    }
}
