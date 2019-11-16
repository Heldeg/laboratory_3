import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WeaponInc weaponInc = new WeaponInc();
        WeaponBuilder weaponBuilder;
        Scanner s = new Scanner(System.in);
        int order = s.nextInt();
        switch (order) {
            case 1:
                weaponBuilder = new BuildAK47();
                break;
            case 2:
                weaponBuilder = new BuildDesertEagle();
                break;
            case 3:
                weaponBuilder = new BuildM1Garand();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + order);
        }
        weaponInc.setMyWeaponBuilder(weaponBuilder);
        weaponInc.buildWeapon();
        Weapon product = weaponInc.getWeapon();
    }
}
