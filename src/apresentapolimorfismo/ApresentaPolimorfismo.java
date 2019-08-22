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
public class ApresentaPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ModeloTV001 tv1 = new ModeloTV001(21);
    tv1.ligar();
   
    System.out.print("TV1 - modelo " + tv1.MODELO + " está ");
    System.out.println(tv1.isLigada() ? "ligada" : "desligada");

    System.out.println(tv1.isLigada() ? "ligada" : "desligada");
    // ambas as TVs estão ligadas e vamos desligá-las
    System.out.println("Desligando modelo " + tv1.MODELO);
    tv1.desligar();
    
}
}
