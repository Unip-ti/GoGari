package jogo;

import javax.swing.JFrame;
import java.util.*;
import meujogo.modelo.Fase;

public class container extends JFrame {
    
    public container(){
        add(new Fase());
        setTitle("Meu jogo");
        setSize(1024,728);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(false);
        setVisible(true);
    }
public static void main (String[]args){
    new container();
}

    private void add(Fase fase) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
// test1 //