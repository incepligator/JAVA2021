import java.util.ArrayList;

public class Tarifa {

    private int dataProvided;
    private int usageMonth;



    private int remainingData=0;
    private ArrayList<Integer> dataUsagePerMonth = new ArrayList<>();


    public int getDataProvided() {
        return dataProvided;
    }

    public void setDataProvided(int dataProvided) {
        this.dataProvided = dataProvided;
    }

    public int getUsageMonth() {
        return usageMonth;
    }

    public void setUsageMonth(int usageMonth) {
        this.usageMonth = usageMonth;
    }

    public ArrayList<Integer> getDataUsagePerMonth() {
        return dataUsagePerMonth;
    }

    public void setDataUsagePerMonth(ArrayList<Integer> dataUsagePerMonth) {
        this.dataUsagePerMonth = dataUsagePerMonth;
    }

    public void addUsage(int index, int data){
        this.dataUsagePerMonth.add(index,data);
    }


    public int getRemainingData() {
        return remainingData;
    }

    public void setRemainingData(int remainingData) {
        this.remainingData = remainingData;
    }



}
