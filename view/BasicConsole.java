package pc2.lab.aula09.projetoFigGeometricaLucas.view;

import pc2.lab.aula09.projetoFigGeometricaLucas.model.enums.OpcoesMenuEnum;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.Quadrado;

import java.util.Scanner;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.Circulo;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.FiguraGeometrica;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.Losango;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.Retangulo;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.Trapezio;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.Triangulo;

public class BasicConsole {

    protected Scanner in;

    public BasicConsole() {
        in = new Scanner(System.in);
    }

    public void showLnMsg(String msg) {
        System.out.println(msg);
    }

    public void showMsg(String msg) {
        System.out.print(msg);
    }

    public int askInt(String msg) {
        showLnMsg(msg);
        return in.nextInt();
    }

    public int showSubMenu() {
        showMsg("\n\nDigite uma op��o \n"
                + "1 - Novo \n"
                + "2 - Editar\n"
                + "3 - Listar\n"
                + "4 - Mostrar\n"
                + "5 - Apagar\n"
                + "6 - Voltar\n");

        int opcao1 = in.nextInt();
        return opcao1;
//        switch (opcao1) {
//            case 1:
//                return figura.novo(); //OpcoesMenuEnum.QUADRADO;
//            case 2:
//               // return figura.editar();
//            case 3:
//                return OpcoesMenuEnum.LISTAR;  //
//            case 4:
//                return OpcoesMenuEnum.MOSTRAR;
//            case 5:
//                return OpcoesMenuEnum.APAGAR; //
//            case 6:
//                return askOpcaoMenuPrincial();  //ok voltar
//            //return OpcoesMenuEnum.VOLTAR;
//            default:
//                return OpcoesMenuEnum.SAIR;  // ok sair
//        }
    }

   

    

    

    public Losango askLosango() {
        showLnMsg("Digite a diagonal inferior do losango: ");
        int diagonalInferior = in.nextInt();
        //requisi��o de altura
        showLnMsg("Digite a diagonal superior do losango: ");
        int diagonalSuperior = in.nextInt();

        showLnMsg("Digite o tamanho do lado do losango: ");
        int tamanhoLado = in.nextInt();

        Losango los = new Losango(diagonalInferior, diagonalSuperior, tamanhoLado);
        return los;
    }

    public Circulo askCirculo() {
        showLnMsg("Digite um valor para o raio do circulo: ");
        int raio = in.nextInt();
        Circulo cir = new Circulo(raio);
        return cir;
    }

    public Trapezio askTrapezio() {
        showLnMsg("Digite um valor para a base maior do trapezio: ");
        int baseMaior = in.nextInt();

        showLnMsg("Digite um valor para a base menor do trapezio: ");
        int baseMenor = in.nextInt();

        showLnMsg("Digite um valor para a altura do trapezio: ");
        int altura = in.nextInt();

        showLnMsg("Digite um valor para o lado do trapezio: ");
        int lado = in.nextInt();

        Trapezio trap = new Trapezio(baseMaior, baseMenor, altura, lado);
        return trap;
    }

    public int askInt() {
        return in.nextInt();
    }

    public boolean hasNextInt() {
        return in.hasNextInt();
    }

    public OpcoesMenuEnum askOpcaoMenuPrincial() {
        //Loop para entregar uma op��o valida
        showMsg("\nDigite uma op��o \n"
                + "1 - Criar Quadrado\n"
                + "2 - Criar Retangulo\n"
                + "3 - Criar Triangulo\n"
                + "4 - Criar Losango\n"
                + "5 - Criar Circulo\n"
                + "6 - Criar Trapezio\n"
                + "7 - Apagar Item\n"
                + "D - Desenhar\n"
                + "L - Listar\n"
                + "X - Sair\n");

        String opcao = in.next();

        switch (opcao) {
            case "1":
                //return SubMenu//askOpcaoMenuSecundarioQuadrado();
                return OpcoesMenuEnum.QUADRADO;
            case "2":
                //return askOpcaoMenuSecundarioRetangulo();
                return OpcoesMenuEnum.RETANGULO;
            case "3":
                return OpcoesMenuEnum.TRIANGULO;
            case "4":
                return OpcoesMenuEnum.LOSANGO;
            case "5":
                return OpcoesMenuEnum.CIRCULO;
            case "6":
                return OpcoesMenuEnum.TRAPEZIO;
            case "7":
                return OpcoesMenuEnum.APAGAR;   //apagar
            case "d":
            case "D":
                return OpcoesMenuEnum.DESENHAR;  // desenhar
            case "L":
            case "l":
                return OpcoesMenuEnum.LISTAR;   // listar
            default:
                return OpcoesMenuEnum.SAIR;  // sair
        }
    }

    //====================SUB-MENU===================================
    //QUADRADO
    /*public OpcoesMenuEnum askOpcaoMenuSecundarioQuadrado(){
        showMsg("\n\nDigite uma op��o \n"
                + "1 - Novo \n"
                + "2 - Editar\n"
                + "3 - Listar\n"
                + "4 - Mostrar\n"
                + "5 - Apagar\n"
                + "6 - Voltar\n");

        int opcao1 = in.nextInt();

        switch(opcao1) {
            case 1:
                return OpcoesMenuEnum.QUADRADO;
            case 2:
                return OpcoesMenuEnum.EDITAR;
            case 3:
                return OpcoesMenuEnum.LISTAR;  //
            case 4:
                return OpcoesMenuEnum.MOSTRAR;
            case 5:
                return OpcoesMenuEnum.APAGAR; //
            case 6:
                return askOpcaoMenuPrincial();  //ok voltar
                //return OpcoesMenuEnum.VOLTAR;
            default:
                return OpcoesMenuEnum.SAIR;  // ok sair
        }
    }

    //RETANGULO ===============================================

    public OpcoesMenuEnum askOpcaoMenuSecundarioRetangulo(){
        showMsg("\n\nDigite uma op��o \n"
                + "1 - Novo \n"
                + "2 - Editar\n"
                + "3 - Listar\n"
                + "4 - Mostrar\n"
                + "5 - Apagar\n"
                + "6 - Voltar\n");

        int opcao1 = in.nextInt();

        switch(opcao1) {
            case 1:
                return OpcoesMenuEnum.RETANGULO;
            case 2:
                return OpcoesMenuEnum.EDITAR;
            case 3:
                return OpcoesMenuEnum.LISTAR;  //
            case 4:
                return OpcoesMenuEnum.MOSTRAR;
            case 5:
                return OpcoesMenuEnum.APAGAR; //
            case 6:
                return askOpcaoMenuPrincial();  //ok voltar
                //return OpcoesMenuEnum.VOLTAR;
            default:
                return OpcoesMenuEnum.SAIR;  // ok sair
        }
    }*/
}
