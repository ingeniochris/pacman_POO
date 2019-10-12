
package app_pacman;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Pacman {
   private Laberinto L;
    private int x;
    private int y;
    private int xg;
    private int yg; 
    private int xm; 
    private int ym;
    private int vm;
    private int score;
    private Graphics g;
    private Sound s=new Sound();
    
    
    

 /*   public Pacman(Laberinto L,int x, int y, int gx, int gy, int xm, int ym ) {
        
        this.x = x;
        this.y = y;
        this.gx = gx;
        this.gy = gy;
        this.L=L;
        this.xm=xm;
        this.ym=ym;
    }*/
    
    public Pacman(Laberinto L){
       this.L=L;
        x=55;
        y=55;
        xg=45;
        yg=265;
        xm=1;
        ym=1;
        score=0;   
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getXm() {
        return xm;
    }

    public int getYm() {
        return ym;
    }
    
  

    public void PaindPacman(Graphics g){
        this.g=g;
         g.setColor(Color.yellow);
         g.fillArc(x, y, 30, 30, xg, yg);
         g.setColor(Color.black);
         g.fillOval(x+15, y+4, 5, 5);
         g.setColor(Color.white);
         g.setColor(Color.BLACK);
        g.setFont(new Font("Arial",Font.BOLD,30));
        g.drawString("Score: "+ String.valueOf(score),100, 30);
       
         if(score ==3680)
        {
            L.printLaberinto2();
        }
         
    }
    
    public void Arriba(){
        if(yg==265){
            yg=350;
            xg=94;
        }else{
            xg=135;
            yg=265;
        }
            
ym--;
if(ym==-1)
{
    ym=12;
}
//gx=130;
//gy=280;
int vm=L.getMatPacMan(ym, xm);
if(vm>0){
        if(vm==1){
            L.setMatPacMan(ym, xm);
            s.mov();
            score=score+20;
          L.setScore(score);
            
        }else if(vm==4){
            L.setMatPacManBola(ym, xm);
            s.eatponit();
            score=score+50;
            L.setScore(score);
        }
        y=ym*50;
        
    }else
        ym++;
    }
    
    public void Abajo(){
        if(yg==265){
            yg=350;
            xg=270;
        }else{
            xg=310;
            yg=265;
        }
        
        
        
ym++;
if(ym==13)
{
    ym=0;
}
//gx=310;
//gy=280;
int vm=L.getMatPacMan(ym, xm);
if(vm>0){
    if(vm==1){
        L.setMatPacMan(ym, xm);
        s.mov();
        score=score+20;
        g.setColor(Color.yellow);
        L.setScore(score);
    }else if(vm==4){
        L.setMatPacManBola(ym, xm);
        s.eatponit();
        score=score+50;
        L.setScore(score);
       
    }
    y=ym*50;
    
}else
        ym--;
}
    
    public void Derecho(){
        if(yg==265){
            yg=350;
            xg=10;
        }else{
            xg=45;
            yg=265;
        }
xm++;
if(xm==25)
{
    xm=0;
}
//gx=45;
//gy=280;
int vm=L.getMatPacMan(ym, xm);
if(vm>0){
    if(vm==1){
        L.setMatPacMan(ym, xm);
       s.mov();
        score=score+20;
        g.setColor(Color.yellow);
        L.setScore(score);
    }else if(vm==4){
        L.setMatPacManBola(ym, xm);
        s.eatponit();
        score=score+50;
        L.setScore(score);
       
    }
    x=xm*50;
}
    else
        xm--;
        
    }
    
    public void Izquierda(){
   // x-=50;
   /*  gx=210;
   gy=280;
   xm--;
   if(L.getMatPacMan(ym, xm)>0)
   x=xm*50;
   else
   xm++;*/
   if(yg==265){
            yg=350;
            xg=185;
        }else{
            xg=220;
            yg=265;
        }
xm--;
if(xm==-1)
{
    xm=24;
}
//gx=210;
//gy=280;
int vm=L.getMatPacMan(ym, xm);
if(vm>0){
    if(vm==1){
        L.setMatPacMan(ym, xm);
        s.mov();
        score=score+20;
        g.setColor(Color.yellow);
        L.setScore(score);
        
    }else if(vm==4){
        L.setMatPacManBola(ym, xm);
        s.eatponit();
        score=score+50;
        L.setScore(score);
      
    }
    x=xm*50;
}
    else
        xm++;
    }
    
    public void Bolita(int x, int y, int d){
        g.setColor(Color.CYAN);
        g.fillOval(x+20, y+20, d, d);
    }
    
}
