package com.company;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    Scanner input = new Scanner(System.in);

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void getter(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        double delta;
        return delta = (this.b * this.b) - (4 * this.a * this.c);
    }

    public double getRoot1() {
        double x = getDiscriminant();
        double r1;
        return r1 = ((this.b * -1) + Math.pow(x, 0.5))/(2 * this.a);
    }

    public double getRoot2() {
        double x = getDiscriminant();
        double r2;
        return r2 = ((this.b * -1) - Math.pow(x, 0.5))/(2 * this.a);
    }
}
