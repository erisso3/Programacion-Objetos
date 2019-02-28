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
public class GasPrices {
    private Integer pricePerBarrel;
    
    public GasPrices(Integer x){
        this.pricePerBarrel=x;
    }

    public String Gasolina(){
        return String.format("Precio de la bomba: %.2f\nPrecio de galon: %.2f",this.pricePerBarrel*0.035,this.pricePerBarrel*0.04);
    }
            
    /**
     * @return the pricePerBarrel
     */
    public Integer getPricePerBarrel() {
        return pricePerBarrel;
    }

    /**
     * @param pricePerBarrel the pricePerBarrel to set
     */
    public void setPricePerBarrel(Integer pricePerBarrel) {
        this.pricePerBarrel = pricePerBarrel;
    }
    
    
}
