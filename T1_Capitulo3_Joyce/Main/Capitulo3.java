/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import capitulo3.ArithmeticMethods;
import capitulo3.ArithmeticMethods2;
import capitulo3.BankAccount;
import capitulo3.Ejercicio1;
import capitulo3.GasPrices;
import capitulo3.Insurance;
import capitulo3.Interest;
import capitulo3.MetricConversion;
import capitulo3.PaintCalculator;
import capitulo3.Painting;
import capitulo3.Percentages;
import capitulo3.Percentages2;
import capitulo3.Salary;
import capitulo3.Sandwich;
import capitulo3.Student;
import capitulo3.Card;
import capitulo3.TwoCharacters;

/**
 *
 * @author eriss
 */
public class Capitulo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ejercicio 1\n");
        Ejercicio1 ejer=new Ejercicio1();
        System.out.println(ejer.calcula(4,2.2));
        System.out.println("Ejercicio 3");
        System.out.println("A)");
        ArithmeticMethods am=new ArithmeticMethods();
        System.out.println(am.displayNumberPlus10());
        System.out.println(am.displayNumberPlus100());
        System.out.println(am.displayNumberPlus1000());
        System.out.println("B)");
        ArithmeticMethods2 am2=new ArithmeticMethods2(1,2);
        System.out.println(am2.displayNumberPlus10());
        System.out.println(am2.displayNumberPlus100());
        System.out.println(am2.displayNumberPlus1000());
        System.out.println("\nEjercicio 4");
        System.out.println("A)");
        Percentages p=new Percentages();
        System.out.println(p.computePercent());
        System.out.println("A)");
        Percentages2 p2=new Percentages2(21, 33);
        System.out.println(p2.computePercent());
        System.out.println("\nEjercicio 5");
        GasPrices gp=new GasPrices(120);
        System.out.println(gp.Gasolina());
        System.out.println("\nEjercicio 6");
        MetricConversion mc=new MetricConversion(33);
        System.out.println(mc.Cen_pie());
        System.out.println("\nEjercicio 7");
        PaintCalculator pc=new PaintCalculator(15,10,20);
        System.out.println(pc.toString());
        System.out.println("\nEjercicio 8");
        Insurance i=new Insurance(2019,1985);
        System.out.println(i.toString());
        System.out.println("\nEjercicio 9");
        Salary s=new Salary(2,8,8);
        System.out.println(s.toString());
        System.out.println("\nEjercicio 10");
        Interest in=new Interest(100);
        System.out.println(in.toString());
        System.out.println("\nEjercicio 11");
        Sandwich sa=new Sandwich("cecina","blanco");
        System.out.println(sa.toString());
        System.out.println("\nEjercicio 12");
        Student st=new Student(3,3,12);
        System.out.println(st.toString());
        System.out.println("\nEjercicio 13");
        BankAccount ba=new BankAccount();
        System.out.println(ba.toString());
        System.out.println("\nEjercicio 14");
        Painting pg=new Painting();
        System.out.println(pg.toString());
        System.out.println("\nGameZone");
        System.out.println("Ejercicio 1");
        Card c=new Card();
        System.out.println(c.toString());
        System.out.println("\nEjercicio 2");
        TwoCharacters tc=new TwoCharacters();
        tc.add("rojo",100,3);
        tc.imprimir();
        System.out.println("");
        TwoCharacters tc1=new TwoCharacters();
        tc1.add("negro",2,1);
        tc1.imprimir();
    }
    
}
