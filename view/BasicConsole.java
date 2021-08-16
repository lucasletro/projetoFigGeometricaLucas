package pc2.lab.aula09.projetoFigGeometricaLucas.view;

import pc2.lab.aula09.projetoFigGeometricaLucas.model.enums.OpcoesMenuEnum;
//import pc2.lab.aula09.projetoFigGeometricaLucas.model.Quadrado;

import java.util.Scanner;
//import pc2.lab.aula09.projetoFigGeometricaLucas.model.Circulo;
//import pc2.lab.aula09.projetoFigGeometricaLucas.model.FiguraGeometrica;
//import pc2.lab.aula09.projetoFigGeometricaLucas.model.Losango;
//import pc2.lab.aula09.projetoFigGeometricaLucas.model.Retangulo;
//import pc2.lab.aula09.projetoFigGeometricaLucas.model.Trapezio;
//import pc2.lab.aula09.projetoFigGeometricaLucas.model.Triangulo;

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
        showMsg("\n\nDigite uma opção \n"
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

    

    public int askInt() {
        return in.nextInt();
    }

    public boolean hasNextInt() {
        return in.hasNextInt();
    }

    public OpcoesMenuEnum askOpcaoMenuPrincial() {
        //Loop para entregar uma opção valida
        showMsg("\nDigite uma opção \n"
                + "1 - Texto\n"          ////////
                + "2 - Criar Reta\n"       ///////
                + "3 - Criar Quadrado\n"  
                + "4 - Criar Retangulo\n"
                + "5 - Criar Triangulo\n"
                + "6 - Criar Losango\n"
                + "7 - Criar Circulo\n"
                + "8 - Criar Trapezio\n"
                //+ "7 - Apagar Item\n"
                + "D - Desenhar\n"
                + "L - Listar\n"
                + "S - Salvar\n"     //////////////
                + "R - Recarregar\n" /////////////////
                + "X - Sair\n");

        String opcao = in.next();

        switch (opcao) {
            case "1":
                return OpcoesMenuEnum.TEXTO;  /////////////
            case "2":
                return OpcoesMenuEnum.RETA;
            case "3":
                return OpcoesMenuEnum.QUADRADO;
            case "4":
                return OpcoesMenuEnum.RETANGULO;
            case "5":
                return OpcoesMenuEnum.TRIANGULO;
            case "6":
                return OpcoesMenuEnum.LOSANGO;
            case "7":
                return OpcoesMenuEnum.CIRCULO;
            case "8":
                return OpcoesMenuEnum.TRAPEZIO;
            //case "7":
                //return OpcoesMenuEnum.APAGAR;   
            case "d":
            case "D":
                return OpcoesMenuEnum.DESENHAR;  
            case "L":
            case "l":
                return OpcoesMenuEnum.LISTAR;   
            case "s":
            case "S":
                return OpcoesMenuEnum.SALVAR;   ////////////
            case "r":
            case "R":
                return OpcoesMenuEnum.RECARREGAR; //////////////
            default:
                return OpcoesMenuEnum.SAIR;  
        }
    }
    
    
}
