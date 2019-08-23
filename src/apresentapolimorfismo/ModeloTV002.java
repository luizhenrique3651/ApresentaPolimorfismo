/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentapolimorfismo;

import javax.swing.JOptionPane;

/**
 *
 * @author luiz
 */
public class ModeloTV002 extends Tv implements ControleRemoto {
         public final String MODELO = "TV002";
         int canal=0;
         int taxa =0;
         public ModeloTV002(int tamanho) {
    super(tamanho);
  }
   
     @Override
    public boolean desligar(){
        
      super.setLigada(false);
       JOptionPane.showMessageDialog(null, "Desligada");
       return false;
    }
    
     @Override
    public boolean ligar(){
    
        super.setLigada(true);
               JOptionPane.showMessageDialog(null, "Ligada");

        return true;
    }
 
     
     @Override
  public void aumentarVolume() { 
      super.setVolume(taxa++);
      
   
      if(taxa>100){
          System.out.println("você já está no maior volume");
          taxa--;
      }
      
       System.out.println("Volume: "+taxa);
  }
  
  
     @Override
  public void diminuirVolume() {
      super.setVolume(taxa--);
      
      
      if(taxa<0){
      
          System.out.println("Você ja está no menor volume");
          taxa++;
      }
      
               System.out.println("Volume: "+taxa);

  }
  
  
     @Override
  public void passarCanal() { 
      super.setCanal(canal++);
         System.out.println("Canal: "+canal);
      if(canal>899){
      canal=0;
      }
  }

    
     @Override
  public void voltarCanal() { 
      super.setCanal(canal--);
               System.out.println("Canal: "+canal);

      if(canal<1){
      canal=901;
      }
  }
}
