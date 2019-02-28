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
public class PaintCalculator {
    private static Integer PRICE=32;
    private static Integer COVER=350;
    private Integer l;
    private Integer a;
    private Integer al;
    public Integer calculadoraArea(){
        return (getL()*getAl())*2+(getA()*getAl())*2;
    }
    
    public Integer numgal(){
        return calculadoraArea()/getCOVER();
    }
    public Integer costo(){
        return numgal()*getPRICE();
    }
    @Override
    public String toString(){
        return String.format("El costo de pintar una sala de %d x %d x %d es de $%d",this.l,this.a,this.al,this.costo());
    }
    
    public PaintCalculator(Integer l,Integer al,Integer a){
        this.a=a;
        this.al=al;
        this.l=l;
               
    }

    /**
     * @return the PRICE
     */
    public static Integer getPRICE() {
        return PRICE;
    }

    /**
     * @param aPRICE the PRICE to set
     */
    public static void setPRICE(Integer aPRICE) {
        PRICE = aPRICE;
    }

    /**
     * @return the COVER
     */
    public static Integer getCOVER() {
        return COVER;
    }

    /**
     * @param aCOVER the COVER to set
     */
    public static void setCOVER(Integer aCOVER) {
        COVER = aCOVER;
    }

    /**
     * @return the l
     */
    public Integer getL() {
        return l;
    }

    /**
     * @param l the l to set
     */
    public void setL(Integer l) {
        this.l = l;
    }

    /**
     * @return the a
     */
    public Integer getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(Integer a) {
        this.a = a;
    }

    /**
     * @return the al
     */
    public Integer getAl() {
        return al;
    }

    /**
     * @param al the al to set
     */
    public void setAl(Integer al) {
        this.al = al;
    }
    
}
