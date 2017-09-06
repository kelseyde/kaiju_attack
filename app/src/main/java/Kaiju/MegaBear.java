package Kaiju;

import Behaviours.CanAttack;
import Behaviours.Attackable;

public class MegaBear extends Kaiju implements CanAttack, Attackable {

    public MegaBear(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String roar() { return "RAWRRR!"; }

    public String move() { return "The MegaBear lumbers across the land, trampling all that dare stand in its wake."; }

    public String attack(Attackable target) {
        target.receiveAttack(getAttackValue());
        return "MegaBear awakes from his slumber to inflict great pain upon the puny and worthless "
                +target.getClass()+".";
    }

    public void receiveAttack(int damage) {
        if (damage > healthValue) healthValue = 0;
        else healthValue -= damage;
    }


}
