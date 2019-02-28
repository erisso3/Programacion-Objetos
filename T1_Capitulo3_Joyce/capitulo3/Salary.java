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
public class Salary {
    private Integer sh;
    private Integer h;
    private Integer he;
    
    public Salary(Integer x,Integer y,Integer z){
        this.sh=x;
        this.h=y;
        this.he=z;
    }

    public Integer SalarioS(){
        return ((this.getSh()*this.getH())*5);
    }
    
    public double HorasE(){
        return (this.getHe()*(this.getSh()*1.5))*5;
    }
    
    public String toString(){
        return String.format("Horas: %d\nHoras extra: %d\nSalario semanal: %.2f",this.getH(),this.getHe(),this.SalarioS()+this.HorasE());
    }
    /**
     * @return the sh
     */
    public Integer getSh() {
        return sh;
    }

    /**
     * @param sh the sh to set
     */
    public void setSh(Integer sh) {
        this.sh = sh;
    }

    /**
     * @return the h
     */
    public Integer getH() {
        return h;
    }

    /**
     * @param h the h to set
     */
    public void setH(Integer h) {
        this.h = h;
    }

    /**
     * @return the he
     */
    public Integer getHe() {
        return he;
    }

    /**
     * @param he the he to set
     */
    public void setHe(Integer he) {
        this.he = he;
    }
    
}
