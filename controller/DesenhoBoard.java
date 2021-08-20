package pc2.lab.aula09.projetoFigGeometricaLucas.controller;

//import pc2.lab.aula09.projetoFigGeometricaLucas.model.FiguraGeometrica;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.Circulo;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.FiguraGeometrica;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.Losango;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.Quadrado;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.Reta;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.Retangulo;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.Trapezio;
import pc2.lab.aula09.projetoFigGeometricaLucas.model.Triangulo;

//import javax.swing.*;
//import java.awt.*;
public class DesenhoBoard extends JFrame {

    private ArrayList<FiguraGeometrica> array;
    private int x;
    private int y;
    private Graphics g;

    public DesenhoBoard() {
        x = 100;
        y = 100;
        setSize(1000, 1000);
        //setLocationRelativeTo(null);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setVisible(true);

    }

    @Override
    public void paint(Graphics g) {
        //super.paint(g); //To change body of generated methods, choose Tools | Templates.
        for (int i = 0; i < array.size(); i++) {
            desenhar(array.get(i), i + 1);
        }
    }

    public void desenhar(FiguraGeometrica figura, int contador) {

        switch (contador) {
            case 1:
                removeAll();
                x = 100;
                y = 100;
                break;
            case 2:
                x = 100;
                y = 300;
                break;
            case 3:
                x = 100;
                y = 500;
                break;
            case 4:
                x = 100;
                y = 700;
                break;
            case 5:
                x = 100;
                y = 900;
                break;
            case 6:
                x = 500;
                y = 100;
                break;
            case 7:
                x = 500;
                y = 300;
                break;
            case 8:
                x = 500;
                y = 500;
                break;
            case 9:
                x = 500;
                y = 700;
                break;
            case 10:
                x = 500;
                y = 900;
                break;
        }

        if (figura.getClass() == Reta.class) {
            super.getGraphics().drawLine(x, y, x + 20, y + 20);
        } else if (figura.getClass() == Quadrado.class) {
            super.getGraphics().drawRect(x, y, ((Quadrado) figura).getTamanhoLado() * 15, ((Quadrado) figura).getTamanhoLado() * 15);
        } else if (figura.getClass() == Retangulo.class) {
            super.getGraphics().drawRect(x, y, ((Retangulo) figura).getBase() * 15, ((Retangulo) figura).getAltura() * 15);
        } else if (figura.getClass() == Triangulo.class) {
            super.getGraphics().drawPolygon(
                    new int[]{x - ((Triangulo)figura).getBase() * 15, x, x + ((Triangulo)figura).getBase() * 15},
                    new int[]{y + ((Triangulo)figura).getAltura() * 15, y, y + ((Triangulo)figura).getAltura()* 15},
                    3);
            
        } else if (figura.getClass() == Losango.class) {

        } else if (figura.getClass() == Circulo.class) {

        } else if (figura.getClass() == Trapezio.class) {

        }

    }

    public void getFiguras(ArrayList<FiguraGeometrica> figuraGeometrica) {
        this.array = figuraGeometrica;
    }

    /*private void criarEMostrarBoard() {
        System.out.println("Log que Criou a tela? " +
                SwingUtilities.isEventDispatchThread());
        JFrame f = new JFrame("Teste de Desenhos");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new PainelDeDesenho());
        f.setSize(250, 250);
        f.setVisible(true);
    }

    public void desenhar(FiguraGeometrica[] figs) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                criarEMostrarBoard();
            }
        });


        return;
    }

    class PainelDeDesenho extends JPanel {

        public PainelDeDesenho() {
            setBorder(BorderFactory.createLineBorder(Color.black));
        }

        public Dimension getPreferredSize() {
            return new Dimension(300, 300);
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Draw Text
            g.drawString("Meu Primeiro paint!", 10, 20);
            g.drawRect(50, 50, 10, 20);
        }
    }*/
}
