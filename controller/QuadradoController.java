/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc2.lab.aula09.projetoFigGeometricaLucas.controller;

import java.util.ArrayList;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.FiguraGeometrica;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.Quadrado;
import pc2.lab.aula09.projetoFigGeometricaLucas.view.QuadradoConsole;

/**
 *
 * @author Lucas Letro
 */
public class QuadradoController extends AlessioPaint {
    
    public String getIndicesDosQuadrados() {
        ArrayList<FiguraGeometrica> lista = super.getListaFiguraGeometrica();
        String indexes = "";
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Quadrado) {
                indexes = indexes + ", " + String.valueOf(i);
                //showLnMsg("Index do quadrado:" + i);
            }
        }
        return indexes;
    }

    public void showQuadradoMenu() {
        QuadradoConsole quadradoConsole = new QuadradoConsole();
        int option = 0;
        String indices;
        ArrayList<FiguraGeometrica> arrayFig;
        do {
            option = quadradoConsole.showQuadradoSubMenu();

            switch (option) {
                case 1:
                    Quadrado quad = quadradoConsole.askQuadrado();
                    super.insertFiguraGeometrica(quad);
                    break;
                case 2:
                    //EDITAR
                    indices = getIndicesDosQuadrados();
                    if ("".equals(indices)) {
                        quadradoConsole.showLnMsg("Nao existe a figura na lista. ");
                    } else {

                        int index = quadradoConsole.askInt("Digite o index que deseja editar:  " + indices);
                        if (indices.contains(String.valueOf(index))) {
                            quad = quadradoConsole.askQuadrado();
                            super.setNewValueToList(quad, index);
                        } else {
                            quadradoConsole.showLnMsg("Este indice é invalido.");
                        }

                        //quad = (Quadrado) super.getFiguraIndiceLista(indices);
                    }

                    break;
                case 3:
                    //listar
                    arrayFig = super.getListaFiguraGeometrica();
                    quadradoConsole.listarQuadrado(arrayFig);
                    break;
                case 4:
                    //mostrar

                    indices = getIndicesDosQuadrados();
                    if ("".equals(indices)) {
                        quadradoConsole.showLnMsg("Nao existe a figura na lista. ");
                        //return;
                    } else {
                        int indice = quadradoConsole.askInt("Digite o indice que deseja mostrar: " + indices);
                        if (indices.contains(String.valueOf(indice))) {
                            super.mostrarIndice(indice);
                        } else {
                            quadradoConsole.showLnMsg("Este indice é invalido.");
                        }

                    }

                    //arrayFig = super.getListaFiguraGeometrica();
                    //quadrado console perguntar qual indice desejado (parametro indices)
                    //super.listarindice toString()
                    break;
                case 5:
                    //apagar
                    indices = getIndicesDosQuadrados();
                    if ("".equals(indices)) {
                        quadradoConsole.showLnMsg("Nao existe a figura na lista. ");
                    } else {
                        super.setContador(super.getContador()-1);
                        int index = quadradoConsole.askInt("Digite o index que deseja apagar:  " + indices);
                        if (indices.contains(String.valueOf(index))) {
                            super.excluirIndexDaLista(index);
                        } else {
                            quadradoConsole.showLnMsg("Este indice é invalido.");
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
