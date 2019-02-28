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
public class FahrenheitToCelsius {
 private float f;
    
    public FahrenheitToCelsius(Integer f){
        this.f=f;
    }

    @Override
    public String toString(){
        return String.format("%.2f grados fahrenheit es equivalente a %.2f grados celsius",this.getF(),(this.getF()-32)*5/9);
    }
    /**
     * @return the f
     */
    public float getF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(float f) {
        this.f = f;
    }   
}
