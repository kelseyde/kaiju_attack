package com.example.kelseyde.kaijuattack.Kaiju;
import Kaiju.GiantSalmon;
import Building.OfficeBlock;

import org.junit.*;
import static org.junit.Assert.*;

public class OfficeBlockTest {
    GiantSalmon giantSalmon;
    OfficeBlock officeBlock;

    @Before
    public void before() {
        officeBlock = new OfficeBlock(45);
        giantSalmon = new GiantSalmon("Sam", 200, 40, 10);
    }

    @Test

    public void testCanReceiveDamage() {
        giantSalmon.attack(officeBlock);
        assertEquals(5, officeBlock.getHealthValue());
    }


}
