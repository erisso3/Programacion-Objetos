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
public class Painting {
    private String Titulo;
    private String Nombre;
    private String medio;
    private Integer Precio;
    private double CoAr;
    
    public Painting(){
        this.Titulo="El chile";
        this.Nombre="Vincent van Gogh";
        this.medio="Azul";
        this.Precio=33000;
        this.CoAr=0.20;
    }

    public double Comision(){
        return this.getPrecio()*this.getCoAr();
    }
    
    public String toString(){
        return String.format("Titulo:%s\nArtista:%s\nPrecios:%d\nComision de Galeria:%.2f",this.getTitulo(),this.getNombre(),this.getPrecio(),this.Comision());
    }
    /**
     * @return the Titulo
     */
    public String getTitulo() {
        return Titulo;
    }

    /**
     * @param Titulo the Titulo to set
     */
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the medio
     */
    public String getMedio() {
        return medio;
    }

    /**
     * @param medio the medio to set
     */
    public void setMedio(String medio) {
        this.medio = medio;
    }

    /**
     * @return the Precio
     */
    public Integer getPrecio() {
        return Precio;
    }

    /**
     * @param Precio the Precio to set
     */
    public void setPrecio(Integer Precio) {
        this.Precio = Precio;
    }

    /**
     * @return the CoAr
     */
    public double getCoAr() {
        return CoAr;
    }

    /**
     * @param CoAr the CoAr to set
     */
    public void setCoAr(double CoAr) {
        this.CoAr = CoAr;
    }
    
    
}


