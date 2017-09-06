package com.example.kelseyde.kaijuattack.Kaiju;
import Kaiju.GiantSalmon;
import Building.House;

import org.junit.*;
import static org.junit.Assert.*;

public class HouseTest {
    GiantSalmon giantSalmon;
    House house;

    @Before
    public void before() {
        house = new House(10);
        giantSalmon = new GiantSalmon("Sam", 200, 40);
    }

    @Test

    public void testCanReceiveDamage() {
        giantSalmon.attack(house);
        assertEquals(0, house.getHealthValue());
    }


}
