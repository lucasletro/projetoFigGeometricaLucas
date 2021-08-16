package pc2.lab.aula09.projetoFigGeometricaLucas.controller;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.*;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.enums.OpcoesMenuEnum;
import pc2.lab.aula09.projetoFigGeometricaLucas.view.BasicConsole;
import pc2.lab.aula09.projetoFigGeometricaLucas.view.DesenhoBoard;

import java.util.ArrayList;
import pc2.lab.aula09.projetoFigGeometricaLucas.view.QuadradoConsole;

public class AlessioPaint {

    //private FiguraGeometrica[] vetor;
    private static ArrayList<FiguraGeometrica> figuraGeometricaArrayList;
    private FiguraGeometrica[] figuraSalvar = new FiguraGeometrica[10];
    private int contador;
    private BasicConsole tela;
    private DesenhoBoard canvas;

    public AlessioPaint() {
        //vetor= new FiguraGeometrica[5];
        figuraGeometricaArrayList = new ArrayList<FiguraGeometrica>();
        contador = 0;
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
                LosangoController losangoController = new LosangoController();
                losangoController.showLosangoMenu();
                //Losango los = tela.askLosango();
                //insertFiguraGeometrica(los);
                break;
            case CIRCULO:
                CirculoController circuloController = new CirculoController();
                circuloController.showCirculoMenu();
                //Circulo cir = tela.askCirculo();
                //insertFiguraGeometrica(cir);
                break;
            case TRAPEZIO:
                TrapezioController trapezioController = new TrapezioController();
                trapezioController.showTrapezioMenu();
                //Trapezio trap = tela.askTrapezio();
                //insertFiguraGeometrica(trap);
                break;
            case TEXTO:
                tela.showLnMsg("Escolha uma figura geometrica!"); //////////
                break;
            case RETA:
                tela.showLnMsg("Escolha uma figura geometrica!"); //////////
                break;
            case LISTAR:
                listar();
                break;
            case SALVAR:
                salvarFiguras(figuraGeometricaArrayList);
                break;
            case APAGAR:
                apagarFiguras();
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
        if (contador < 10) {
            figuraGeometricaArrayList.add(contador, fig);
            figuraSalvar[contador] = fig;
            for (int i = 0; i <= contador; i++) {
                System.out.println(figuraSalvar[i].toString());
                System.out.println(i);
            }
            contador += 1;

            System.out.println("Figura inserida");
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

    public void excluirIndexDaLista(int index) {
        figuraGeometricaArrayList.remove(index);
        tela.showLnMsg("Indice excluido! ");
    }

    public void mostrarIndice(int index) {

        FiguraGeometrica fig = figuraGeometricaArrayList.get(index);
        tela.showLnMsg(fig.toString());
    }

    public void salvarFiguras(ArrayList<FiguraGeometrica> figuras) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\Lucas Letro\\Desktop\\salvar\\figuras.txt");
            String texto = "";
            for (int i = 0; i < 10; i++) {
                if (figuraSalvar[i] != null) {

                    texto += figuraSalvar[i].toString() + "\n";
                }
            }
            writer.write(texto);
            writer.close();
            System.out.println("Figuras geometricas salvas");
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo.");
            e.printStackTrace();
        }

    }

    public void apagarFiguras() {
        int index = tela.askInt("Digite um index para apagar: ");
        if (index < figuraGeometricaArrayList.size()) {
            figuraGeometricaArrayList.remove(index);
            tela.showLnMsg("index " + index + " removido!");
        } else {

            tela.showLnMsg("Index inexistente.");
        }
    }

    public void listar() {
        //Retangulo retangulo = new Retangulo();
        //insertFiguraGeomÃ©trica(retangulo, 1);
        for (int i = 0; i < figuraGeometricaArrayList.size(); i++) {
            if (figuraGeometricaArrayList.get(i) != null) {
                System.out.println(figuraGeometricaArrayList.get(i).toString());
            }
        }
    }

}
