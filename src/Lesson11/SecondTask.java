package Lesson11;

import java.util.*;

public class SecondTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> wordList = new ArrayList<>();
        do {
            System.out.print("Word:");
            String word = scanner.nextLine();
            wordList.add(word);
        } while (wordList.size() <3);

        String longestWord = wordList
                .stream()
                .max(Comparator.comparingInt(String::length))
                .get();
        System.out.print("\nLongest word is = "
                + longestWord + "\nSequence number:");
        System.out.println(wordList.indexOf(longestWord) + 1);

        String shortestWord = wordList
                .stream()
                .min(Comparator.comparingInt(String::length))
                .get();
        System.out.print("\nShortest String is = "
                + shortestWord + "\nSequence number:");
        System.out.println(wordList.indexOf(shortestWord) + 1);
    }
}


