import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfLegsTest {

    @Test
    void twoSholdShowHuman() {
        var numberLeg = new NumberOfLegs();
        assertEquals("Human", numberLeg.determCreature(2));
    }
    @Test
    void eightSholdShowOctopus() {
        var numberLeg = new NumberOfLegs();
        assertEquals("Octopus", numberLeg.determCreature(8));
    }
    @Test
    void ElevenSholdShowUknnown() {
        var numberLeg = new NumberOfLegs();
        assertTrue(numberLeg.determCreature(11)=="Uknown animal");
    }
    @Test
    void NegativeSholdShowIlligalArgument() {
        var numberLeg = new NumberOfLegs();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    numberLeg.determCreature(-1);
                });
    }
}