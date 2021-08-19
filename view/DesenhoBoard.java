package pc2.lab.aula09.projetoFigGeometricaLucas.view;

//import pc2.lab.aula09.projetoFigGeometricaLucas.model.FiguraGeometrica;

import java.awt.Graphics;
import javax.swing.JFrame;


//import javax.swing.*;
//import java.awt.*;

public class DesenhoBoard extends JFrame {

    public DesenhoBoard() {
        setSize(1200,900);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    @Override
    public void paint(Graphics g){
        g.drawLine(100, 100, 500, 500);
        //g.drawRect(400, 100, 300, 300);
        g.drawOval(420, 120, 260, 260);
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
