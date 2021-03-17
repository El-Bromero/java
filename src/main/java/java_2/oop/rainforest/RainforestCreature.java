package java_2.oop.rainforest;

public class RainforestCreature extends Creature {
	//your code here
    private String name;

    public RainforestCreature(String height, String name) {
        super(height);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating!");
    }
}
