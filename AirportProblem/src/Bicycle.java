public class Bicycle implements TransportationBehavior{

    @Override
    public int collectMoney(int budget) {
        return budget;
    }

    @Override
    public int takeTime(int time) {
        return time-3;
    }
}
