public class BuildAK47 extends WeaponBuilder{
    @Override
    public void buildCharger() {
        weapon.charger(30).longDistance(false).caliber(7.62);
    }

    @Override
    public void buildStructure() {
        weapon.cadence(600).name("AK-47");
    }
}
