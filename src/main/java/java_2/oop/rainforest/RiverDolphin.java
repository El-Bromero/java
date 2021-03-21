package java_2.oop.rainforest;

public class RiverDolphin extends RainforestCreature {

    private String bodyColor;

    public RiverDolphin(String height, String name , String bodyColor) {
        super(height, name);
        this.bodyColor = bodyColor;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void swim() {
        System.out.println(getName() + " is currently swimming!");
    }

    @Override
    public String toString() {
        return "RiverDolphin{" +
                "height='" + height + '\'' +
                ", name='" + getName() + '\'' +
                ", bodyColor='" + bodyColor + '\'' +
                '}';
    }
}
