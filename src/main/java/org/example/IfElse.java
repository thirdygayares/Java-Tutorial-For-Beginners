package org.example;

public class IfElse {

    public static void main(String[] args) {
        //if else condition

        boolean isOnline = false;

        if(isOnline){
            System.out.println("The user is online");
        }else{
            System.out.println("The user is not online");
        }

        int pin = 2424;
        int userInput = 2424;

        if(pin == userInput){
            System.out.println("The Pin is correct");
        }else{
            System.out.println("The Pin is incorrect");
        }


        //check if passed or not
        float math = 100;
        float english = 101;
        float mapeh = 102;
        float science = 102;
        float pe = 104;

        // initiate sum
        float sum = mapeh + english + math + science + pe;
        float average = sum/5;

        System.out.println("Average: " + average);

        //check if the student ay pasado or not
        if(average > 100){
            System.out.println("madaya");
        }
        else if (average >= 90) {
            System.out.println("Pasado with honor");
        }
        else if(average >= 75){
            System.out.println("Pasado");
        } else{
            System.out.println("Bagsak");
        }



    }

}
