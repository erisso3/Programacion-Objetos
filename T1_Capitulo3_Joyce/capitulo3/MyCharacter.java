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
public class MyCharacter {
    private String Color;
    private Integer Ojos;
    private Integer Vidas;
    
    public MyCharacter(String x,Integer y,Integer z){
        this.Color=x;
        this.Ojos=y;
        this.Vidas=z;
    }

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * @return the Ojos
     */
    public Integer getOjos() {
        return Ojos;
    }

    /**
     * @param Ojos the Ojos to set
     */
    public void setOjos(Integer Ojos) {
        this.Ojos = Ojos;
    }

    /**
     * @return the Vidas
     */
    public Integer getVidas() {
        return Vidas;
    }

    /**
     * @param Vidas the Vidas to set
     */
    public void setVidas(Integer Vidas) {
        this.Vidas = Vidas;
    }
    
    
}
