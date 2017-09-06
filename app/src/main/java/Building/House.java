package Building;

import Behaviours.Attackable;

public class House extends Building implements Attackable {

    public House(int healthValue) {
        super(healthValue);
    }

    public void receiveAttack(int damage) {
        if (damage > healthValue) healthValue = 0;
        else healthValue -= damage;
    }

}
