/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc2.lab.aula09.projetoFigGeometricaLucas.controller;

import java.util.ArrayList;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.Circulo;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.FiguraGeometrica;
import pc2.lab.aula09.projetoFigGeometricaLucas.view.CirculoConsole;

/**
 *
 * @author Lucas Letro
 */
public class CirculoController extends AlessioPaint {

    public String getIndicesDosCirculos() {
        ArrayList<FiguraGeometrica> lista = super.getListaFiguraGeometrica();
        String indexes = "";
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Circulo) {
                indexes = indexes + ", " + String.valueOf(i);
                //showLnMsg("Index do quadrado:" + i);
            }
        }
        return indexes;
    }

    public void showCirculoMenu() {
        CirculoConsole circuloConsole = new CirculoConsole();
        int option = 0;
        String indices;
        ArrayList<FiguraGeometrica> arrayFig;
        do {
            option = circuloConsole.ShowCirculoSubMenu();

            switch (option) {
                case 1:
                    Circulo cir = circuloConsole.askCirculo();
                    super.insertFiguraGeometrica(cir);
                    break;
                case 2:
                    //EDITAR
                    indices = getIndicesDosCirculos();
                    if ("".equals(indices)) {
                        circuloConsole.showLnMsg("Nao existe a figura na lista. ");
                    } else {

                        int index = circuloConsole.askInt("Digite o index que deseja editar:  " + indices);
                        if (indices.contains(String.valueOf(index))) {
                            cir = circuloConsole.askCirculo();
                            super.setNewValueToList(cir, index);
                        } else {
                            circuloConsole.showLnMsg("Este indice é invalido.");
                        }

                    }

                    break;
                case 3:
                    //listar
                    arrayFig = super.getListaFiguraGeometrica();
                    circuloConsole.listarCirculo(arrayFig);
                    break;
                case 4:
                    //mostrar

                    indices = getIndicesDosCirculos();
                    if ("".equals(indices)) {
                        circuloConsole.showLnMsg("Nao existe a figura na lista. ");
                        //return;
                    } else {
                        int indice = circuloConsole.askInt("Digite o indice que deseja mostrar: " + indices);
                        if (indices.contains(String.valueOf(indice))) {
                            super.mostrarIndice(indice);
                        } else {
                            circuloConsole.showLnMsg("Este indice é invalido.");
                        }

                    }
                    break;
                case 5:
                    //apagar
                    indices = getIndicesDosCirculos();
                    if ("".equals(indices)) {
                        circuloConsole.showLnMsg("Nao existe a figura na lista. ");
                    } else {
                        super.setContador(super.getContador() - 1);
                        int index = circuloConsole.askInt("Digite o index que deseja apagar:  " + indices);
                        if (indices.contains(String.valueOf(index))) {
                            super.excluirIndexDaLista(index);
                        } else {
                            circuloConsole.showLnMsg("Este indice é invalido.");
                        }

                    }
                    break;

                case 6:
                    super.mostrarMenu();
                    break;
                default:
                    showCirculoMenu();
                    break;
            }
        } while (option < 6);
    }

}
