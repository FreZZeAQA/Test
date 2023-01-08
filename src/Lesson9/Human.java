package Lesson9;

public class Human {
    private String name;
    private int age;
    private String email;


    public Human(String name, int age, String email)throws IncorrectEmailException {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
    public boolean isAdult() throws UnderAgeException {
        if (this.age >= 18){
            return true;
        }else {
            throw new UnderAgeException();
        }
    }
    public  boolean isCorrectMailFormat() throws IncorrectEmailException {
        if (email.contains("@")) {
            return true;
        } else {
            throw new IncorrectEmailException();
        }
    }

}
