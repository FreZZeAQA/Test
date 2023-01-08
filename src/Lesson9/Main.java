package Lesson9;

public class Main {
    public static void main(String[] args) throws IncorrectEmailException {
        Human human = new Human("Ihor",6,"SGSGDFSDFD");
        try {
            human.isCorrectMailFormat();
        }catch (IncorrectEmailException e){
            e.printStackTrace();
        }
        try {
            human.isAdult();
        }catch (UnderAgeException e){
            e.printStackTrace();
        }
    }
}