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

    public void showQuadradoMenu() {
        QuadradoConsole quadradoConsole = new QuadradoConsole();
        int option = 0;
        do {
            option = quadradoConsole.showQuadradoSubMenu();

            switch (option) {
                case 1:
                    Quadrado quad = quadradoConsole.askQuadrado();
                    super.insertFiguraGeometrica(quad);
                    break;
                case 2:
                    ArrayList<FiguraGeometrica> arrayFig = super.getListaFiguraGeometrica();
                    
                    boolean isSaved = quadradoConsole.editarQuadrado(arrayFig);
                    if (isSaved) {
                        quadradoConsole.showLnMsg("Editado com sucesso!");
                    }
                    break;
                case 3:
                    //listar
                    arrayFig = super.getListaFiguraGeometrica();
                    quadradoConsole.listarQuadrado(arrayFig);
                    break;
                case 4:
                    //mostrar
                    break;
                case 5:
                    //apagar

                    break;
                default:
                    // super.askOpcaoMenuPrincial();
                    break;
            }
        } while (option < 6);
    }
}
