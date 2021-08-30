package pc2.lab.aula09.projetoFigGeometricaLucas.controller;

import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.*;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.enums.OpcoesMenuEnum;
import pc2.lab.aula09.projetoFigGeometricaLucas.view.BasicConsole;
import java.util.ArrayList;
import pc2.lab.aula09.projetoFigGeometricaLucas.view.QuadradoConsole;

public class AlessioPaint {

    //private FiguraGeometrica[] vetor;
    private ArrayList<FiguraGeometrica> figuraGeometricaArrayList;
     private ArrayList<FiguraGeometrica> figuraGeometricaArrayList2;
    private int contador;
    private BasicConsole tela;
    private DesenhoBoard canvas;
    private String textoSalvar;

    private Graphics grafico;

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public AlessioPaint() {
        //vetor= new FiguraGeometrica[5];
        //grafico = new Graphics2d;
        contador = 0;
        tela = new BasicConsole();
        canvas = new DesenhoBoard();
        textoSalvar = "";
        figuraGeometricaArrayList = new ArrayList<>();
        figuraGeometricaArrayList2 = new ArrayList<>();
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
                mostrarMenu();
                break;
            case RETA:
                //tela.showLnMsg("Escolha uma figura geometrica!"); //////////
                RetaController retaController = new RetaController();
                retaController.showRetaMenu();
                mostrarMenu();
                break;
            case LISTAR:
                listar();
                mostrarMenu();
                break;
            case RECARREGAR:
                recuperarArray(figuraGeometricaArrayList);

                mostrarMenu();
                break;
            case SALVAR:
                salvarFiguras(figuraGeometricaArrayList);
                mostrarMenu();
                break;
            case APAGAR:
                apagarFiguras();
                break;
            case DESENHAR:
                desenharFiguras();
                //new DesenhoBoard();
                //canvas.desenhar(vetor);
                mostrarMenu();
                break;
            case SAIR:
                System.exit(0);
                break;
            default:
        }

        //   } while (opcao != OpcoesMenuEnum.SAIR);
    }

    public void desenharFiguras() {
        if (figuraGeometricaArrayList.isEmpty()) {
            tela.showLnMsg("Lista vazia");
        } else {
            /*for(int i = 0; i <=figuraGeometricaArrayList.size(); i++){
                canvas.desenhar(figuraGeometricaArrayList.get(i), i);
            }*/
            canvas.getFiguras(figuraGeometricaArrayList);
            canvas.setVisible(true);

        }
    }

    public boolean insertFiguraGeometrica(FiguraGeometrica fig) {
        if (figuraGeometricaArrayList.size() < 10) {
            figuraGeometricaArrayList.add(fig);
            figuraGeometricaArrayList2.add(fig);
            //textoSalvar += fig.toString() + contador;
            contador += 1;
            if (fig.getClass().equals(Reta.class)) {
                textoSalvar += "reta;" + ((Reta) fig).getTamanho() + "\n";
            } else if (fig.getClass().equals(Quadrado.class)) {
                textoSalvar += "quadrado;" + ((Quadrado) fig).getTamanhoLado() + "\n";
            } else if (fig.getClass().equals(Retangulo.class)) {
                textoSalvar += "retangulo;" + ((Retangulo) fig).getBase() + ";" + ((Retangulo) fig).getAltura() + "\n";
            } else if (fig.getClass().equals(Triangulo.class)) {
                textoSalvar += "triangulo;" + ((Triangulo) fig).getBase() + ";" + ((Triangulo) fig).getAltura() + "\n";
            } else if (fig.getClass().equals(Losango.class)) {
                textoSalvar += "losango;" + ((Losango) fig).getDiagonalInferior() + ";" + ((Losango) fig).getDiagonalSuperior() + "\n";
            } else if (fig.getClass().equals(Circulo.class)) {
                textoSalvar += "circulo;" + ((Circulo) fig).getRaio() + "\n";
            } else if (fig.getClass().equals(Trapezio.class)) {
                textoSalvar += "trapezio;" + ((Trapezio) fig).getBaseMaior() + ";" + ((Trapezio) fig).getBaseMenor() + ";" + ((Trapezio) fig).getAltura() + ";" + ((Trapezio) fig).getLado() + "\n";
            }

            tela.showLnMsg("Figura inserida");
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

            writer.write(textoSalvar);
            writer.close();
            tela.showLnMsg("Figuras geometricas salvas");
        } catch (IOException e) {
            tela.showLnMsg("Erro ao salvar arquivo.");
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

    public void recuperarArray(ArrayList<FiguraGeometrica> listaFiguraGeometricas) {
        String figuraRecuperada[] = new String[10];
        listaFiguraGeometricas.clear();
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lucas Letro\\Desktop\\salvar\\figuras.txt"));
            int contadorLinha = 0;
            String linha = br.readLine();
            while (linha != null) {
                figuraRecuperada[contadorLinha] = linha;
                linha = br.readLine();
                contadorLinha++;
            }
            br.close();
            recuperarObjeto(figuraRecuperada, listaFiguraGeometricas);
            tela.showMsg("Figura(s) recuperada\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void recuperarObjeto(String figuraRecuperada[], ArrayList<FiguraGeometrica> listaFiguraGeometricas) {
        String linha[];
        for (int i = 0; i < figuraRecuperada.length; i++) {

            if (figuraRecuperada[i] != null) {
                linha = figuraRecuperada[i].split(";");
                if(linha[0].contains("reta")){
                    Reta reta = new Reta(Integer.parseInt(linha[1]));
                    figuraGeometricaArrayList.add(reta);
                }
                else if (linha[0].contains("quadrado")) {
                    Quadrado quad = new Quadrado(Integer.parseInt(linha[1]));
                    figuraGeometricaArrayList.add(quad);

                } else if (linha[0].contains("retangulo")) {
                    Retangulo ret = new Retangulo(Integer.parseInt(linha[1]), Integer.parseInt(linha[2]));
                    figuraGeometricaArrayList.add(ret);
                } else if (linha[0].contains("triangulo")) {
                    Triangulo tri = new Triangulo(Integer.parseInt(linha[1]), Integer.parseInt(linha[2]));
                    figuraGeometricaArrayList.add(tri);
                } else if (linha[0].contains("losango")) {
                    Losango los = new Losango(Integer.parseInt(linha[1]), Integer.parseInt(linha[2]));
                    figuraGeometricaArrayList.add(los);
                } else if (linha[0].contains("circulo")) {
                    Circulo cir = new Circulo(Integer.parseInt(linha[1]));
                    figuraGeometricaArrayList.add(cir);
                } else if (linha[0].contains("trapezio")) {
                    Trapezio trap = new Trapezio(Integer.parseInt(linha[1]), Integer.parseInt(linha[2]), Integer.parseInt(linha[3]), Integer.parseInt(linha[4]));
                    figuraGeometricaArrayList.add(trap);
                }
            }

        }
    }

}
