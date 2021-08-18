/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc2.lab.aula09.projetoFigGeometricaLucas.view;

import java.util.ArrayList;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.Circulo;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.FiguraGeometrica;

/**
 *
 * @author Lucas Letro
 */
public class CirculoConsole extends BasicConsole {

    public Circulo askCirculo() {
        showLnMsg("Digite um valor para o raio do circulo: ");
        int raio = in.nextInt();
        Circulo cir = new Circulo(raio);
        return cir;
    }

    public void listarCirculo(ArrayList<FiguraGeometrica> lista) {
        if (lista.isEmpty()) {
            showLnMsg("Nao existe a figura na lista. ");
        } else {
            showMsg("------ LISTAR CIRCULO -----\n");
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i) instanceof Circulo) {
                    showMsg(lista.get(i).toString() + "\n");
                }
            }
        }

    }

    public int ShowCirculoSubMenu() {
        int option = 0;

        option = super.showSubMenu();
        return option;

    }

}
