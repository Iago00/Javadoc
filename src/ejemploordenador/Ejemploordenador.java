/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploordenador;

import java.util.Scanner;

/**
 *
 * @author ipampillonvieitez
 */
public class Ejemploordenador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        Ordenador ord= new Ordenador();
        Cpu aux = new Cpu(3,4060);
        Rato aux2 = new Rato("cable"); 
        Pantalla aux3 =new Pantalla("Lg", "20");
        ord.setRato(aux2);
        System.out.println(" rato: "+ord.getRato().Rato());
        ord.setPant(aux3);
        System.out.println(" pantalla: "+ord.getPant().getPulgadas());
        System.out.println(" pantalla: "+ord.getPant().getMarca());
        ord.setCpu(aux);
        System.out.println(" cpu: "+ord.getCpu().getVelocidade());
        System.out.println(" cpu: "+ord.getCpu().getMemoria());
        
    }
    
}
