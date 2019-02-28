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
public class MilesToFeetInteractive {
     private static float PIES=5280;
    private float MILLA;
    
    public MilesToFeetInteractive(float millas){
        this.MILLA=millas;
    }

    public String convertir(){
        return String.format("La distancia a la casa de mi tío es de %.2f millas o %.2f pies",this.getMILLA(),this.getMILLA()*this.getPIES());
    }
    /**
     * @return the PIES
     */
    public static float getPIES() {
        return PIES;
    }

    /**
     * @param aPIES the PIES to set
     */
    public static void setPIES(float aPIES) {
        PIES = aPIES;
    }

    /**
     * @return the MILLA
     */
    public float getMILLA() {
        return MILLA;
    }

    /**
     * @param MILLA the MILLA to set
     */
    public void setMILLA(float MILLA) {
        this.MILLA = MILLA;
    }
    
}
