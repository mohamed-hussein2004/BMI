package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int inches;
        int pounds;
        double inchesToMeaters = 0.0254, poundsToKg = 0.453592,meters,kg,BMI;


        Scanner person;
        person = new Scanner(System.in);




        System.out.println("what is your height in inches?");
        inches = person.nextInt();
        System.out.println("what is your weight in pounds?");
        pounds = person.nextInt();
        kg =pounds*.453592;
        meters =inches*.0254;
        System.out.print("");








}
}
