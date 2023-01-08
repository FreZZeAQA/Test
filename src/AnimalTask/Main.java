package AnimalTask;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Sam", 12.3, 4);
        System.out.println("Nickname:" + animal.getNickname() + ";" + "Speed:" + animal.getSpeed() + " km / h ;" + "Age:" + animal.getAge() + " years ;");
        animal.setNickname("Semen");
        animal.setSpeed(13.5);
        animal.setAge(5);
        System.out.println("Nickname:" + animal.getNickname() + ";" + "Speed:" + animal.getSpeed() + " km / h ;" + "Age:" + animal.getAge() + " years ;");
    }
}
