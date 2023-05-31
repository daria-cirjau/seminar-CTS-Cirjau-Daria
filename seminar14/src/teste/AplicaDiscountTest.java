package teste;

import clase.PachetTuristic;
import dubluri.PersoanaFake;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AplicaDiscountTest {

    @Tag("tag1")
    @Test
    void testAplicaDiscountVarstnici() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setGetVarstaValue(67);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Cluj", 200.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(180.0, pachetTuristic.getPret());
    }

    @Tag("tag2")
    @Test
    void testNuAplicaDiscountVarstnici() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setGetVarstaValue(18);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Cluj", 200.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertNotEquals(180.0, pachetTuristic.getPret());
    }
}