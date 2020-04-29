/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*CLASSE RESPONSÁVEL POR CRIAR OS INIMIGOS DO JOGO É EQUIVALENTE UM INIMIGO  ~~Lucas =p */
package meujogo.modelo;

import java.awt.Image;
import java.awt.List;
import javax.swing.ImageIcon;

/**
 *
 * @author tvzue
 */
public class Enemy1 {
    private Image imagem;
    private int x,y ; 
    private int largura, altura; 
    private boolean isVisivel;
   
    
    //private static final int LARGURA = 938;
    private static int VELOCIDADE = 2;
    
    public Enemy1(int x, int y){
        this.x = x; 
        this.y = y;
        isVisivel = true;
        }
    public void load (){
        ImageIcon referencia = new ImageIcon("res\\enemy1.png");
        imagem = referencia.getImage();
        
        this.largura = imagem.getWidth(null);
        this.altura = imagem.getHeight(null);
    }
    public void update() {
    this.x -= VELOCIDADE; 
    //if (this.x > largura){
       // isvisible = false;
   // }
}
public boolean isVisivel(){
    return isVisivel;
}
public void setVisivel (boolean isVisivel){
  this.isVisivel = isVisivel;
}
}


