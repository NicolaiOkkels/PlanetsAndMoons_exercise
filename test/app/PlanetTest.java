package app;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {

    Planet earth;

    @BeforeEach
    void startPoint() {
        earth = new Planet("Earth","5,972E24 kg");
        earth.setNumberOfMoons(1);
        earth.setNumberOfRings(0);
        earth.setType("terrestrial");
    }

    @Test
    void test_planetMass() {
        //arrange, act, assert
        String exp = "5,972E24 kg";
        assertEquals(exp, earth.getMass());
    }

    @Test
    void test_planetOrbit() {
        //arrange, act, assert
        String exp = "Orbit the sun";
        assertEquals(exp, earth.orbit());
    }

    @Test
    void test_numberOfMoons(){
        int exp = 1;
        assertEquals(exp,earth.getNumberOfMoons());
    }

    @Test
    void test_numberOfRings(){
        int exp = 0;
        assertEquals(exp,earth.getNumberOfRings());
    }
}