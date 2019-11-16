public class Situation {
    private TransportationBehavior transportationBehavior;
    private boolean haveTime;
    private boolean haveMoney;
    private int time;
    private int budget;

    public Situation(int time, int budget) {
        this.time = time;
        this.budget = budget;
        setHaveMoney();
        setHaveTime();
    }
    private void setHaveTime(){
        this.haveTime = time >= 3;
    }
    private void setHaveMoney(){
        this.haveMoney = budget >= 2;
    }

    public boolean isHaveTime() {
        return haveTime;
    }

    public boolean isHaveMoney() {
        return haveMoney;
    }

    public void setTransportationBehavior(TransportationBehavior transportationBehavior) {
        this.transportationBehavior = transportationBehavior;
    }
}
