package com.example.kelseyde.kaijuattack.Kaiju;
import org.junit.Before;
import org.junit.*;
import static junit.framework.Assert.assertEquals;

import Kaiju.MegaBear;
import Vehicle.Tank;


public class TankTest {
    Tank tank;
    MegaBear megaBear;

    @Before
    public void before() {
        tank = new Tank(1, 50, 15);
        megaBear = new MegaBear("Bitsy", 200, 50);
    }

    @Test
    public void testHasUnitNumber() {
        assertEquals(1, tank.getUnitNumber());
    }

    @Test
    public void testHasHealth() {
        assertEquals(50, tank.getHealthValue());
    }

    @Test
    public void testHasAttack() {
        assertEquals(15, tank.getAttackValue());
    }


    @Test
    public void testCanAttack() {
        tank.attack(megaBear);
        assertEquals(185, megaBear.getHealthValue());
    }

}