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
public class InchesToFeet {
   private static Integer PIES=12;
    private Integer pulgadas;
    
    public InchesToFeet(){
        this.pulgadas=86;
    }

    public String conver(){
        return String.format("%d pulgadas se convierten %d pies  y %d pulgadas",this.getPulgadas(),this.getPulgadas()/PIES,this.getPulgadas()%PIES);
    }
    /**
     * @return the PIES
     */
    public static Integer getPIES() {
        return PIES;
    }

    /**
     * @param aPIES the PIES to set
     */
    public static void setPIES(Integer aPIES) {
        PIES = aPIES;
    }

    /**
     * @return the pulgadas
     */
    public Integer getPulgadas() {
        return pulgadas;
    }

    /**
     * @param pulgadas the pulgadas to set
     */
    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }
     
}
