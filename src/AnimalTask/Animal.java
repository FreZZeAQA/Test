package AnimalTask;

public class Animal {
    private String nickname;
    private double speed;
    private int age;

    public Animal(String nickname, double speed, int age) {
        this.nickname = nickname;
        this.speed = speed;
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
