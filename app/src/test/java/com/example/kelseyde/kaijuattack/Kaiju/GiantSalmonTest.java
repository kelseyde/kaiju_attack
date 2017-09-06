package com.example.kelseyde.kaijuattack.Kaiju;
import Kaiju.GiantSalmon;
import Vehicle.Tank;

import org.junit.*;
import static org.junit.Assert.*;

public class GiantSalmonTest {
    GiantSalmon giantSalmon;
    Tank tank;

    @Before
    public void before() {
        giantSalmon = new GiantSalmon("Bill", 200, 40);
        tank = new Tank(1, 50, 15);
    }

    @Test
    public void testHasName() {
        assertEquals("Bill", giantSalmon.getName());
    }

    @Test
    public void testHasHealth() {
        assertEquals(200, giantSalmon.getHealthValue());
    }

    @Test
    public void testHasAttack() {
        assertEquals(40, giantSalmon.getAttackValue());
    }

    @Test
    public void testCanRoar() {
        assertEquals("deadly silence...", giantSalmon.roar());
    }

    @Test
    public void canAttack() {
        giantSalmon.attack(tank);
        assertEquals(10, tank.getHealthValue());
    }


}
