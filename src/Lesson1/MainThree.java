package Lesson1;

public class MainThree {
    public static void main(String[] args) {
        int[][] arr = new int[7][5];
        int min = -10;
        int max = 75;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = min + (int) (Math.random() * ((max - min) + 1));
                System.out.print(arr[i][j] + "\t");
            }

            System.out.print("\n");
        }
    }
}
