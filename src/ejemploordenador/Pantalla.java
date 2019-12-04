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
public class Pantalla {
     public String marca;
    public String pulgadas;
    public Pantalla(){
        
    }
    /**
     * se crea contructor con parametros y se le da la marca y las pulgadas
     * @param marca fabricantes pantalla
     * @param pulgadas tamaño pantalla
     */
    public Pantalla(String marca, String pulgadas){
        this.marca=marca;
        this.pulgadas=pulgadas;
    /**
     * muestra el valor string de la marca
     * @param marca 
     */
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    /**
     * devuelve valor string de la marca
     * @return 
     */
    public String getMarca(){
        return marca;
    }
    /**
     * muestra el valor string del tamaño de la pantalla
     * @param pulgadas 
     */
    public void setPulgadas(String pulgadas){
        this.pulgadas=pulgadas;
    }
    /**
     * devuelve valor string de las pulgadas
     * @return 
     */
    public String getPulgadas(){
        return pulgadas;
    }
}
