  
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Hickey
 */

package oop.example;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        int age, wantRetireAge, yearsLeft, curYear = 2021, retireYear;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your current age? ");
        age = scanner.nextInt();

        System.out.println("At what age would you like to retire? ");
        wantRetireAge = scanner.nextInt();

        yearsLeft = wantRetireAge - age;
        System.out.println("You have " + yearsLeft + " years left until you can retire.");

        retireYear = curYear + yearsLeft;
        System.out.println("It's " + curYear + ", so you can retire in " + retireYear + ".");
    }
}