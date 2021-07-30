package pc2.lab.aula09.projetoFigGeometricaLucas.view;

import pc2.lab.aula09.projetoFigGeometricaLucas.model.enums.OpcoesMenuEnum;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.Quadrado;

import java.util.Scanner;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.Retangulo;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.Triangulo;

public class BasicConsole {

    protected Scanner in;

    public BasicConsole(){
        in = new Scanner(System.in);
    }

    public void showLnMsg(String msg){
        System.out.println(msg);
    }

    public void showMsg(String msg){
        System.out.print(msg);
    }

    public int askInt(String msg){
        showLnMsg(msg);
        return in.nextInt();
    }

    public Quadrado askQuadrado(){
        showLnMsg("Digite um inteiro para o tamanho do lado do quadrado: ");
        int tamanho  = in.nextInt();
        Quadrado quad = new Quadrado(tamanho);

        return quad;
    }
    
      public Retangulo askRetangulo(){
        showLnMsg("Digite a base do retangulo");
        int base  = in.nextInt();
        //requisi��o de altura
        showLnMsg("Digite a altura do retangulo");
        int altura  = in.nextInt();
        
        Retangulo ret = new Retangulo(base, altura);

        return ret ;
    }
      
    public Triangulo askTriangulo(){
        showLnMsg("Digite a base do Triangulo: ");
        int base  = in.nextInt();
        //requisi��o de altura
        showLnMsg("Digite a altura do Triangulo: ");
        int altura  = in.nextInt();
        
        Triangulo tri = new Triangulo(base, altura);
                
        return tri;
    }

    public int askInt(){
        return in.nextInt();
    }

    public boolean hasNextInt(){
        return in.hasNextInt();
    }

    public OpcoesMenuEnum askOpcaoMenuPrincial(){
        //Loop para entregar uma op��o valida
        showMsg("Digite uma op��o \n" +
                "1 - Criar Quadrado\n" +
                "2 - Criar Retangulo\n" +
                "3 - Criar Triangulo\n" +
                "6 - Apagar Item\n" +
                "9 - Listar\n" +
                "7 - Desenhar\n" +
                "0 - Sair");

        int opcao = in.nextInt();

        switch (opcao){ //fiz
            case 1:
                return OpcoesMenuEnum.QUADRADO;
            case 2:
                return OpcoesMenuEnum.RETANGULO;
            case 3:
                return OpcoesMenuEnum.TRIANGULO;
            case 6:
                return OpcoesMenuEnum.APAGAR;
            case 7:
                return OpcoesMenuEnum.DESENHAR;
            case 9:
                return OpcoesMenuEnum.LISTAR;
            default:
                return OpcoesMenuEnum.SAIR;
        }
    }

}
