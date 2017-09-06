package Vehicle;

import Behaviours.Attackable;
import Behaviours.CanAttack;

public class FighterJet extends Vehicle implements CanAttack, Attackable{

    public FighterJet(int unitNumber, int healthValue, int attackValue){
        super(unitNumber, healthValue, attackValue);
    }

    public String attack(Attackable target) {
        target.receiveAttack(getAttackValue());
        return "FighterJet fires missiles at "+target.getClass()+".";
    }

    public void receiveAttack(int damage) {
        if (damage > healthValue) healthValue = 0;
        else healthValue -= damage;
    }



}
