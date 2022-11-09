public class Vampire implements Attacker{
    //Instance Variables (HAS A)
    public String name;
    public int attackPower;

    public Vampire(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    @Override
    public void Attack() {
        System.out.println(this.name + " bites you for " + this.attackPower + " damage");
    }
}
