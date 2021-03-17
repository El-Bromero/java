package main.java.java_2.oop.coffee;
//https://www.homegrounds.co/best-coffee-beans-bucket-list/

class CoffeeBeans {
/*	Properties :
	beanName
	origin
	flavor
	brewed? - boolean flag indicating whether or not the beans have been brewed or not.
	roasted? - boolean flag indicating whether or not the beans have been roasted or not.  

	Methods :
	roast()

 */
    private String beanName;
    private String origin;
    private String flavor;
    private boolean brewed = false;
    private boolean roasted = false;

    public CoffeeBeans(String beanName, String origin, String flavor) {
        this.beanName = beanName;
        this.origin = origin;
        this.flavor = flavor;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public boolean isBrewed() {
        return brewed;
    }

    public void setBrewed(boolean brewed) {
        this.brewed = brewed;
    }

    public boolean isRoasted() {
        return roasted;
    }

    public void setRoasted(boolean roasted) {
        this.roasted = roasted;
    }

    @Override
    public String toString() {
        return "CoffeeBeans{" +
                "beanName='" + beanName + '\'' +
                ", origin='" + origin + '\'' +
                ", flavor='" + flavor + '\'' +
                ", brewed=" + brewed +
                ", roasted=" + roasted +
                '}';
    }
}
