package test;

import clase.IPersoana;
import clase.Persoana;
import exception.CNPNullException;
import exception.NenascutException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class PersoanaTest {

    @Test
    void testRightGetVarsta() {
        IPersoana persoana = new Persoana("Andrei", "1970828284487");
        assertEquals(25, persoana.getVarsta());
    }

    @Test
    void testBoundaryGetVarstaNouNascut() {
        IPersoana persoana = new Persoana("Andrei", "5230524123456");
        assertEquals(0, persoana.getVarsta());
    }

    @Test
    void testBoundaryGetVarstaLimitaInferioara() {
        IPersoana persoana = new Persoana("Andrei", "5000101123456");
        assertEquals(23, persoana.getVarsta());
    }

    @Test
    void testBoundaryGetVarstaLimitaSuperioara() {
        IPersoana persoana = new Persoana("Andrei", "1991231123456");
        assertEquals(23, persoana.getVarsta());
    }

    @Test
    void testErrorConditionGetVarsta() {
        IPersoana persoana = new Persoana("Andrei", "5230724123456");
        assertThrows(NenascutException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                persoana.getVarsta();
            }
        }, "Persoana nu s-a nascut");
    }

    @Test
    void testPerformanceGetVarsta() {
        IPersoana persoana = new Persoana("Andrei", "5000324123456");
        assertTimeout(Duration.ofMillis(100), () -> persoana.getVarsta());
    }

    @Test
    void testConformanceGetCNP(){
        Persoana persoana = new Persoana("Andrei", "5000324123456");
        assertEquals(13, persoana.getCNP().length());
    }

    @Test
    void testOrderingVarsta(){
        Persoana persoana1 = new Persoana("Andrei", "5000324123456");
        Persoana persoana2 = new Persoana("Alex", "5010524123456");
        assertTrue(persoana1.getVarsta() > persoana2.getVarsta());
    }

    @Test
    void testExistenceCNP(){
        Persoana persoana = new Persoana("Andrei", null);
        assertThrows(CNPNullException.class, persoana::getVarsta);
    }

    @Test
    void testCardinalityGetVarsta(){
        Persoana persoana = new Persoana("Andrei", "5220324123456");
        assertEquals(1, persoana.getVarsta());
    }

    @Test
    void testCrosscheckConstructor(){
        Persoana persoana1 = new Persoana("Andrei", "5220324123456");
        Persoana persoana2 = new Persoana();
        persoana2.setCNP("5220324123456");
        persoana2.setNume("Andrei");
        assertEquals(persoana1.getCNP(), persoana2.getCNP());
        assertEquals(persoana1.getNume(), persoana2.getNume());
    }
}