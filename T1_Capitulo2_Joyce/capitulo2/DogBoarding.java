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
public class DogBoarding {
   private float peso;
    private Integer dias;
    private static float COSTO=(float)0.5;
    
    public DogBoarding(float peso,Integer dias){
        this.peso=peso;
        this.dias=dias;
    }

    public String toString(){
        return String.format("Su perro pesa %.2f libras asi que el total es de $%.2f",this.getPeso(),(this.getPeso()*COSTO)*this.getDias());
    }
    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * @return the dias
     */
    public Integer getDias() {
        return dias;
    }

    /**
     * @param dias the dias to set
     */
    public void setDias(Integer dias) {
        this.dias = dias;
    }

    /**
     * @return the COSTO
     */
    public static float getCOSTO() {
        return COSTO;
    }

    /**
     * @param aCOSTO the COSTO to set
     */
    public static void setCOSTO(float aCOSTO) {
        COSTO = aCOSTO;
    } 
}
