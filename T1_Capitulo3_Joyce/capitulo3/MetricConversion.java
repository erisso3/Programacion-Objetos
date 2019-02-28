/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo3;

/**
 *
 * @author eriss
 */
public class MetricConversion {
    private double valor;
    private static double C_P=2.54;
    private static double L_G=3.7854;
    
    public MetricConversion(double x){
        this.valor=x;
    }

    public String Cen_pie(){
        return String.format("%.2f pulgadas equivalen a %.2f cetimetros\n%.2f galones equivalen a %.2f litros",this.getValor(),this.getValor()*C_P,this.getValor(),this.getValor()*L_G);
    }
    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the C_P
     */
    public static double getC_P() {
        return C_P;
    }

    /**
     * @param aC_P the C_P to set
     */
    public static void setC_P(double aC_P) {
        C_P = aC_P;
    }

    /**
     * @return the L_G
     */
    public static double getL_G() {
        return L_G;
    }

    /**
     * @param aL_G the L_G to set
     */
    public static void setL_G(double aL_G) {
        L_G = aL_G;
    }
    
    
}
