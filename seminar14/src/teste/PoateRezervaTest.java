package teste;

import clase.IPersoana;
import clase.PachetTuristic;
import dubluri.PersoanaMajoraStub;
import dubluri.PersoanaMinoraStub;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PoateRezervaTest {

    @Tag("tag1")
    @Test
    void majorPoateRezerva() {
        IPersoana persoanaStub = new PersoanaMajoraStub();
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaStub, "Bucuresti", 300.0);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Tag("tag2")
    @Test
    void minorNuPoateRezerva() {
        IPersoana persoanaStub = new PersoanaMinoraStub();
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaStub, "Bucuresti", 300.0);
        assertFalse(pachetTuristic.poateRezerva());
    }
}