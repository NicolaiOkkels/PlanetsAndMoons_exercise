package app;

public class Planet extends OrbitalObject{

    private String name;
    private String type;
    private int numberOfMoons;
    private int numberOfRings;

    public Planet(String name, String mass, String type, int numberOfMoons, int numberOfRings) {
        super(name, mass);
        this.type = type;
        this.numberOfMoons = numberOfMoons;
        this.numberOfRings = numberOfRings;
    }

    public Planet(String name, String mass) {
        super(name, mass);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfMoons() {
        return numberOfMoons;
    }

    public void setNumberOfMoons(int numberOfMoons) {
        this.numberOfMoons = numberOfMoons;
    }

    public int getNumberOfRings() {
        return numberOfRings;
    }

    public void setNumberOfRings(int numberOfRings) {
        this.numberOfRings = numberOfRings;
    }

    @Override
    public String orbit() {
        return "Orbit the sun";
    }
}
