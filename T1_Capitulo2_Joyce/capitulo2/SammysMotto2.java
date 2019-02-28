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
public class SammysMotto2 {
    public String cuadro(){
        for(int col=1;col<=18;col++)
            System.out.print(" *");
        System.out.print("\n");
        for(int fila=2;fila<=2;fila++){
            System.out.print(" *");
            for(int col=2;col<=2;col++)
                System.out.print(" Sammy’s makes it fun in the sun");
                System.out.print(" * \n");
        }
        for(int col=1;col<=18;col++)
        System.out.print(" *");   
        return "";
    }
}
