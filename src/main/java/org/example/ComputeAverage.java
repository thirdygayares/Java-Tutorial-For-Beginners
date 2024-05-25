package org.example;

public class ComputeAverage {


    public static void main(String[] args) {

        float math = 90;
        float english = 85;
        float mapeh = 90;
        float science = 99;
        float pe = 75;

        // initiate sum
        float sum = mapeh + english + math + science + pe;
        float average = sum/5;

        System.out.println("Average: " + average);
    }


}
