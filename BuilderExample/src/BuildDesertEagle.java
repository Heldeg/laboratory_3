public class BuildDesertEagle extends WeaponBuilder{
    @Override
    public void buildCharger() {
        weapon.charger(6).longDistance(false).caliber(9);
    }

    @Override
    public void buildStructure() {
        weapon.cadence(60).name("Desert Eagle");
    }
}
