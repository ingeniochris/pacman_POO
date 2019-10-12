/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_pacman;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import java.util.Random;

public class Lienzo extends JPanel implements KeyListener{
    private Laberinto L;
    private Pacman p;
    private Sound s;
    private Fantasma f1;
    private Fantasma f2;
    private Fantasma f3;
    private Fantasma f4;
   
    
    public Lienzo(){
       this.setBackground(Color.BLACK);  
       
     
       L=new Laberinto();
       p=new Pacman(L);
       s=new Sound();
       f1=new Fantasma(L);
       f2=new Fantasma(L);
       f3=new Fantasma(L);
       f4=new Fantasma(L);
         s.in();
       
       
       
       
       
    }
      
    public void paintComponent(Graphics g){
         super.paintComponent(g);
         L.printLaberinto(g);
         p.PaindPacman(g);
         
    
         
            f1.PaindFan(g,Color.PINK, f1.getX(),f1.getY());
            f2.PaindFan(g,Color.blue,f2.getX(),f2.getY());
            f3.PaindFan(g,Color.YELLOW,f3.getX(),f3.getY());
            f4.PaindFan(g,Color.MAGENTA, f4.getX(),f4.getY());
        
          for(int i = 0; i < 1; i++)
        { 
            mover();
           move2();
           
        }
    }
    
      @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        
        switch(ke.getKeyCode()){
            case KeyEvent.VK_UP:
                p.Arriba();
          
                break;
            case KeyEvent.VK_DOWN:
                p.Abajo();
           
                break;       
            case KeyEvent.VK_LEFT:
                p.Izquierda();
          
                break;
            case KeyEvent.VK_RIGHT:
                p.Derecho();
          
                break;
        }
        
        this.repaint();   
    }
    
       public void mover()
    {
        int valor=1;
        Random r = new Random();
        while(valor<2)
        {
            int alea = r.nextInt(4)+1;
            if(alea==1)
            {
                f1.Abajo();
                f3.Arriba();
                this.repaint();
            }
            if(alea==2)
            {
                f1.Arriba();
                f3.Abajo();
                this.repaint();
            }
            if(alea==3)
            {
                f3.Derecho();
                f1.Izquierda();
                this.repaint();
            }
            if(alea==4)
            {
                f3.Izquierda();
                f1.Derecho();
                this.repaint();
            }
            this.repaint();
            valor+=1;
            try 
            {
                Thread.sleep(50);
            } 
            catch (InterruptedException ex) 
            {
                System.out.println(ex);
            }
        }
    }
    
    public void move2()
    {
        int valor=0;
        Random r = new Random();
        
        while(valor<2)
        {
            int alea = r.nextInt(4)+1;
            if(alea==1)
            {
                f2.Arriba();
                f4.Abajo();
                this.repaint();
            }
            if(alea==2)
            {
                f2.Abajo();
                f4.Arriba();
                this.repaint();
            }              
            if(alea==3)
            {
                f2.Derecho();
                f4.Izquierda();
                this.repaint();
            }
            if(alea==4)
            {
                f2.Izquierda();
                f4.Derecho();
                this.repaint();
            }
            this.repaint();
            valor+=1;
            try 
            {    
                Thread.sleep(50);
            } 
            catch (InterruptedException ex) 
            {
                System.out.println(ex);
            }
        }
    
    }
    
    
    

    @Override
    public void keyReleased(KeyEvent e) {
    }
   
       
    
}
