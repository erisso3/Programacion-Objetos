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
public class Insurance {
    private Integer añoactual;
    private Integer añonaci;
    
    public Insurance(Integer x,Integer y){
        this.añoactual=x;
        this.añonaci=y;
    }
    
    public Integer año(){
        return this.getAñoactual()-this.getAñonaci();
    }
    
    public Integer decadas(){
        return this.año()/10;
    }
    
    public Integer prima(){
        return (this.decadas()+15)*20;
    }
    
    public String toString(){
        return String.format("Importe de la prima es de $%d",this.prima());
    }

    /**
     * @return the añoactual
     */
    public Integer getAñoactual() {
        return añoactual;
    }

    /**
     * @param añoactual the añoactual to set
     */
    public void setAñoactual(Integer añoactual) {
        this.añoactual = añoactual;
    }

    /**
     * @return the añonaci
     */
    public Integer getAñonaci() {
        return añonaci;
    }

    /**
     * @param añonaci the añonaci to set
     */
    public void setAñonaci(Integer añonaci) {
        this.añonaci = añonaci;
    }
    
}
