/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploordenador;

/**
 *
 * @author ipampillonvieitez
 */
public class Cpu {
    
    public int velocidade;
    public int memoria;
    
    public Cpu(){
        
    }
    /**
     * se crea un constructor con parametros y se añade la velocidad y la memoria
     * @param velocidade rapidez
     * @param memoria capacicad de almacenar datos
     */
    public Cpu(int velocidade, int memoria){
        this.velocidade=velocidade;
        this.memoria=memoria;
    }
    /**
     * muestra la velocidad int
     * @param velocidade 
     */
    public void setVelocidade(int velocidade){
        this.velocidade=velocidade;
    }
    /**
     * 
     * @return devuelve el valor de la velocidad int
     */
    public int getVelocidade(){
        return velocidade;
    }
    /**
     * muestra la memoria int
     * @param memoria 
     */
    public void setMemoria(int memoria){
        this.memoria=memoria;
    }
    /**
     * 
     * @return devuelve el valor de la memoria int
     */
    public int getMemoria(){
        return memoria;
    }
}
