package app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoonTest {

    Moon moon;
    Planet earth;

    @BeforeEach
    void startPoint() {
        earth = new Planet("Earth","5,972E24 kg");
        moon = new Moon("Moon","7.34767309 × 10^22 kg", earth);
        moon.setMass("7.34767309 × 10^22 kg");
    }

    @Test
    void test_moonOrbitEarth() {
        String exp = "Orbit Earth";
        assertEquals(exp, moon.orbit());
    }

    @Test
    void test_moonMass(){
        String exp = "7.34767309 × 10^22 kg";
        assertEquals(exp, moon.getMass());
    }

    @Test
    void test_moonName(){
        String exp = "Moon";
        assertEquals(exp, moon.getName());
    }
}