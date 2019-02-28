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
public class Dollars {
    private Integer Dolar;
    private static float V=(float)0.2;
    private static float D=(float)0.10;
    private static float C=(float)0.05;
    private static float U=(float)0.01;
    
    public Dollars(Integer dolar){
        this.Dolar=dolar;
    }

    public String toString(){
        return String.format("%d dolares es equivalente a %.0f monedas de 20, %.0f monedas de 10, %.0f monedas de 5 o %.0f monedas de 1",this.getDolar(),this.getDolar()/V,this.getDolar()/D,this.getDolar()/C,this.getDolar()/U);
    }
    /**
     * @return the Dolar
     */
    public Integer getDolar() {
        return Dolar;
    }

    /**
     * @param Dolar the Dolar to set
     */
    public void setDolar(Integer Dolar) {
        this.Dolar = Dolar;
    }

    /**
     * @return the V
     */
    public static float getV() {
        return V;
    }

    /**
     * @param aV the V to set
     */
    public static void setV(float aV) {
        V = aV;
    }

    /**
     * @return the D
     */
    public static float getD() {
        return D;
    }

    /**
     * @param aD the D to set
     */
    public static void setD(float aD) {
        D = aD;
    }

    /**
     * @return the C
     */
    public static float getC() {
        return C;
    }

    /**
     * @param aC the C to set
     */
    public static void setC(float aC) {
        C = aC;
    }

    /**
     * @return the U
     */
    public static float getU() {
        return U;
    }

    /**
     * @param aU the U to set
     */
    public static void setU(float aU) {
        U = aU;
    }
}
