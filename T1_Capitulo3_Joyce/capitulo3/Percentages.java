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
public class Percentages {
    private double a;
    private double b;
    
    public Percentages(){
        this.a=2.0;
        this.b=5.0;
    }

    public String computePercent (){
        return String.format("%.2f es %.2f porciento de %.2f",this.getA(),(this.getA()*100)/this.getB(),this.getB());
    }
    /**
     * @return the a
     */
    public double getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public double getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(double b) {
        this.b = b;
    }
    
    
}
