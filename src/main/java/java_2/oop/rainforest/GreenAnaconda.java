package main.java.java_2.oop.rainforest;

public class GreenAnaconda extends RainforestCreature {

    private String movement;

    public GreenAnaconda(String height, String name , String movement) {
        super(height, name);
        this.movement = movement;
    }

    public String getMovement() {
        return movement;
    }

    public void suffocate() {
        System.out.println(getName() + " is currently suffocating its prey!");
    }

    @Override
    public String toString() {
        return "GreenAnaconda{" +
                "height='" + height + '\'' +
                ", name='" + getName() + '\'' +
                ", movement='" + movement + '\'' +
                '}';
    }
}