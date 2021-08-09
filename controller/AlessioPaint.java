package pc2.lab.aula09.projetoFigGeometricaLucas.controller;

import pc2.lab.aula09.projetoFigGeometricaLucas.model.*;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.enums.OpcoesMenuEnum;
import pc2.lab.aula09.projetoFigGeometricaLucas.view.BasicConsole;
import pc2.lab.aula09.projetoFigGeometricaLucas.view.DesenhoBoard;

import java.util.ArrayList;
import pc2.lab.aula09.projetoFigGeometricaLucas.view.QuadradoConsole;

public class AlessioPaint {

    //private FiguraGeometrica[] vetor;
    private ArrayList<FiguraGeometrica> figuraGeometricaArrayList;
    private BasicConsole tela;
    private DesenhoBoard canvas;

    public AlessioPaint() {
        figuraGeometricaArrayList = new ArrayList<>();
        //vetor= new FiguraGeometrica[5];
        tela = new BasicConsole();
        canvas = new DesenhoBoard();
    }

    public void mostrarMenu() {

        OpcoesMenuEnum opcao = OpcoesMenuEnum.LISTAR;

        // do {
        opcao = tela.askOpcaoMenuPrincial();

        tela.showLnMsg("\n\nOpção escolhida : " + opcao + "\n\n");

        switch (opcao) {
            case QUADRADO:
                QuadradoController quadradoController = new QuadradoController();
                quadradoController.showQuadradoMenu();
                //Quadrado quad = tela.askQuadrado(); ///////////////
                //insertFiguraGeometrica(quad);
                break;
            case RETANGULO:
                RetanguloController retanguloController = new RetanguloController();
                retanguloController.showRetanguloMenu();
                //Retangulo ret = tela.askRetangulo();
                //insertFiguraGeometrica(ret);
                break;
            case TRIANGULO:
                TrianguloController trianguloController = new TrianguloController();
                trianguloController.showTrianguloMenu();
                //Triangulo tri = tela.askTriangulo();
                //insertFiguraGeometrica(tri);
                break;
            case LOSANGO:
                Losango los = tela.askLosango();
                insertFiguraGeometrica(los);
                break;
            case CIRCULO:
                Circulo cir = tela.askCirculo();
                insertFiguraGeometrica(cir);
                break;
            case TRAPEZIO:
                Trapezio trap = tela.askTrapezio();
                insertFiguraGeometrica(trap);
                break;
            case LISTAR:
                //Retangulo retangulo = new Retangulo();
                //insertFiguraGeomÃ©trica(retangulo, 1);
                for (int i = 0; i < figuraGeometricaArrayList.size(); i++) {
                    if (figuraGeometricaArrayList.get(i) != null) {
                        System.out.println(figuraGeometricaArrayList.get(i).toString());
                    }
                }
                break;
            case APAGAR:
                int index = tela.askInt("Digite um index para apagar: ");
                if (index < figuraGeometricaArrayList.size()) {
                    figuraGeometricaArrayList.remove(index);
                    tela.showLnMsg("index " + index + " removido!");
                } else {
                    tela.showLnMsg("Index inexistente.");
                }
                break;

            case DESENHAR:
                //canvas.desenhar(vetor);
                break;

            case SAIR:

                break;
            default:
        }

        //   } while (opcao != OpcoesMenuEnum.SAIR);
    }

    public boolean insertFiguraGeometrica(FiguraGeometrica fig) {
        if (figuraGeometricaArrayList.size() < 10) {
            figuraGeometricaArrayList.add(fig);
            return true;
        } else {
            return false;
        }
    }

    public ArrayList getListaFiguraGeometrica() {
        return figuraGeometricaArrayList;
    }

    // public FiguraGeometrica getFiguraIndiceLista(String indices) {
//            if (indices.contains(String.valueOf(index))) {
//                return figuraGeometricaArrayList.get(index);
//            } else {
//                tela.showLnMsg("Index Invalido");
//                return null;
//            }
    //  }
    public void setNewValueToList(FiguraGeometrica figura, int index) {

        figuraGeometricaArrayList.set(index, figura);

    }
    public void excluirIndexDaLista(int index){
        figuraGeometricaArrayList.remove(index);
        tela.showLnMsg("Indice excluido! ");
    }
    
    public void mostrarIndice(int index){    
        
        FiguraGeometrica fig = figuraGeometricaArrayList.get(index);
        tela.showLnMsg(fig.toString());
    }
    
}
