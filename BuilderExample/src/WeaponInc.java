public class WeaponInc {
    private WeaponBuilder myWeaponBuilder;

    public void setMyWeaponBuilder(WeaponBuilder myWeaponBuilder) {
        this.myWeaponBuilder = myWeaponBuilder;
    }

    public Weapon getWeapon(){return myWeaponBuilder.getWeapon();}

    public void buildWeapon(){
        myWeaponBuilder.create();
        myWeaponBuilder.buildCharger();
        myWeaponBuilder.buildStructure();
    }
}
