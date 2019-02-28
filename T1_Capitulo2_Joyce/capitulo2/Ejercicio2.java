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
public class Ejercicio2 {
    public String isPa(Integer a,Integer b){
        if(a>b){
            return String.format("Ejercicio 2 a): %b",false);
            
        }else{
            return String.format("Ejercicio 2 a): %b",true);
        }
    }
    public String isPb(Integer a,Integer b){
        if(a<=b){
            return String.format("Ejercicio 2 b): %b",true);
        }else{
            return String.format("Ejercicio 2 b): %b",false);
        }
    }
    
    public String isPc(Integer a,Integer b){
        if(a==b){
            return String.format("Ejercicio 2 c): %b",true);
        }else{
            return String.format("Ejercicio 2 c): %b",false);
        }
    }
    public String isPd(Integer a,Integer b){
        if(a>=b){
            return String.format("Ejercicio 2 d): %b",true);
        }else{
            return String.format("Ejercicio 2 d): %b",false);
        }
    }
    public String isPe(Integer a,Integer b,Integer c){
        if((a+b)==c){
            return String.format("Ejercicio 2 e): %b",true);
        }else{
            return String.format("Ejercicio 2 e): %b",false);
        }
    }
    public String isPf(Integer a,Integer b,Integer c){
        if(a<(b-c)){
            return String.format("Ejercicio 2 f): %b",true);
        }else{
            return String.format("Ejercicio 2 f): %b",false);
        }
    }
    public String isPg(Integer a,Integer b){
        if(a!=b){
            return String.format("Ejercicio 2 g): %b",true);
        }else{
            return String.format("Ejercicio 2 g): %b",false);
        }
    }
    public String isPh(Integer a,Integer b,Integer c){
        if(a!=(b*c)){
            return String.format("Ejercicio 2 h): %b",true);
        }else{
            return String.format("Ejercicio 2 h): %b",false);
        }
    }
    public String isPi(Integer a,Integer b){
        if(a!=b){
            return String.format("Ejercicio 2 i): %b",true);
        }else{
            return String.format("Ejercicio 2 i): %b",false);
        }
    }
    public String isPj(Integer a,Integer b,Integer c,Integer d){
        if((a+b*c)==d){
            return String.format("Ejercicio 2 j): %b",true);
        }else{
            return String.format("Ejercicio 2 j): %b",false);
        }
    }
}
