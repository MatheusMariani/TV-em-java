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
           System.out.println("volume:"+this.volume);
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
             System.out.println("volume:"+this.volume);
             }
      else 
             System.out.println("volume está mudo");
}
    else 
            System.out.println("TV precisa estar ligada");

public void aumentaCanal(){
      if(this.ligada = true){
      if(this.canal<this.maxcanal){
           if(this.canal<this.maxcanal){
               this.canal++;
               System.out.println("canal:"+this.canal);
	   }	
            else 
               System.out.println("está no ultimo canal");
}
            else 
               System.out.println("TV precisa estar ligada");
     }
}
public void diminuiCanal(){
      if(this.ligada = true){
      if(this.canal<this.maxcanal){
           if(this.volume>0){
               this.volume--;
                  System.out.println("canal:\n"+this.canal);
	   }
            else 
                  System.out.println("volume está mudo");
}
            else 
                  System.out.println("TV precisa estar ligada");
     }
}
   
public void ligarTv(){
   if(this.ligada = false){
      this.ligada = true;
   }
   else 
    System.out.println("TV ja está ligada");  
   
   
public void desligarTv(){
    if(this.ligada = true){
       this.ligada = false;
    }
    else 
      System.out.println("TV ja está desligada");  
   
   
public void menu() { // menu principal
		int opcao = 0;
		do {
	                System.out.println("                  |          CONTROLE        |");
			System.out.println("                  |     1 - Aumenta canal         |");
			System.out.println("                  |     2 - Diminui canal      |");
			System.out.println("                  |     3 - Aumenta Volume      |");
			System.out.println("                  |     4 - Diminui Volume   |");
			System.out.println("                  |     5 - Ligar TV      |");
			System.out.println("                  |     6 - Desligar TV |");
			System.out.println("                  |     0 - Sair          |");
			System.out.println("                  =========================\n");			
			Scanner scan = new Scanner(System.in);
                       opcao = Integer.parseInt(scan.nextLine());
			switch (opcao) {
			               case 1:
                                 aumentaCanal();
				                     break;
		                  case 2:
				                    diminuiCanal();
				                     break;

                        case 3:
                                 aumentaVolume();
                                 break;
                          
                        case 4:
                                  diminuiVolume();
                                  break;

			               case 5:
				                    ligarTv();
				                     break;

                        case 6: 
                                desligarTv();
                                break;
                        
			               case 0:
				            break;

		         default:
				System.out.println("Opção Inválida!");
				break;
			}
		} while (opcao != 0);
	}









}
