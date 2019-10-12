/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_pacman;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author jesus christian
 */
public class Fantasma {
   Graphics g;
    private int x;
    private int y;   
    private int gx;
    private int gy;
    private int xm; 
    private int ym;
    private Laberinto L;


    public Fantasma(Laberinto L)
    {
        x=400;
        y=400;
        gx=400;
        gy=400;
        xm = 8;
        ym = 9;
        this.L=L;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getGx() {
        return gx;
    }

    public int getGy() {
        return gy;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setGx(int gx) {
        this.gx = gx;
    }

    public void setGy(int gy) {
        this.gy = gy;
    }



    public int getXm() {
        return xm;
    }

    public int getYm() {
        return ym;
    }

  

    public void setXm(int xm) {
        this.xm = xm;
    }

    public void setYm(int ym) {
        this.ym = ym;
    }
      
    public void PaindFan(Graphics g, Color c,int x, int y){
        this.g=g;
   
        g.setColor(c);
        g.fillArc(x,y, 28,28,gx,gy);
        g.fillRect(x+1,y+12, 27,19);
        g.setColor(Color.WHITE);
        g.fillOval(x+5,y+5, 6, 9);
        g.fillOval(x+15,y+5, 6, 9);
        g.setColor(Color.BLUE);
        g.fillOval(x+5,y+5, 4, 4);
        g.fillOval(x+15,y+5, 4, 4);
        g.setColor(c);
        g.fillArc(x,y+18, 8,15,gx+180,gy+10);
        g.fillArc(x+10,y+18, 8,15,gx+180,gy+10);
        g.fillArc(x+20,y+18, 8,15,gx+180,gy+10);
       
    }
    
    public void Arriba(){
        ym--;
        if(ym==-1)
            ym=12;

        int vm=L.getMatPacMan(ym, xm);
        if(vm>0 ) 
            y=ym*50;
        else
            ym++;
    }
    
    public void Abajo(){
        ym++;
        if(ym==13)
            ym=0;

        int vm=L.getMatPacMan(ym, xm);
        if(vm>0 ) 
            y=ym*50;
        else
            ym--;
    }
    
    public void Derecho(){
        xm++;
        if(xm==25)
            xm=0;

        int vm=L.getMatPacMan(ym, xm);
        if(vm>0 ) 
            x=xm*50;
        else
            xm--;       
    }
    
    public void Izquierda(){
        xm--;
        if(xm==-1)        
            xm=24;

        int vm=L.getMatPacMan(ym, xm);
        if(vm>0) 
            x=xm*50;
        else
            xm++;
    }

   
    
}
    