/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc2.lab.aula09.projetoFigGeometricaLucas.view;

import java.util.ArrayList;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.FiguraGeometrica;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.Losango;

/**
 *
 * @author Lucas Letro
 */
public class LosangoConsole extends BasicConsole {

    public Losango askLosango() {
        showLnMsg("Digite a diagonal inferior do losango: ");
        int diagonalInferior = in.nextInt();
        //requisição de altura
        showLnMsg("Digite a diagonal superior do losango: ");
        int diagonalSuperior = in.nextInt();

        showLnMsg("Digite o tamanho do lado do losango: ");
        int tamanhoLado = in.nextInt();

        Losango los = new Losango(diagonalInferior, diagonalSuperior, tamanhoLado);
        return los;
    }

    public void listarLosango(ArrayList<FiguraGeometrica> lista) {

        if (lista.isEmpty()) {
            showLnMsg("Nao existe a figura na lista. ");
        } else {
            showLnMsg("------ LISTAR LOSANGO -----");
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i) instanceof Losango) {
                    showLnMsg(lista.get(i).toString());
                }
            }
        }
    }

    public int ShowLosangoSubMenu() {
        int option = 0;

        option = super.showSubMenu();
        return option;

    }

}
