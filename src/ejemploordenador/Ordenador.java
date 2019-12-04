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
public class Ordenador {
     private Rato rato;
    private Pantalla pant;
    private Cpu proces;
    
    public Ordenador(){
        rato= new Rato();
        pant= new Pantalla();
        proces= new Cpu();       
    }
    /**
     * primero se crea el contrusctor con parametros y recibe rato, pantalla y
     * cpu
     * @param rato objeto rato
     * @param pant objeto pantalla
     * @param proces objeto cpu
     */
    public Ordenador(Rato rato, Pantalla pant, Cpu proces){
        this.rato=rato;
        this.pant=pant;
        this.proces=proces;
    }
    /**
     * 
     * @param rato muestra valor del rato
     */
    public void setRato(Rato rato){
        this.rato=rato;
    }
    /**
     * 
     * @return devuelve valor rato
     */
    public Rato getRato(){
        return rato;
    }
    /**
     * 
     * @param pant muestra el valor de la pantalla
     */
    public void setPant(Pantalla pant){
        this.pant=pant;
    }
    /**
     * 
     * @return devuelve valor de la pantalla
     */
    public Pantalla getPant(){
        return pant;
    }
    /**
     * 
     * @param cpu muestra valor de la cpu
     */
    public void setCpu(Cpu cpu){
        this.proces=cpu;
    }
    /**
     * 
     * @return devuelve valor de la cpu
     */
    public Cpu getCpu(){
        return proces;
    }
}


