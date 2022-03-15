package org.example.javatests.reto2;

import java.util.*;

public class Convert {
    public String toRoman(int integer) {
        HashMap<Integer, String> romanNumbers = new LinkedHashMap();

        romanNumbers.put(1000,"M");
        romanNumbers.put(900,"CM");
        romanNumbers.put(500,"D");
        romanNumbers.put(400,"CD");
        romanNumbers.put(100,"C");
        romanNumbers.put(90,"XC");
        romanNumbers.put(50,"L");
        romanNumbers.put(40,"XL");
        romanNumbers.put(10,"X");
        romanNumbers.put(9,"IX");
        romanNumbers.put(5,"V");
        romanNumbers.put(4,"IV");
        romanNumbers.put(1,"I");

        int number = integer;
        String roman = "";

        for (Map.Entry<Integer,String> entry : romanNumbers.entrySet()) {
            String romanNumber = entry.getValue();
            Integer arabic =  entry.getKey();

                while (number >= arabic) {
                    roman += romanNumber;
                    number = number - arabic;
                }
        }
        return roman;
    }
}
