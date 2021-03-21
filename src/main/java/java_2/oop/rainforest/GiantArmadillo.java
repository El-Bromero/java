package java_2.oop.rainforest;

public class GiantArmadillo extends RainforestCreature {

    private String skin;

    public GiantArmadillo(String height, String name , String skin) {
        super(height, name);
        this.skin = skin;
    }

    public String getSkin() {
        return skin;
    }

    public void dig() {
        System.out.println(getName() + " is currently digging!");
    }

    @Override
    public String toString() {
        return "GiantArmadillo{" +
                "height='" + height + '\'' +
                ", name='" + getName() + '\'' +
                ", skin='" + skin + '\'' +
                '}';
    }
}