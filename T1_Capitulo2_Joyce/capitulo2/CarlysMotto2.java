/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo2;

/**
 *
 * @author eriss
 */
public class CarlysMotto2 {
    public String cuadro(){
        for(int col=1;col<=26;col++)
            System.out.print(" *");
        System.out.print("\n");
        for(int fila=2;fila<=2;fila++){
            System.out.print(" *");
            for(int col=2;col<=2;col++)
                System.out.print(" Carly hace la comida que la convierte en fiesta");
                System.out.print(" * \n");
        }
        for(int col=1;col<=26;col++)
        System.out.print(" *");   
        return "";
    }
}
