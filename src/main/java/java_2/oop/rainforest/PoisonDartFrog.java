package java_2.oop.rainforest;

public class PoisonDartFrog extends RainforestCreature {

    private boolean isPoisonous;

    public PoisonDartFrog(String height, String name , boolean isPoisonous) {
        super(height, name);
        this.isPoisonous = isPoisonous;
    }

    public boolean getIsPoisonous() {
        return isPoisonous;
    }

    public void secretePoison() {
        System.out.println(getName() + " is currently secreting poison!");
    }

    @Override
    public String toString() {
        return "PoisonDartFrog{" +
                "height='" + height + '\'' +
                ", name='" + getName() + '\'' +
                ", isPoisonous='" + isPoisonous + '\'' +
                '}';
    }
}