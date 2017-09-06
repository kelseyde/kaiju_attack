package Building;

import Behaviours.Attackable;

public class OfficeBlock extends Building implements Attackable{

    public OfficeBlock(int healthValue) {
        super(healthValue);
    }

    public void receiveAttack(int damage) {
        if (damage > healthValue) healthValue = 0;
        else healthValue -= damage;
    }

}
