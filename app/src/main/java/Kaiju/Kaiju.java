package Kaiju;

public abstract class Kaiju {

  String name;
  int healthValue;
  int attackValue;

  public Kaiju(String name, int healthValue, int attackValue) {
    this.name = name;
    this.healthValue = healthValue;
    this.attackValue = attackValue;
  }

  //getters and setters

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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

  //instance methods

  public String roar() { return "Roar!"; }

  public String move() { return "The Kaiju moves."; }


}
