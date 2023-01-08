package Lesson7;

public class MainColor {
    public static void main(String[] args) {
        for (Color color:Color.values()) {
            color.removeLetter();
            color.showName();
        }
    }
}
