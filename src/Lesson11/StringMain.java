package Lesson11;

import java.util.Locale;

public class StringMain {
    public static void main(String[] args) {
        String str = "A like Java !!!";
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("Java"));
        str.toUpperCase(Locale.ROOT);
        str.toLowerCase(Locale.ROOT);
        str.substring(1,8);
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replace("a", "o"));



    }



    }

