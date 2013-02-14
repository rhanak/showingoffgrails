package com.simongo.math;

public class Imaginary {

    private int real;

    private int imaginary;

    public Imaginary(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }


    public int getReal() {
        return this.real;
    }


    public int getImaginary() {
        return this.imaginary;
    }


    @Override
    public String toString() {
        return Integer.toString(real) + " + " + Integer.toString(imaginary) + "i";
    }

}