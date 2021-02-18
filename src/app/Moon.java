package app;

public class Moon extends OrbitalObject {
    private Planet planet;
    private String name;

    public Moon(String name, String mass, Planet planet) {
        super(name, mass);
        this.planet = planet;
    }

    public Planet getPlanet() {
        return planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String orbit() {
        return "Orbit " + planet;
    }
}
