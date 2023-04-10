package org.FatimaHasT.qamp.zadaci.zadaca5.task2;

public class MainRectangle {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(4.0, 5.0);

        System.out.println("Rectangle with sides " + rect.getA() + " and " + rect.getB());
        System.out.println("Circumference: " + rect.getCircumference());
        System.out.println("Area: " + rect.getArea());
        System.out.println("Is square? " + rect.isSquare());

        rect.setB(4.0);

        System.out.println("Modified rectangle with sides " + rect.getA() + " and " + rect.getB());
        System.out.println("Circumference: " + rect.getCircumference());
        System.out.println("Area: " + rect.getArea());
        System.out.println("Is square? " + rect.isSquare());
    }
}
