package org.example;

public class SwitchCase {

    public static void main(String[] args) {

        int month = 13;

        switch(month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            //lagay niyo nalang yung ibang month
            default:
                System.out.println("Wrong Month");

        }
    }
}
