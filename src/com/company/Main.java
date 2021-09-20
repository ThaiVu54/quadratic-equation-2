package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào a = ");
        double a = sc.nextDouble();
        System.out.print("Nhập vào b = ");
        double b = sc.nextDouble();
        System.out.print("Nhập vào c = ");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.getter(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Phương trình đã cho có 2 nghiệm phân biệt x1 = " + quadraticEquation.getRoot1() + ", x2 = " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("phuong trinh co nghiem x = "+ quadraticEquation.getRoot1());
        } else System.out.println("phuong trinh vo nghiem");
    }
}
