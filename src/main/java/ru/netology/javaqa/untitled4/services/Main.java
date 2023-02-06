package ru.netology.javaqa.untitled4.services;

public class Main {
    public static void main(String[] args) {
        SqrtService service  = new SqrtService();
        System.out.println( service.calcSqrt(-1000000, 200));
        SqrtService servcice = new SqrtService();
        servcice.calcSqrt(120, 200);

    }
}