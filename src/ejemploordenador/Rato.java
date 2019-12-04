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
public class Rato {
    
    public String tipo;

    public Rato() {

    }

    /**
     * se crea constructor con parametros y se le añade el tipo
     *
     * @param tipo
     */
    public Rato(String tipo) {
        this.tipo = tipo;
    }

    /**
     *
     * @param tipo muestra el tipo string
     */
    public void setRato(String tipo) {
        this.tipo = tipo;
    }

    /**
     *
     * @return devuelve el tipo string
     */
    public String Rato() {
        return tipo;
    }
}
