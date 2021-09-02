/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc2.lab.aula09.projetoFigGeometricaLucas.controller;

import java.util.ArrayList;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.FiguraGeometrica;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.Triangulo;
import pc2.lab.aula09.projetoFigGeometricaLucas.view.TrianguloConsole;

/**
 *
 * @author Lucas Letro
 */
public class TrianguloController extends AlessioPaint {

    public String getIndicesDosTriangulos() {
        ArrayList<FiguraGeometrica> lista = super.getListaFiguraGeometrica();
        String indexes = "";
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Triangulo) {
                indexes = indexes + ", " + String.valueOf(i);
            }
        }
        return indexes;
    }

    public void showTrianguloMenu() {
        TrianguloConsole trianguloConsole = new TrianguloConsole();
        int option = 0;
        String indices;
        ArrayList<FiguraGeometrica> arrayFig;
        do {
            option = trianguloConsole.ShowTrianguloSubMenu();

            switch (option) {
                case 1:
                    Triangulo tri = trianguloConsole.askTriangulo();
                    super.insertFiguraGeometrica(tri);
                    break;
                case 2:
                    //EDITAR
                    indices = getIndicesDosTriangulos();
                    if ("".equals(indices)) {
                        trianguloConsole.showLnMsg("Nao existe a figura na lista. ");
                    } else {

                        int index = trianguloConsole.askInt("Digite o index que deseja editar:  " + indices);
                        if (indices.contains(String.valueOf(index))) {
                            tri = trianguloConsole.askTriangulo();
                            super.setNewValueToList(tri, index);
                        } else {
                            trianguloConsole.showLnMsg("Este indice � invalido.");
                        }

                    }

                    break;
                case 3:
                    //listar
                    arrayFig = super.getListaFiguraGeometrica();
                    trianguloConsole.listarTriangulo(arrayFig);
                    break;
                case 4:
                    //mostrar

                    indices = getIndicesDosTriangulos();
                    if ("".equals(indices)) {
                        trianguloConsole.showLnMsg("Nao existe a figura na lista. ");
                        //return;
                    } else {
                        int indice = trianguloConsole.askInt("Digite o indice que deseja mostrar: " + indices);
                        if (indices.contains(String.valueOf(indice))) {
                            super.mostrarIndice(indice);
                        } else {
                            trianguloConsole.showLnMsg("Este indice � invalido.");
                        }

                    }

                    break;
                case 5:
                    //apagar
                    indices = getIndicesDosTriangulos();
                    if ("".equals(indices)) {
                        trianguloConsole.showLnMsg("Nao existe a figura na lista. ");
                    } else {
                        super.setContador(super.getContador() - 1);
                        int index = trianguloConsole.askInt("Digite o index que deseja apagar:  " + indices);
                        if (indices.contains(String.valueOf(index))) {
                            super.excluirIndexDaLista(index);
                        } else {
                            trianguloConsole.showLnMsg("Este indice � invalido.");
                        }

                    }
                    break;
                case 6:
                    super.mostrarMenu();
                    break;
                default:
                    showTrianguloMenu();
                    break;
            }
        } while (option < 6);
    }

}
