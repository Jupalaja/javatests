package org.example.javatests.util;

public class StringUtil {

    private static String str;

    public static String repeat(String str, int times){

            if(times < 0){
                throw new IllegalArgumentException("Negative numbers not allowed");
            }
            String result = "";
            for (int i = 0; i < times; i++) result += str;
            return result;
        }

    public static boolean isEmpty(String str) {

        return str == null || str.trim().isEmpty();
    }
}

