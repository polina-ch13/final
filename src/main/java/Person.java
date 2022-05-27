public class Person {
    private double mass;

    public Person() {
    }

    public Person(double mass) {
        this.mass = mass;
    }

    public boolean setMass(double mass) {
        this.mass = mass;
        return true;
    }

    public double getMass() {
        return mass;
    }
}
