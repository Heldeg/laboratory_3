public class Cab implements TransportationBehavior{

    @Override
    public int collectMoney(int budget) {
        return budget -3;
    }

    @Override
    public int takeTime(int time) {
        return time-1;
    }
}
