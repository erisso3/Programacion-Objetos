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
public class TwoCharacters {
    private MyCharacter carac;
    
    public TwoCharacters(){
    }
    public void add(String x,Integer y,Integer z){
        MyCharacter n1=new MyCharacter(x, y, z);
        carac=n1;
    }
    public void imprimir(){
        MyCharacter aux=carac;
        System.out.println("Color:"+aux.getColor()+"\nOjos:"+aux.getVidas()+"\nVidas:"+aux.getVidas());
    }
}
