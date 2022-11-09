


public class Robot {
    //Instance Variables (HAS A)
    public String name;
    public Weapon weapon;

    //Constructor
    public Robot(Weapon weapon) {
        this.name = "Tin man";
        this.weapon = weapon;

    }

    //Methods (CAN DO)
    public void Attack(){
        System.out.println(this.name + " attacks with their " + this.weapon.name + " for " + this.weapon.power + " damage ");
    }
}
