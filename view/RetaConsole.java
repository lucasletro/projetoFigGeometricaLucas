/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc2.lab.aula09.projetoFigGeometricaLucas.view;

import java.util.ArrayList;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.FiguraGeometrica;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.Reta;

/**
 *
 * @author Lucas Letro
 */
public class RetaConsole extends BasicConsole {
    
    public Reta askReta() {
        showLnMsg("Digite um valor para o tamanho da reta: ");
        int tamanho = in.nextInt();
        Reta reta = new Reta(tamanho);
        return reta;
    }

    public void listarReta(ArrayList<FiguraGeometrica> lista) {
        if (lista.isEmpty()) {
            showLnMsg("Nao existe a figura na lista. ");
        } else {
            showMsg("------ LISTAR RETA -----\n");
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i) instanceof Reta) {
                    showMsg(lista.get(i).toString() + "\n");
                }
            }
        }

    }

    public int ShowRetaSubMenu() {
        int option = 0;

        option = super.showSubMenu();
        return option;

    }
    
    
    
}
