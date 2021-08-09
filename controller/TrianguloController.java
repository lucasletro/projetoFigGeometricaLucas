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
//import pc2.lab.aula09.projetoFigGeometricaLucas.model.Retangulo;
//import pc2.lab.aula09.projetoFigGeometricaLucas.view.RetanguloConsole;

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
                //showLnMsg("Index do quadrado:" + i);
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
                            trianguloConsole.showLnMsg("Este indice é invalido.");
                        }

                        //quad = (Quadrado) super.getFiguraIndiceLista(indices);
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
                            trianguloConsole.showLnMsg("Este indice é invalido.");
                        }

                    }

                    //arrayFig = super.getListaFiguraGeometrica();
                    //quadrado console perguntar qual indice desejado (parametro indices)
                    //super.listarindice toString()
                    break;
                case 5:
                    //apagar
                    indices = getIndicesDosTriangulos();
                    if ("".equals(indices)) {
                        trianguloConsole.showLnMsg("Nao existe a figura na lista. ");
                    } else {
                        int index = trianguloConsole.askInt("Digite o index que deseja excluir:  " + indices);
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
