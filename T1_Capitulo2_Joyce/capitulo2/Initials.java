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
public class Initials {
   private Character a;
    private Character b;
    private Character c;
    
    public Initials(Character a,Character b,Character c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public String toString(){
       return String.format("%c.%c.%c",this.getA(),this.getB(),this.getC());
    }
    /**
     * @return the a
     */
    public Character getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(Character a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public Character getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(Character b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public Character getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(Character c) {
        this.c = c;
    } 
}
