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
public class ProjectedSalesInteractive {
  private static float CONS=(float)0.10;
    private Integer Norte;
    private Integer Sur;
    
    public ProjectedSalesInteractive(Integer norte,Integer sur){
        this.Norte=norte;
        this.Sur=sur;
    }

    public String Ventas(){
        return String.format("Las ventas el Norte son de %.2f mientras que las del sur son %.2f",this.getNorte()+(this.getNorte()*CONS),this.getSur()+(this.getSur()*CONS));
    }
    /**
     * @return the CONS
     */
    public static float getCONS() {
        return CONS;
    }

    /**
     * @param aCONS the CONS to set
     */
    public static void setCONS(float aCONS) {
        CONS = aCONS;
    }

    /**
     * @return the Norte
     */
    public Integer getNorte() {
        return Norte;
    }

    /**
     * @param Norte the Norte to set
     */
    public void setNorte(Integer Norte) {
        this.Norte = Norte;
    }

    /**
     * @return the Sur
     */
    public Integer getSur() {
        return Sur;
    }

    /**
     * @param Sur the Sur to set
     */
    public void setSur(Integer Sur) {
        this.Sur = Sur;
    }
      
}
