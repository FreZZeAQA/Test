package Lesson11;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> wordList = new ArrayList<>();

        do {
            System.out.print("Word:");
            String word = scanner.nextLine().toUpperCase(Locale.ROOT);
            wordList.add(word);
        } while (wordList.size() < 3 );

        for (String word :wordList) {
            if (word.startsWith("A")&&word.length()%2==0){
                System.out.println("Word starts With(A) and contains pair length:"+word);

            }


        }
    }


}
