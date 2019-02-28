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
public class BankAccount {
    private Integer id;
    private String nombre;
    private Integer saldo;
    
    public BankAccount(){
        this.id=333;
        this.nombre="Erck Echeverria Celaya";
        this.saldo=133;
    }

     public Integer BankAccount(){
        return this.getSaldo()-4;
    }
    
    public static String ExplayAccountPolicy(){
        return "La tarifa de si servicio se reducira $4 al mes";
    }
    
    public String toString(){
        return String.format("ID:%d\nNombre:%s\nSaldo:%d\n%s\nSaldo:%d",this.getId(),this.getNombre(),this.getSaldo(),ExplayAccountPolicy(),this.BankAccount());
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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the saldo
     */
    public Integer getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }
    

   }
