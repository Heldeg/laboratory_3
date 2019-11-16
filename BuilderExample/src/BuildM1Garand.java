public class BuildM1Garand extends WeaponBuilder {
    @Override
    public void buildCharger() {
        weapon.charger(5).longDistance(true).caliber(7.6);
    }

    @Override
    public void buildStructure() {
        weapon.cadence(45).name("M1 Garand");
    }
}
