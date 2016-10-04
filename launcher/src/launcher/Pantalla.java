package launcher;

import java.awt.Canvas;
import javax.swing.JFrame;

public class Pantalla extends Canvas {

    JFrame pantalla = new JFrame();
    public int widght, height;
    Canvas pntor;

    public Pantalla(int widght, int height) {
        this.widght = widght;
        this.height = height;
        mostrarpantalla();
    }

    void mostrarpantalla() {
        pantalla.setVisible(true);
        pantalla.setSize(widght, height);
        pantalla.setResizable(false);
        pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pntor = new Canvas();
       pntor.setFocusable(false);
        pantalla.add(pntor);
    }

    public Canvas getCanvas() {

        return pntor;
    }
    
    public JFrame getFrame(){
    
    return pantalla;
    }
    
}
