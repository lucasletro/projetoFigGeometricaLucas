/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc2.lab.aula09.projetoFigGeometricaLucas.controller;

import java.util.ArrayList;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.FiguraGeometrica;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.Reta;
import pc2.lab.aula09.projetoFigGeometricaLucas.view.RetaConsole;

/**
 *
 * @author Lucas Letro
 */
public class RetaController extends AlessioPaint {
    
    
    public String getIndicesDasRetas() {
        ArrayList<FiguraGeometrica> lista = super.getListaFiguraGeometrica();
        String indexes = "";
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Reta) {
                indexes = indexes + ", " + String.valueOf(i);
                //showLnMsg("Index do quadrado:" + i);
            }
        }
        return indexes;
    }

    public void showRetaMenu() {
        RetaConsole RetaConsole = new RetaConsole();
        int option = 0;
        String indices;
        ArrayList<FiguraGeometrica> arrayFig;
        do {
            option = RetaConsole.ShowRetaSubMenu();

            switch (option) {
                case 1:
                    Reta reta = RetaConsole.askReta();
                    super.insertFiguraGeometrica(reta);
                    break;
                case 2:
                    //EDITAR
                    indices = getIndicesDasRetas();
                    if ("".equals(indices)) {
                        RetaConsole.showLnMsg("Nao existe a figura na lista. ");
                    } else {

                        int index = RetaConsole.askInt("Digite o index que deseja editar:  " + indices);
                        if (indices.contains(String.valueOf(index))) {
                            reta = RetaConsole.askReta();
                            super.setNewValueToList(reta, index);
                        } else {
                            RetaConsole.showLnMsg("Este indice é invalido.");
                        }

                        //quad = (Quadrado) super.getFiguraIndiceLista(indices);
                    }

                    break;
                case 3:
                    //listar
                    arrayFig = super.getListaFiguraGeometrica();
                    RetaConsole.listarReta(arrayFig);
                    break;
                case 4:
                    //mostrar

                    indices = getIndicesDasRetas();
                    if ("".equals(indices)) {
                        RetaConsole.showLnMsg("Nao existe a figura na lista. ");
                        //return;
                    } else {
                        int indice = RetaConsole.askInt("Digite o indice que deseja mostrar: " + indices);
                        if (indices.contains(String.valueOf(indice))) {
                            super.mostrarIndice(indice);
                        } else {
                            RetaConsole.showLnMsg("Este indice é invalido.");
                        }

                    }

                    //arrayFig = super.getListaFiguraGeometrica();
                    //quadrado console perguntar qual indice desejado (parametro indices)
                    //super.listarindice toString()
                    break;
                case 5:
                    //apagar
                    indices = getIndicesDasRetas();
                    if ("".equals(indices)) {
                        RetaConsole.showLnMsg("Nao existe a figura na lista. ");
                    } else {
                        super.setContador(super.getContador()-1);
                        int index = RetaConsole.askInt("Digite o index que deseja apagar:  " + indices);
                        if (indices.contains(String.valueOf(index))) {
                            super.excluirIndexDaLista(index);
                        } else {
                            RetaConsole.showLnMsg("Este indice é invalido.");
                        }

                        //quad = (Quadrado) super.getFiguraIndiceLista(indices);
                    }

                    break;

                default:
                    super.mostrarMenu();
                    break;
            }
        } while (option < 6);
    }
    
    
    
    
    
    
    
    
    
    
    
}
