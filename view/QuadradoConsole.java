package pc2.lab.aula09.projetoFigGeometricaLucas.view;

import java.util.ArrayList;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.FiguraGeometrica;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.Quadrado;

public class QuadradoConsole extends BasicConsole {

    public Quadrado askQuadrado() {
        showLnMsg("Digite um inteiro para o tamanho do lado do quadrado: ");
        int tamanho = in.nextInt();
        Quadrado quad = new Quadrado(tamanho);

        return quad;
    }

    public void listarQuadrado(ArrayList<FiguraGeometrica> lista) {

        if (lista.isEmpty()) {
            showLnMsg("Nao existe a figura na lista. ");
        } else {
            showLnMsg("------ LISTAR QUADRADO -----");
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i) instanceof Quadrado) {
                    showLnMsg(lista.get(i).toString());
                }
            }
        }
    }

    public int showQuadradoSubMenu() {
        int option = 0;

        option = super.showSubMenu();
        return option;

    }

}
