public class Bus implements TransportationBehavior {
    public Bus() {
    }
    @Override
    public int collectMoney(int budget) {
        return budget -2;
    }

    @Override
    public int takeTime(int time) {
        return time-2;
    }
}
