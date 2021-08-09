/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc2.lab.aula09.projetoFigGeometricaLucas.view;

import java.util.ArrayList;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.FiguraGeometrica;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.Retangulo;

/**
 *
 * @author Lucas Letro
 */
public class RetanguloConsole extends BasicConsole {
    
    public Retangulo askRetangulo() {
        showLnMsg("Digite a base do retangulo");
        int base = in.nextInt();
        //requisição de altura
        showLnMsg("Digite a altura do retangulo");
        int altura = in.nextInt();

        Retangulo ret = new Retangulo(base, altura);

        return ret;
    }
    
    public void listarRetangulo(ArrayList<FiguraGeometrica> lista) {
        showLnMsg("------ LISTAR RETANGULO -----");
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Retangulo) {
                showLnMsg(lista.get(i).toString());
            }
        }
    }
    
    public int ShowRetanguloSubMenu() {
        int option = 0;
        
        option = super.showSubMenu();
        return option;
        
    }
    
}
