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
public class Student {
    private Integer id;
    private Integer ha;
    private Integer puntos;
     
    public Student(Integer x,Integer y,Integer z){
        this.id=x;
        this.ha=y;
        this.puntos=z;
    }

    public Integer Promedio(){
       return this.getPuntos()/this.getHa();
    }
    
    public String toString(){
        return String.format("Horas:%d\nPuntos:%d\nEl promedio es :%d",this.getHa(),this.getPuntos(),this.Promedio());
    }
    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the ha
     */
    public Integer getHa() {
        return ha;
    }

    /**
     * @param ha the ha to set
     */
    public void setHa(Integer ha) {
        this.ha = ha;
    }

    /**
     * @return the puntos
     */
    public Integer getPuntos() {
        return puntos;
    }

    /**
     * @param puntos the puntos to set
     */
    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }
    
}
