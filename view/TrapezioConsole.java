/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc2.lab.aula09.projetoFigGeometricaLucas.view;

import java.util.ArrayList;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.FiguraGeometrica;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.Trapezio;

/**
 *
 * @author Lucas Letro
 */
public class TrapezioConsole extends BasicConsole {

    public Trapezio askTrapezio() {
        showLnMsg("Digite um valor para a base maior do trapezio: ");
        int baseMaior = in.nextInt();

        showLnMsg("Digite um valor para a base menor do trapezio: ");
        int baseMenor = in.nextInt();

        showLnMsg("Digite um valor para a altura do trapezio: ");
        int altura = in.nextInt();

        showLnMsg("Digite um valor para o lado do trapezio: ");
        int lado = in.nextInt();

        Trapezio trap = new Trapezio(baseMaior, baseMenor, altura, lado);
        return trap;
    }

    public void listarTrapezio(ArrayList<FiguraGeometrica> lista) {

        if (lista.isEmpty()) {
            showLnMsg("Nao existe a figura na lista. ");
        } else {
            showMsg("------ LISTAR TRAPEZIO -----\n");
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i) instanceof Trapezio) {
                    showMsg(lista.get(i).toString() + "\n");
                }
            }
        }
    }

    public int ShowTrapezioSubMenu() {
        int option = 0;

        option = super.showSubMenu();
        return option;

    }

}
