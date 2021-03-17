package main.java.java_2.oop.rainforest;

public class SquirrelMonkey extends RainforestCreature {

    private String fur;

    public SquirrelMonkey(String height, String name , String fur) {
        super(height, name);
        this.fur = fur;
    }

    public String getFur() {
        return fur;
    }

    public void climb() {
        System.out.println(getName() + " is currently climbing up a tree!");
    }

    @Override
    public String toString() {
        return "SquirrelMonkey{" +
                "height='" + height + '\'' +
                ", name='" + getName() + '\'' +
                ", fur='" + fur + '\'' +
                '}';
    }
}