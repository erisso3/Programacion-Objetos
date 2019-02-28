/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import capitulo2.*;
import capitulo2.CarlysMotto2;
import capitulo2.SammysMotto2;
import capitulo2.SammysRentalPrice;
import capitulo2.CarlysEventPrice;
/**
 *
 * @author eriss
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicio1 e1=new Ejercicio1();
        System.out.println(e1.pa(3,7,2));
        System.out.println(e1.pb(18,3,4));
        System.out.println(e1.pc(9, 3, 12, 4));
        System.out.println(e1.pd(15, 2));
        System.out.println(e1.pe(14, 3));
        System.out.println(e1.pf(29, 10));
        System.out.println(e1.pg(14, 2));
        System.out.println(e1.ph(15, 2));
        System.out.println(e1.pi(31, 7));
        System.out.println(e1.pj(6, 4, 1));
        System.out.println(e1.pk(5, 6, 3));
        System.out.println(e1.pl(25, 3, 2));
        System.out.println(e1.pm(13, 15));
        System.out.println("");
        Ejercicio2 e2=new Ejercicio2();
        System.out.println(e2.isPa(5,8));
        System.out.println(e2.isPb(4,9));
        System.out.println(e2.isPc(3,4));
        System.out.println(e2.isPd(12,12));
        System.out.println(e2.isPe(3,4,8));
        System.out.println(e2.isPf(7,9,2));
        System.out.println(e2.isPg(5,5));
        System.out.println(e2.isPh(15,3,5));
        System.out.println(e2.isPi(9,-9));
        System.out.println(e2.isPj(3,5,2,16));
        System.out.println("\nEjercicio 3");
        Ejercicio3 ej=new Ejercicio3();
        System.out.println(ej.A(6));
        System.out.println(ej.B(3.3));
        System.out.println(ej.C(234567876));
        System.out.println(ej.D(67892));
        System.out.println(ej.E(23));
        System.out.println(ej.F(50));
        System.out.println(ej.G(32));
        System.out.println(ej.H(2003));
        System.out.println(ej.I(4));
        System.out.println("\nEjercicio 4");
        MilesToFeet mf=new MilesToFeet();
        System.out.println(mf.convertir());
        MilesToFeetInteractive mfi=new MilesToFeetInteractive((float)1);
        System.out.println(mfi.convertir());
        System.out.println("\nEjercicio 5");
        ProjectedSales ps=new ProjectedSales();
        System.out.println(ps.Ventas());
        ProjectedSalesInteractive psi=new ProjectedSalesInteractive(30,40);
        System.out.println(psi.Ventas());
        System.out.println("\nEjercicio 6");
        InchesToFeet itf=new InchesToFeet();
        System.out.println(itf.conver());
        InchesToFeetInteractive itfi=new InchesToFeetInteractive(100);
        System.out.println(itfi.conver());
        System.out.println("\nEjercicio 7");
        Initials i=new Initials('J','M','F');
        System.out.println(i.toString());
        System.out.println("\nEjercicio 8");
        Eggs e=new Eggs(27);
        System.out.println(e.toString());
        System.out.println("\nEjercicio 9");
        DogBoarding db=new DogBoarding((float)23,3);
        System.out.println(db.toString());
        System.out.println("\nEjercicio 10");
        Dollars d=new Dollars(10);
        System.out.println(d.toString());
        System.out.println("\nEjercicio 11");
        FahrenheitToCelsius ftc=new FahrenheitToCelsius(63);
        System.out.println(ftc.toString());
        System.out.println("\nEjercicio 12");
        TicketNumber tm=new TicketNumber(147103);
        System.out.println(tm.desicion());
        System.out.println("\nCase problem 1");
        CarlysMotto2 c=new CarlysMotto2();
        System.out.println(c.cuadro());
        CarlysEventPrice cep=new CarlysEventPrice(50);
        System.out.println(cep.toString());
        System.out.println("\nCase problem 2");
        SammysRentalPrice srp=new SammysRentalPrice(47);
        System.out.println(srp.toString());
        SammysMotto2 sm2=new SammysMotto2();
        System.out.println(sm2.cuadro());
    }
    
}
