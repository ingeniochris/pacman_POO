/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_pacman;

import javax.swing.JFrame;

public class Ventana extends JFrame{
    
 
    public Ventana(){
       this.setTitle("PACman");
       this.setSize(1270, 690);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       Lienzo l=new Lienzo();
       
       this.add(l);
       this.addKeyListener(l);
    }
}
