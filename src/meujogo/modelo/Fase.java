package meujogo.modelo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.nio.file.Files.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Fase extends JPanel implements ActionListener{
    
    private Image fundo;
    private Player player;
    private Timer timer;
    private list<Enemy1> enemy1;
    
            
    public Fase(){
        SetFocusable(true);
        SetDoubleBuffered(true);
        
        ImageIcon referencia = new ImageIcon("res\\fundo.jpeg");
        fundo = referencia.getImage();
        player = new Player();
        player.load();
        addkeyListener(new TecladoAdapter());
        
        timer = new Timer(5,this);
        timer.start();
        InicializaInimigos();
     }
    /* Criei esse método InicializaInimigos colocando ele dentro da classe Fase. Até esse momento 28/04 22:12 a classe fase.java se encotra incompleta, 
    estou mechendo somente no método pois fui atarefado a mecher nele na criação dos inimigos do jogo ~~LUCAS d= */
    public void InicializaInimigos(){
        int cordernadas[]= new int [40]; 
        enemy1 = new ArrayList<Enemy1>();
        
        for (int i = 0; i < cordernadas.length; i++) {
            int x = (int)(Math.random()*8000+1024);
            int y = (int)(Math.random()*650+30);
          enemy1.add(new Enemy1(x,y));
    
     }
    }
    public void paint (Graphics g){ 
        Graphics2D graficos = (Graphics2D) g;
        graficos.drawImage(fundo, 0, 0, null);
        g.dispose();
        
        /*Comeco dos códigos do inimigo part.Lucas*/
        for (int o = 0; o < enemy1.size; o++) {
            Enemy1 in = enemy1.get(0);
            in.load();
            graficos.drawImage(in.getImage(),in.getX(),in.getY(),this);
        }
        /*Fim dos códigos do inimigo*/
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        player.update();
        
        List<tiro> tiros = player.getTiros();
        for (int i = 0;  i< tiros.size(); i++){
            Tiro m = tiros.get(i);
            if (m.isvisible()){
                m.update();
            }else{
                enemy1.remove(i)
            }
        }
        for (int o = 0; o < enemy1.size; o++) {
            Enemy1 in = enemy1.get(o);
            if (in.isVisivel()){
                in.update();
            } else{
                enemy1.remove(o);
                
            }
                repaint();
            
            
            
        }
        
    }
}