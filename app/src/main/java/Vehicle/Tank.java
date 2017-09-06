package Vehicle;

import Behaviours.Attackable;
import Behaviours.CanAttack;

public class Tank extends Vehicle implements CanAttack, Attackable{

    public Tank(int unitNumber, int healthValue, int attackValue){
        super(unitNumber, healthValue, attackValue);
    }

    public String attack(Attackable target) {
        target.receiveAttack(getAttackValue());
        return "Tank unleashes rocket shell on "+target.getClass()+".";
    }

    public void receiveAttack(int damage) {
        if (damage > healthValue) healthValue = 0;
        else healthValue -= damage;
    }

}
