package Vehicle;

import Behaviours.Attackable;
import Behaviours.CanAttack;

public class FighterJet extends Vehicle implements CanAttack, Attackable{

    public FighterJet(int unitNumber, int healthValue, int attackValue){
        super(unitNumber, healthValue, attackValue);
    }

    public String move() { return "Zoom! The FighterJet flies at the speed of light."; }

    public String attack(Attackable target) {
        target.receiveAttack(getAttackValue());
        return "FighterJet fires missiles at "+target.getClass()+".";
    }

    public String attack(Attackable target, char pilotGradeInBombingExam) {
        switch(pilotGradeInBombingExam) {
            case 'A' :
                target.receiveAttack(getAttackValue());
                return "All those hours of studying payed off!";
            case 'B' :
                target.receiveAttack(getAttackValue()/2);
                return "That Kaiju will rue the day he messed with this pilot.";
            case 'C' :
                target.receiveAttack(getAttackValue()/3);
                return "A decent effort, clipped the Kaiju's side.";
            case 'D' :
                return "Miss!";
        }
        return "";
    }

    public void receiveAttack(int damage) {
        if (damage > healthValue) healthValue = 0;
        else healthValue -= damage;
    }



}
