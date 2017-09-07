package Kaiju;

import Behaviours.CanAttack;
import Behaviours.Attackable;

public class GiantSalmon extends Kaiju implements CanAttack, Attackable{

    private int armourValue;

    public GiantSalmon(String name, int healthValue, int attackValue, int armourValue) {
        super(name, healthValue, attackValue);
        this.armourValue = armourValue;
    }

    //getters and setters

    public int getArmourValue() {
        return armourValue;
    }

    public void setArmourValue(int armourValue) {
        this.armourValue = armourValue;
    }

    //methods

    public String roar() { return "deadly silence..."; }

    public String move() {
        return "The graceful GiantSalmon glides through the water like a knife through soft butter."; }

    public String attack(Attackable target) {
        target.receiveAttack(attackValue);
        return "GiantSalmon leaps from the water and reigns down terror upon the meek and feeble "
                +target.getClass()+".";
    }

    public void receiveAttack(int damage) {
        if (damage > armourValue) {
            armourValue = 0;
            if (damage > healthValue) healthValue = 0;
            else healthValue -= (damage - armourValue);
        }
        else armourValue -= damage;
        }


    }





