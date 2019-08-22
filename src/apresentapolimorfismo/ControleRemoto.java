/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentapolimorfismo;

/**
 *
 * @author luiz
 */
public interface ControleRemoto {
       

  void passarCanal();
  void voltarCanal();
  void aumentarVolume ();
  void diminuirVolume ();
  boolean ligar();
  boolean desligar();
}