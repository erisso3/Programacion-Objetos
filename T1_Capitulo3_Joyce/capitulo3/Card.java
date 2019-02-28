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
public class Card {
    private Tipocartas carta;
    private Integer numero;
    
    public Card(){
        this.carta=Tipocartas.Espadas;
        this.numero=(int)(Math.random()*13+1);
    }

    public String toString(){
        return String.format("Tu carta es %d de %s",this.getNumero(),this.getCarta());
    }
    /**
     * @return the carta
     */
    public Tipocartas getCarta() {
        return carta;
    }

    /**
     * @param carta the carta to set
     */
    public void setCarta(Tipocartas carta) {
        this.carta = carta;
    }

    /**
     * @return the numero
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    
}
