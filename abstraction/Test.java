package abstraction;

public class Test {
    public static void main(String[] args) {
        ThreeSeries threeseries=new ThreeSeries();
        threeseries.accelerate();
        threeseries.commonFunc();
        FiveSeries fiveseries=new FiveSeries();
        fiveseries.accelerate();
        fiveseries.commonFunc();
    }
}
