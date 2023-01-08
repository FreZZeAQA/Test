package Lesson3;

public class Animal {

    public void sound(){
        System.out.println("yyyyyyyyyy!!!!");
    }
    public void sound(String sound){
        System.out.println(sound);
    }

    @Override
    protected Animal clone() throws CloneNotSupportedException {
        return this.clone();
    }
}
