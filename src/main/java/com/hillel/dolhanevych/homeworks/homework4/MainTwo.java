package com.hillel.dolhanevych.homeworks.homework4;

public class MainTwo {
    public static void main(String[] args) {


        int dynastyLeeWarriorAttack = 13;
        int dynastyLeeArcherAttack = 24;
        int dynastyLeeHorseManAttack = 46;


        int dynastyMinWarriorAttack = 9;
        int dynastyMinArcherAttack = 35;
        int dynastyMinHorseManAttack = 12;


        int allDynLeeAttack = (dynastyLeeWarriorAttack + dynastyLeeArcherAttack + dynastyLeeHorseManAttack) * 860;
        int allDynMinAttack = (int) ((dynastyMinWarriorAttack + dynastyMinArcherAttack + dynastyMinHorseManAttack) * (860 * 1.5));

        System.out.println("Total Attack dynasty Lee: " +allDynLeeAttack);
        System.out.println("Total Attack dynasty Min: " +allDynMinAttack);

    }
}
