package org.FatimaHasT.qamp.zadaci.zadaca5.task3;

public class MainComplex {
    public static void main(String[] args) {
        Complex z = new Complex(2, -3);
        System.out.println(z.Re());
        System.out.println(z.Im());

        Complex z1 = new Complex(2, 1);
        Complex z2 = z.add(z1);
        z2.printComplex();

        Complex z3 = z.subtract(z1);
        z3.printComplex(); 
    }
}
