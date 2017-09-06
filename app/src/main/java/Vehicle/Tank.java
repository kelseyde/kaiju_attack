package Vehicle;

import Behaviours.Attackable;
import Behaviours.CanAttack;

public class Tank extends Vehicle implements CanAttack, Attackable{

    public Tank(int unitNumber, int healthValue, int attackValue){
        super(unitNumber, healthValue, attackValue);
    }

    public String move() { return "Tank trundles slowly across the terrain."; }

    public String attack(Attackable target) {
        target.receiveAttack(getAttackValue());
        return "Tank unleashes rocket shell on "+target.getClass()+".";
    }

    public String attack(Attackable target, int range) {
        if (range < 100) {
            target.receiveAttack(getAttackValue());
            return "Tank's ICBM missile, at point blank range, is very effective.";
        }
        else if (range > 100 & range < 200) {
            target.receiveAttack(getAttackValue()/2);
            return "Tank lands an impressive strike from distance";
        }
        else if (range > 200) {
            return "Miss!.";
        }
        return "";
    }

    public void receiveAttack(int damage) {
        if (damage > healthValue) healthValue = 0;
        else healthValue -= damage;
    }

}
