package org.FatimaHasT.qamp.zadaci.zadaca5.task3;

public class Complex {
    private int real;
    private int imaginary;

    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int Re() {
        return this.real;
    }

    public int Im() {
        return this.imaginary;
    }

    public Complex add(Complex z1) {
        int realSum = this.real + z1.real;
        int imagSum = this.imaginary + z1.imaginary;
        return new Complex(realSum, imagSum);
    }

    public Complex subtract(Complex z1) {
        int realDiff = this.real - z1.real;
        int imagDiff = this.imaginary - z1.imaginary;
        return new Complex(realDiff, imagDiff);
    }

    public void printComplex() {
        if (this.real != 0 && this.imaginary != 0) {
            System.out.println(this.real + " + " + this.imaginary + "i");
        } else if (this.real != 0 && this.imaginary == 0) {
            System.out.println(this.real);
        } else if (this.real == 0 && this.imaginary != 0) {
            System.out.println(this.imaginary + "i");
        } else {
            System.out.println("0");
        }
    }
}
