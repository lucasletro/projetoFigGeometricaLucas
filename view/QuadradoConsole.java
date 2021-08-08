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

    public Quadrado editarQuadrado() {
        showLnMsg("------ EDITAR QUADRADO -----");
        showLnMsg("Digite o id do quadrado para editar");
        return null;
    }

    public void listarQuadrado(ArrayList<FiguraGeometrica> lista) {
        showLnMsg("------ LISTAR QUADRADO -----");
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Quadrado) {
                showLnMsg(lista.get(i).toString());
            }
        }
    }

    public int showQuadradoSubMenu() {
        int option = 0;
        do {
            option = super.showSubMenu();
            return option;

        } while (option < 6);

    }

}
