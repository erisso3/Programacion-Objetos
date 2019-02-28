/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo11;

import Ejercicios.Actor;
import Ejercicios.Chevy;
import Ejercicios.Child;
import Ejercicios.Ford;
import Ejercicios.Health;
import Ejercicios.House;
import Ejercicios.IncomingPhoneCall;
import Ejercicios.Leaf;
import Ejercicios.Life;
import Ejercicios.Musician;
import Ejercicios.OutgoingPhoneCall;
import Ejercicios.Page;
import Ejercicios.Pancake;
import Ejercicios.PhoneCallArray;
import Ejercicios.School;
import Ejercicios.SevenDaySubscriber;
import Ejercicios.WeekdaySubscriber;
import Ejercicios.WeekendSubscribers;

/**
 *
 * @author eriss
 */
public class Capitulo11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // TODO code application logic here
        System.out.println("Ejercicio 2\n");
        System.out.println("A)");
    IncomingPhoneCall ic=new IncomingPhoneCall("342325453554");
    System.out.println(ic);
        OutgoingPhoneCall op=new OutgoingPhoneCall("9787348934",10);
        System.out.println(op);
        PhoneCallArray array = new PhoneCallArray();
        System.out.println("B)");
        array.add(op);
        array.add(ic);
        array.imprimir();
        System.out.println("Ejercicio 3\n");
        Ford f= new Ford("Ford",333);
        System.out.println(f.toString());
        Chevy c=new Chevy("Cheby",312312);
        System.out.println(c.toString());
        System.out.println("Ejercicio 6");
        SevenDaySubscriber ss=new SevenDaySubscriber("Vicente");
        System.out.println(ss);
        WeekdaySubscriber ws=new WeekdaySubscriber("Nicolas");
        System.out.println(ws);
        WeekendSubscribers wes=new WeekendSubscribers("Porfirio");
        System.out.println(wes);
        System.out.println("Ejercicio 8");
        Leaf l=new Leaf();
        l.turn();
        Page p=new Page();
        p.turn();
        Pancake pk=new Pancake();
        pk.turn();
        System.out.println("Ejercicio 9");
        Health h=new Health("VIda");
        Life li=new Life("Salud");
        System.out.println(h);
        System.out.println("Ejercicio 12");
        Child ch=new Child();
        ch.play();
        Musician m=new Musician();
        m.play();;
        Actor a=new Actor();
        a.play();
        System.out.println("Ejercicio 14");
        House ho=new House(34,"Antigua",45,343);
        System.out.println(ho);
        School sc=new School(23,"Fecha debajo de un cementerio",34,"Universidad");
        System.out.println(sc);
        
    }
    
}
