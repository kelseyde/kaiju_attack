package com.example.kelseyde.kaijuattack.Kaiju;
import Kaiju.MegaBear;
import Vehicle.FighterJet;

import org.junit.*;
import static org.junit.Assert.*;


public class MegaBearTest {
    MegaBear megaBear;
    FighterJet fighterJet;

    @Before
    public void before() {
        megaBear = new MegaBear("Blue", 250, 50);
        fighterJet = new FighterJet(1, 40, 10);
    }

    @Test
    public void testHasName() {
        assertEquals("Blue", megaBear.getName());
    }

    @Test
    public void testHasHealth() {
        assertEquals(250, megaBear.getHealthValue());
    }

    @Test
    public void testHasAttack() {
        assertEquals(50, megaBear.getAttackValue());
    }

    @Test
    public void testCanRoar() {
        assertEquals("RAWRRR!", megaBear.roar());
    }

    @Test
    public void testCanAttack() {
        megaBear.attack(fighterJet);
        assertEquals(0, fighterJet.getHealthValue());
    }
}