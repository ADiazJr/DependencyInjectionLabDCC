public class Main {
    public static void main(String[] args) {
        Spear spear = new Spear();
        Robot robot_one = new Robot(spear);
        robot_one.Attack();
    }
}