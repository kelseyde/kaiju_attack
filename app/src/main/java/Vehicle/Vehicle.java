package Vehicle;

public abstract class Vehicle {

    int unitNumber;
    int healthValue;
    int attackValue;

    public Vehicle(int unitNumber, int healthValue, int attackValue) {
        this.unitNumber = unitNumber;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    //getters and setters

    public int getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(int unitNumber) {
        this.unitNumber = unitNumber;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }




}
