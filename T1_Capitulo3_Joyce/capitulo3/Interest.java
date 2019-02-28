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
public class Interest {
    private Integer pretamo;
    
    public Interest(Integer x){
        this.pretamo=x;
    }
    
    public double Tasa(){
     return (this.getPretamo()*0.05)*1;
    }

    public double Intereses(){
        return this.getPretamo()+this.Tasa();
    }
    
    public String toString(){
        return String.format("A lo largo de un año a ahorrado $%.2f de $%d",this.Intereses(),this.getPretamo());
    }
    /**
     * @return the pretamo
     */
    public Integer getPretamo() {
        return pretamo;
    }

    /**
     * @param pretamo the pretamo to set
     */
    public void setPretamo(Integer pretamo) {
        this.pretamo = pretamo;
    }
    
    
}
