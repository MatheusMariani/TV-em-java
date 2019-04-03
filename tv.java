package television;

import static java.lang.System.in;
import java.util.Scanner;

public class TV {
   private int canal;
   private int volume;
   private int maxvolume;
   private int maxcanal
   private boolean ligada;


public TV(int canal, int volume, boolean ligada, int max) {
   this.canal = canal;
   this.volume = volume;
   this.ligada = ligada;
   this.maxvolume = max;
}

public int getCanal() {
   return canal;
}
 
public void setCanal(int canal) {
   this.canal = canal;
}

public int getVolume() {
   return volume;
}
 

public void setVolume() {
   this.volume = volume;
}
 
public boolean isLigada() {
   return ligada;
}

public void setLigada(boolean ligada) {
   this.ligada = ligada;
}
public int getMaxV() {
   return max;
}
 
public void setMaxV(int maxvolume) {
   this.maxvolume = maxvolume;
}
 public int getMaxC() {
   return maxcanal;
}
 
public void setMaxC(int maxcanal) {
   this.maxcanal = maxcanal;
}

public Controle extends TV
    public Controle(int canal, int volume, boolean ligada, int max){
                 super(canal,volume,ligada,max);
                 }


public void aumentaVolume(){
   if(this.ligada = true){
        if(this.volume<this.maxvolume){
            this.volume++;
        }
        else 
           System.out.println("volume está no máximo");
        }
        else 
           System.out.println("TV precisa estar ligada");

public void diminuiVolume(){
   if(this.ligada = true){
      if(this.volume>0){
             this.volume--;
        }
      else 
         System.out.println("volume está mudo");
}
    else 
      System.out.println("TV precisa estar ligada");

public void aumentaCanal(){
   if(this.ligada = true){
      if(this.canal<this.maxcanal){
           if(this.volume>0){
               this.volume--;
           
      else 
           System.out.println("volume está mudo");
}
    else 
      System.out.println("TV precisa estar ligada");
     }
}










}
