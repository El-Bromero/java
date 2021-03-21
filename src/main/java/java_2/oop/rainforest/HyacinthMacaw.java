package java_2.oop.rainforest;

public class HyacinthMacaw extends RainforestCreature {

    private String beak;

    public HyacinthMacaw(String height, String name , String beak) {
        super(height, name);
        this.beak = beak;
    }

    public String getBeak() {
        return beak;
    }

    public void fly() {
        System.out.println(getName() + " is currently flying!");
    }

    @Override
    public String toString() {
        return "HyacinthMacaw{" +
                "height='" + height + '\'' +
                ", name='" + getName() + '\'' +
                ", beak='" + beak + '\'' +
                '}';
    }
}