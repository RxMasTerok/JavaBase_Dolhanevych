package com.hillel.dolhanevych.homeworks.homework4;

public class Main {
    public static void main(String[] args) {

        int a = 3;
        int b = 6;
        int h = 9;

        int volume = a * b * h;

        System.out.println("Volume of the parallelepiped: " +volume);

        int length = (a + b + h) * 4;

        System.out.println("Total length: " + length);
    }
}
