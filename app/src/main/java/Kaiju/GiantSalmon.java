package Kaiju;

import Behaviours.CanAttack;
import Behaviours.Attackable;

public class GiantSalmon extends Kaiju implements CanAttack, Attackable{

    public GiantSalmon(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String roar() { return "deadly silence..."; }

    public String move() {
        return "The graceful GiantSalmon glides through the water like a knife through soft butter."; }

    public String attack(Attackable target) {
        target.receiveAttack(attackValue);
        return "GiantSalmon leaps from the water and reigns down terror upon the meek and feeble "
                +target.getClass()+".";
    }

    public void receiveAttack(int damage) {
        if (damage > healthValue) healthValue = 0;
        else healthValue -= damage;
    }


}
