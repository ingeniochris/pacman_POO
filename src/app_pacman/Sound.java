
package app_pacman;

import java.io.File;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {
   

    public Sound() {
    
    }
    
    public void in(){
       try {
           Clip sonido = AudioSystem.getClip();
           File st=new File("C:/Users/jesus christian/Documents/NetBeansProjects/App_pacman/src/sound/pacman_beginning.wav");
           //File waka=new File("C:/Users/jesus christian/Documents/NetBeansProjects/App_pacman/src/sound/pacman_chomp.wav");
                     
            // Se carga con un fichero wav
            sonido.open(AudioSystem.getAudioInputStream(st));
            sonido.start();
    
      
            
          
        } catch (Exception e) {
            System.out.println(" " + e);
        }
       
    
    }
    public void mov(){
       try {
           Clip sonido = AudioSystem.getClip();
          // File st=new File("C:\\Users\\jesus christian\\Documents\\NetBeansProjects\\App_pacman\\src\\sound\\pacman_beginning.wav");
           File waka=new File("C:/Users/jesus christian/Documents/NetBeansProjects/App_pacman/src/sound/pacman_chomp.wav");
                     
            // Se carga con un fichero wav
            sonido.open(AudioSystem.getAudioInputStream(waka));
            sonido.start();
    
      
            
        } catch (Exception e) {
            System.out.println(" " + e);
        }
       
    
    }
    
    public void eatponit(){
       try {
           Clip sonido = AudioSystem.getClip();
          // File st=new File("C:\\Users\\jesus christian\\Documents\\NetBeansProjects\\App_pacman\\src\\sound\\pacman_beginning.wav");
           File waka=new File("C:/Users/jesus christian/Documents/NetBeansProjects/App_pacman/src/sound/pacman_eatfruit.wav");
                     
            // Se carga con un fichero wav
            sonido.open(AudioSystem.getAudioInputStream(waka));
            sonido.start();
    
      
        } catch (Exception e) {
            System.out.println(" " + e);
        }
       
    
    }
    
    public void EndGame(){
       try {
           Clip sonido = AudioSystem.getClip();
          // File st=new File("C:\\Users\\jesus christian\\Documents\\NetBeansProjects\\App_pacman\\src\\sound\\pacman_beginning.wav");
           File waka=new File("C:/Users/jesus christian/Documents/NetBeansProjects/App_pacman/src/sound/pacman_intermission.wav");
                     
            // Se carga con un fichero wav
            sonido.open(AudioSystem.getAudioInputStream(waka));
            sonido.start();
    
      
            
          
        } catch (Exception e) {
            System.out.println(" " + e);
        }
       
    
    }
    
    
   
   
  
}
