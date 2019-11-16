public class SituationFactory {
    public static Situation getSolution(int time,int budget){
        Situation mySituation = new Situation(time,budget);
        if (mySituation.isHaveMoney()&&mySituation.isHaveTime()){
            mySituation.setTransportationBehavior(new Bus());
            System.out.println("Use bus");
        }else if(mySituation.isHaveMoney()&&!mySituation.isHaveTime()){
            mySituation.setTransportationBehavior(new Cab());
            System.out.println("Use Cab");
        }else if((!mySituation.isHaveMoney()&&mySituation.isHaveTime())){
            mySituation.setTransportationBehavior(new Bicycle());
            System.out.println("Use bicycle");
        }else{
            System.out.println("hopeless");
        }
        return mySituation;
    }
}
