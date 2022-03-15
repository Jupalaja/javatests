package org.example.javatests.reto2;

public class Buzzer {
    public String fizzBuzz(int integer) {

        String s = "";
        if (integer % 3 != 0 && integer % 5 != 0){
            s = Integer.toString(integer);
        }
        if (integer % 3 == 0) {
            s +=  "Fizz";
        }if (integer % 5 == 0){
            s +=  "Buzz";
        }
        return s;
    }
}
