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
public class SammysRentalPrice {
    private Integer Minutos;
    private static Integer HORAS=40;
    private static Integer ADDI=1;
    
    public SammysRentalPrice(Integer minutos){
        this.Minutos=minutos;
    }

    public Integer Trash(){
        return this.getMinutos()/60;
    }
    
    public Integer Trasm(){
        return this.getMinutos()%60;
    }
    
    public String toString(){
        if(this.Trash()<1){
           return String.format("Horas: %d\nMinutos: %d\nTotal: %d",this.Trash(),this.Trasm(),this.Trasm()*ADDI);
        }else{
            if(this.Trash()>=2){
                return String.format("Horas: %d\nMinutos: %d\nTotal: %d",this.Trash(),this.Trasm(),(((this.Trash()-1)*60)*ADDI)+HORAS+this.Trasm()*ADDI);
            }else{
                return String.format("Horas: %d\nMinutos: %d\nTotal: %d",this.Trash(),this.Trasm(),HORAS+this.Trasm()*ADDI);
            }
        }
    }
    /**
     * @return the Minutos
     */
    public Integer getMinutos() {
        return Minutos;
    }

    /**
     * @param Minutos the Minutos to set
     */
    public void setMinutos(Integer Minutos) {
        this.Minutos = Minutos;
    }

    /**
     * @return the HORAS
     */
    public static Integer getHORAS() {
        return HORAS;
    }

    /**
     * @param aHORAS the HORAS to set
     */
    public static void setHORAS(Integer aHORAS) {
        HORAS = aHORAS;
    }

    /**
     * @return the ADDI
     */
    public static Integer getADDI() {
        return ADDI;
    }

    /**
     * @param aADDI the ADDI to set
     */
    public static void setADDI(Integer aADDI) {
        ADDI = aADDI;
    }
    
}
