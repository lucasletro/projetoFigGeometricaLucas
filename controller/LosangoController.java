/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc2.lab.aula09.projetoFigGeometricaLucas.controller;

import java.util.ArrayList;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.FiguraGeometrica;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.Losango;
import pc2.lab.aula09.projetoFigGeometricaLucas.view.LosangoConsole;
//import pc2.lab.aula09.projetoFigGeometricaLucas.model.Triangulo;
//import pc2.lab.aula09.projetoFigGeometricaLucas.view.TrianguloConsole;

/**
 *
 * @author Lucas Letro
 */
public class LosangoController extends AlessioPaint {
    
    public String getIndicesDosLosangos() {
        ArrayList<FiguraGeometrica> lista = super.getListaFiguraGeometrica();
        String indexes = "";
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Losango) {
                indexes = indexes + ", " + String.valueOf(i);
                //showLnMsg("Index do quadrado:" + i);
            }
        }
        return indexes;
    }
    
    
    
    public void showLosangoMenu() {
        LosangoConsole losangoConsole = new LosangoConsole();
        int option = 0;
        String indices;
        ArrayList<FiguraGeometrica> arrayFig;
        do {
            option = losangoConsole.ShowLosangoSubMenu();

            switch (option) {
                case 1:
                    Losango los = losangoConsole.askLosango();
                    super.insertFiguraGeometrica(los);
                    break;
                case 2:
                    //EDITAR
                    indices = getIndicesDosLosangos();
                    if ("".equals(indices)) {
                        losangoConsole.showLnMsg("Nao existe a figura na lista. ");
                    } else {

                        int index = losangoConsole.askInt("Digite o index que deseja editar:  " + indices);
                        if (indices.contains(String.valueOf(index))) {
                            los = losangoConsole.askLosango();
                            super.setNewValueToList(los, index);
                        } else {
                            losangoConsole.showLnMsg("Este indice é invalido.");
                        }

                        //quad = (Quadrado) super.getFiguraIndiceLista(indices);
                    }

                    break;
                case 3:
                    //listar
                    arrayFig = super.getListaFiguraGeometrica();
                    losangoConsole.listarLosango(arrayFig);
                    break;
                case 4:
                    //mostrar

                    indices = getIndicesDosLosangos();
                    if ("".equals(indices)) {
                        losangoConsole.showLnMsg("Nao existe a figura na lista. ");
                        //return;
                    } else {
                        int indice = losangoConsole.askInt("Digite o indice que deseja mostrar: " + indices);
                        if (indices.contains(String.valueOf(indice))) {
                            super.mostrarIndice(indice);
                        } else {
                            losangoConsole.showLnMsg("Este indice é invalido.");
                        }

                    }

                    //arrayFig = super.getListaFiguraGeometrica();
                    //quadrado console perguntar qual indice desejado (parametro indices)
                    //super.listarindice toString()
                    break;
                case 5:
                    //apagar
                    indices = getIndicesDosLosangos();
                    if ("".equals(indices)) {
                        losangoConsole.showLnMsg("Nao existe a figura na lista. ");
                    } else {
                        super.setContador(super.getContador()-1);
                        int index = losangoConsole.askInt("Digite o index que deseja apagar:  " + indices);
                        if (indices.contains(String.valueOf(index))) {
                            super.excluirIndexDaLista(index);
                        } else {
                            losangoConsole.showLnMsg("Este indice é invalido.");
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
