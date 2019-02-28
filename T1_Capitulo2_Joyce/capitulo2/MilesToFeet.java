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
public class MilesToFeet {
    private static float PIES=5280;
    private float MILLAS;
    
    public MilesToFeet(){
        this.MILLAS=(float)8.5;
    }

        public String convertir(){
        return String.format("La distancia a la casa de mi tío es de %.2f millas o %.2f pies",this.getMILLAS(),this.getMILLAS()*this.getPIES());
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
     * @return the MILLAS
     */
    public float getMILLAS() {
        return MILLAS;
    }

    /**
     * @param MILLAS the MILLAS to set
     */
    public void setMILLAS(float MILLAS) {
        this.MILLAS = MILLAS;
    }
    
    
}
