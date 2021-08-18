/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc2.lab.aula09.projetoFigGeometricaLucas.view;

import java.util.ArrayList;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.FiguraGeometrica;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.Triangulo;

/**
 *
 * @author Lucas Letro
 */
public class TrianguloConsole extends BasicConsole {

    public Triangulo askTriangulo() {
        showLnMsg("Digite a base do Triangulo: ");
        int base = in.nextInt();
        //requisi��o de altura
        showLnMsg("Digite a altura do Triangulo: ");
        int altura = in.nextInt();

        Triangulo tri = new Triangulo(base, altura);

        return tri;
    }

    public void listarTriangulo(ArrayList<FiguraGeometrica> lista) {

        if (lista.isEmpty()) {
            showLnMsg("Nao existe a figura na lista. ");
        } else {
            showMsg("------ LISTAR TRIANGULO -----\n");
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i) instanceof Triangulo) {
                    showMsg(lista.get(i).toString() + "\n");
                }
            }
        }
    }

    public int ShowTrianguloSubMenu() {
        int option = 0;

        option = super.showSubMenu();
        return option;

    }

}
