package com.example.kelseyde.kaijuattack.Kaiju;
import org.junit.Before;
import org.junit.*;
import static junit.framework.Assert.assertEquals;

import Kaiju.GiantSalmon;
import Vehicle.FighterJet;


public class FighterJetTest {
    FighterJet fighterJet;
    GiantSalmon giantSalmon;

    @Before
    public void before() {
        fighterJet = new FighterJet(1, 20, 10);
        giantSalmon = new GiantSalmon("Big Fish", 100, 40);
    }

    @Test
    public void testHasUnitNumber() {
        assertEquals(1, fighterJet.getUnitNumber());
    }

    @Test
    public void testHasHealth() {
        assertEquals(20, fighterJet.getHealthValue());
    }

    @Test
    public void testHasAttack() {
        assertEquals(10, fighterJet.getAttackValue());
    }

    @Test
    public void testCanAttack() {
        fighterJet.attack(giantSalmon);
        assertEquals(90, giantSalmon.getHealthValue());
    }
}
