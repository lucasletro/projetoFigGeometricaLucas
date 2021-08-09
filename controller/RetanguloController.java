/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc2.lab.aula09.projetoFigGeometricaLucas.controller;

import java.util.ArrayList;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.FiguraGeometrica;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.Retangulo;
import pc2.lab.aula09.projetoFigGeometricaLucas.view.RetanguloConsole;

/**
 *
 * @author Lucas Letro
 */
public class RetanguloController extends AlessioPaint {
    
    public String getIndicesDosRetangulos() {
        ArrayList<FiguraGeometrica> lista = super.getListaFiguraGeometrica();
        String indexes = "";
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Retangulo) {
                indexes = indexes + ", " + String.valueOf(i);
                //showLnMsg("Index do quadrado:" + i);
            }
        }
        return indexes;
    }
    
    
    public void showRetanguloMenu() {
        RetanguloConsole retanguloConsole = new RetanguloConsole();
        int option = 0;
        String indices;
        ArrayList<FiguraGeometrica> arrayFig;
        do {
            option = retanguloConsole.ShowRetanguloSubMenu();

            switch (option) {
                case 1:
                    Retangulo ret = retanguloConsole.askRetangulo();
                    super.insertFiguraGeometrica(ret);
                    break;
                case 2:
                    //EDITAR
                    indices = getIndicesDosRetangulos();
                    if ("".equals(indices)) {
                        retanguloConsole.showLnMsg("Nao existe a figura na lista. ");
                    } else {

                        int index = retanguloConsole.askInt("Digite o index que deseja editar:  " + indices);
                        if (indices.contains(String.valueOf(index))) {
                            ret = retanguloConsole.askRetangulo();
                            super.setNewValueToList(ret, index);
                        } else {
                            retanguloConsole.showLnMsg("Este indice é invalido.");
                        }

                        //quad = (Quadrado) super.getFiguraIndiceLista(indices);
                    }

                    break;
                case 3:
                    //listar
                    arrayFig = super.getListaFiguraGeometrica();
                    retanguloConsole.listarRetangulo(arrayFig);
                    break;
                case 4:
                    //mostrar

                    indices = getIndicesDosRetangulos();
                    if ("".equals(indices)) {
                        retanguloConsole.showLnMsg("Nao existe a figura na lista. ");
                        //return;
                    } else {
                        int indice = retanguloConsole.askInt("Digite o indice que deseja mostrar: " + indices);
                        if (indices.contains(String.valueOf(indice))) {
                            super.mostrarIndice(indice);
                        } else {
                            retanguloConsole.showLnMsg("Este indice é invalido.");
                        }

                    }

                    //arrayFig = super.getListaFiguraGeometrica();
                    //quadrado console perguntar qual indice desejado (parametro indices)
                    //super.listarindice toString()
                    break;
                case 5:
                    //apagar
                    indices = getIndicesDosRetangulos();
                    if ("".equals(indices)) {
                        retanguloConsole.showLnMsg("Nao existe a figura na lista. ");
                    } else {
                        int index = retanguloConsole.askInt("Digite o index que deseja excluir:  " + indices);
                        super.excluirIndexDaLista(index);
                    }
                    break;
                default:
                    super.mostrarMenu();
                    break;
            }
        } while (option < 6);
    }
    
    
    
}
