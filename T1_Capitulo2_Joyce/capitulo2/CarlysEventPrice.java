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
public class CarlysEventPrice {
    private Integer ni;
    private static Integer PER=35;
    
    public CarlysEventPrice(Integer ni){
        this.ni=ni;
    }

    public Integer total(){
        return this.ni*PER;
    }
    
    public String toString(){
        return String.format("Numero de invitados: %d\n Precio por invitado: $%d\n Total: $%d\n Es un evento grande %b ",this.getNi(),PER,this.total(),this.isNum());
    }
    
    public boolean isNum(){
        return this.getNi()>=50;
    }
    /**
     * @return the ni
     */
    public Integer getNi() {
        return ni;
    }

    /**
     * @param ni the ni to set
     */
    public void setNi(Integer ni) {
        this.ni = ni;
    }

    /**
     * @return the PER
     */
    public static Integer getPER() {
        return PER;
    }

    /**
     * @param aPER the PER to set
     */
    public static void setPER(Integer aPER) {
        PER = aPER;
    }

}
