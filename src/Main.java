public class Main {
    public static void main(String[] args) {
        Spear spear = new Spear();
        Hammer hammer = new Hammer();
        Axe axe = new Axe();
        Robot robot_one = new Robot(spear, "Tin Man");
        Robot robot_two = new Robot(hammer, "Zorg");
        Robot robot_three = new Robot(axe, "RoboCop");
        robot_one.Attack();
        robot_two.Attack();
        robot_three.Attack();
    }
}