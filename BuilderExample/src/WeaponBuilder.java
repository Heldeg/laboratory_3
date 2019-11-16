abstract  class WeaponBuilder {
    protected Weapon weapon;



    public void create(){weapon = new Weapon();}

    public Weapon getWeapon() {
        return weapon;
    }

    public abstract void buildCharger();

    public abstract void buildStructure();


}
