package app;

public abstract class OrbitalObject {
    //common attributes between planets and moons: orbit, mass
    private String mass; // in kg
    private String name;

    public OrbitalObject(String name, String mass) {
        this.name = name;
        this.mass = mass;
    }

    public abstract String orbit();

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
