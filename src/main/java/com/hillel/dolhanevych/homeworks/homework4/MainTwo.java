package com.hillel.dolhanevych.homeworks.homework4;

public class MainTwo {
    public static void main(String[] args) {


        int dynastyLeeWarriorAttack = 13;
        int dynastyLeeArcherAttack = 24;
        int dynastyLeeHorseManAttack = 46;
        int countLee = 860;


        int dynastyMinWarriorAttack = 9;
        int dynastyMinArcherAttack = 35;
        int dynastyMinHorseManAttack = 12;
        int countMin = (int) (860 * 1.5);


        int allDynLeeAttack = (dynastyLeeWarriorAttack + dynastyLeeArcherAttack + dynastyLeeHorseManAttack) * countLee;
        int allDynMinAttack = (int) ((dynastyMinWarriorAttack + dynastyMinArcherAttack + dynastyMinHorseManAttack) * countMin);

        System.out.println("Total Attack dynasty Lee: " +allDynLeeAttack);
        System.out.println("Total Attack dynasty Min: " +allDynMinAttack);

    }
}
