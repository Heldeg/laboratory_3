public class Weapon {
    private int chargerSize;
    private double cadence;
    private String name;
    private boolean longDistance;
    private double caliber;
    public Weapon charger(int charger){
        this.chargerSize = charger;
        return this;
    }
    public Weapon cadence(int cadence){
        this.cadence = cadence;
        return this;
    }
    public Weapon name (String name){
        this.name = name;
        return this;
    }
    public Weapon longDistance (boolean longDistance){
        this.longDistance = longDistance;
        return this;
    }
    public Weapon caliber (double caliber){
        this.caliber = caliber;
        return this;
    }
}
