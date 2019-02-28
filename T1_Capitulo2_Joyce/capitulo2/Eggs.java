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
public class Eggs {
   private static float PRED=(float)3.25;
    private static float PREI=(float)0.45;
    private Integer cantidadh;
   
    public Eggs(Integer cantidadh){
        this.cantidadh=cantidadh;
    }

    public String toString(){
        return String.format("Usted ordeno %d huevo.Esto es %d docenas a $%.2f y %d huevos sueltos a $%.2f centavos por un total de $%.2f",this.getCantidadh(),this.getCantidadh()/12,PRED,this.getCantidadh()%12,PREI,((this.getCantidadh()/12)*PRED)+((this.getCantidadh()%12)*PREI) );
    }
    /**
     * @return the PRED
     */
    public static float getPRED() {
        return PRED;
    }

    /**
     * @param aPRED the PRED to set
     */
    public static void setPRED(float aPRED) {
        PRED = aPRED;
    }

    /**
     * @return the PREI
     */
    public static float getPREI() {
        return PREI;
    }

    /**
     * @param aPREI the PREI to set
     */
    public static void setPREI(float aPREI) {
        PREI = aPREI;
    }

    /**
     * @return the cantidadh
     */
    public Integer getCantidadh() {
        return cantidadh;
    }

    /**
     * @param cantidadh the cantidadh to set
     */
    public void setCantidadh(Integer cantidadh) {
        this.cantidadh = cantidadh;
    } 
}
