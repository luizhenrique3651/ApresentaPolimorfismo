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
public class Tv {
  private int tamanho;
  private int canal;
  private int volume;
  private boolean ligada;
  public Tv(int tamanho) {
    this.tamanho = tamanho;
    this.canal = 0;
    this.volume = 0;
    this.ligada = false;
  }
  // abaixo vem todos os métodos construtores get e set...
 

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
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

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
}
  
