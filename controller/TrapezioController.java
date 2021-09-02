/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc2.lab.aula09.projetoFigGeometricaLucas.controller;

import java.util.ArrayList;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.FiguraGeometrica;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.Trapezio;
import pc2.lab.aula09.projetoFigGeometricaLucas.view.TrapezioConsole;

/**
 *
 * @author Lucas Letro
 */
public class TrapezioController extends AlessioPaint {

    public String getIndicesDosTrapezios() {
        ArrayList<FiguraGeometrica> lista = super.getListaFiguraGeometrica();
        String indexes = "";
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Trapezio) {
                indexes = indexes + ", " + String.valueOf(i);
            }
        }
        return indexes;
    }

    public void showTrapezioMenu() {
        TrapezioConsole trapezioConsole = new TrapezioConsole();
        int option = 0;
        String indices;
        ArrayList<FiguraGeometrica> arrayFig;
        do {
            option = trapezioConsole.ShowTrapezioSubMenu();

            switch (option) {
                case 1:
                    Trapezio trap = trapezioConsole.askTrapezio();
                    super.insertFiguraGeometrica(trap);
                    break;
                case 2:
                    //EDITAR
                    indices = getIndicesDosTrapezios();
                    if ("".equals(indices)) {
                        trapezioConsole.showLnMsg("Nao existe a figura na lista. ");
                    } else {

                        int index = trapezioConsole.askInt("Digite o index que deseja editar:  " + indices);
                        if (indices.contains(String.valueOf(index))) {
                            trap = trapezioConsole.askTrapezio();
                            super.setNewValueToList(trap, index);
                        } else {
                            trapezioConsole.showLnMsg("Este indice é invalido.");
                        }

                    }

                    break;
                case 3:
                    //listar
                    arrayFig = super.getListaFiguraGeometrica();
                    trapezioConsole.listarTrapezio(arrayFig);
                    break;
                case 4:
                    //mostrar

                    indices = getIndicesDosTrapezios();
                    if ("".equals(indices)) {
                        trapezioConsole.showLnMsg("Nao existe a figura na lista. ");
                        //return;
                    } else {
                        int indice = trapezioConsole.askInt("Digite o indice que deseja mostrar: " + indices);
                        if (indices.contains(String.valueOf(indice))) {
                            super.mostrarIndice(indice);
                        } else {
                            trapezioConsole.showLnMsg("Este indice é invalido.");
                        }

                    }

                    break;
                case 5:
                    //apagar
                    indices = getIndicesDosTrapezios();
                    if ("".equals(indices)) {
                        trapezioConsole.showLnMsg("Nao existe a figura na lista. ");
                    } else {
                        super.setContador(super.getContador() - 1);
                        int index = trapezioConsole.askInt("Digite o index que deseja apagar:  " + indices);
                        if (indices.contains(String.valueOf(index))) {
                            super.excluirIndexDaLista(index);
                        } else {
                            trapezioConsole.showLnMsg("Este indice é invalido.");
                        }

                    }
                    break;
                case 6:
                    super.mostrarMenu();
                    break;
                default:
                    showTrapezioMenu();
                    break;
            }
        } while (option < 6);
    }

}
