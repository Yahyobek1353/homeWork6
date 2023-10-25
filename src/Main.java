public class Main {
    public static void main(String[] args) {
        Weapon b1 = new Weapon("awm", "heavy");
        Boss boss = new Boss("Boss", 450, 50, b1);
        System.out.println(boss);
    }
}