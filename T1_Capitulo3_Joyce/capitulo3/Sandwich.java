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
public class Sandwich {
    private String ingrediente;
    private String pan;
    private double  precio;
    
    public Sandwich(String x,String y){
        this.ingrediente=x;
        this.pan=y;
        this.precio=15.39;
    }

    @Override
    public String toString(){
        return String.format("El ingrediente que eligio es %s, el pan es %s siendo un total de $%.2f",this.getIngrediente(),this.getPan(),this.getPrecio());
    }
    /**
     * @return the ingrediente
     */
    public String getIngrediente() {
        return ingrediente;
    }

    /**
     * @param ingrediente the ingrediente to set
     */
    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    /**
     * @return the pan
     */
    public String getPan() {
        return pan;
    }

    /**
     * @param pan the pan to set
     */
    public void setPan(String pan) {
        this.pan = pan;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
