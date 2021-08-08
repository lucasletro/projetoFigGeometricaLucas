package pc2.lab.aula09.projetoFigGeometricaLucas.view;

import java.util.ArrayList;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.FiguraGeometrica;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.Quadrado;

public class QuadradoConsole extends BasicConsole {
    
    public Quadrado askQuadrado() {
        showLnMsg("Digite um inteiro para o tamanho do lado do quadrado: ");
        int tamanho = in.nextInt();
        Quadrado quad = new Quadrado(tamanho);
        
        return quad;
    }
    
    public boolean editarQuadrado(ArrayList<FiguraGeometrica> lista) {
        showLnMsg("------ EDITAR QUADRADO -----");
        String indexes = "";
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Quadrado) {
                indexes = indexes + ", " + String.valueOf(i);
                //showLnMsg("Index do quadrado:" + i);
            }
        }
        if ("".equals(indexes)) {
            showLnMsg("Nao existe quadrado na lista de figuras. ");
            return false;
        } else {
            int index = askInt("Digite o index do quadrado que deseja editar: " + indexes);
            if (indexes.contains(String.valueOf(index))) {
                Quadrado q = (Quadrado) lista.get(index);
                int tamanhoNovo = askInt("Digite o novo tamanho do lado do quadrado: ");
                q.setTamanho(tamanhoNovo);
                lista.set(index, q);
                return true;
                //return (Quadrado) lista.get(index);
            } else {
                showLnMsg("Index Invalido");
                return false;
            }
            
        }
        
    }
    
    public void listarQuadrado(ArrayList<FiguraGeometrica> lista) {
        showLnMsg("------ LISTAR QUADRADO -----");
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Quadrado) {
                showLnMsg(lista.get(i).toString());
            }
        }
    }
    
    public int showQuadradoSubMenu() {
        int option = 0;
        
        option = super.showSubMenu();
        return option;
        
    }
    
}
