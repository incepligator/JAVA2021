import java.util.Scanner;

public class TarifaDriver {

    public static void main(String[] args) {


        Scanner sn = new Scanner(System.in);

        Tarifa tariff = new Tarifa();

        //for megabyters to surf per month
        do{
            tariff.setDataProvided(sn.nextInt());
        }
        while(tariff.getDataProvided()<1 || tariff.getDataProvided()>100);

        // months of using the plan
        do{
            tariff.setUsageMonth(sn.nextInt());
        }
        while(tariff.getUsageMonth()<1 || tariff.getUsageMonth()>100);

        //new tariff.setDataUsagePerMonth();
        //tariff.addUsage(5);

        //System.out.print("array "+ tariff.getDataUsagePerMonth().get(0) );

        for( int i = 0; i<tariff.getUsageMonth(); i++){

            do {
                tariff.addUsage(i,sn.nextInt());
               // System.out.println("Line");
                //System.out.println("array"+tariff.getDataUsagePerMonth().get(i));
               // System.out.println("getDataUsae"+tariff.getUsageMonth());
               // System.out.println("getDataUsagePermonth for I "+tariff.getDataUsagePerMonth().get(i));
               // System.out.println("getDataUsagePermonth for I "+(tariff.getRemainingData()+tariff.getDataProvided()));
            }
            while(tariff.getDataUsagePerMonth().get(i)>(tariff.getRemainingData()+tariff.getDataProvided())); // input data less than equal to dtat provided or remaining data

          // System.out.println("Line2");
            //set remaining data per month
           // System.out.println("Line2"+tariff.getRemainingData());
           // System.out.println("Line2"+tariff.getDataProvided());
           // System.out.println("Line2"+tariff.getDataUsagePerMonth().get(i));
           // int a = tariff.getDataProvided()-tariff.getDataUsagePerMonth().get(i);
            //System.out.println("Line2 "+a);

            tariff.setRemainingData(tariff.getRemainingData()+(tariff.getDataProvided()-tariff.getDataUsagePerMonth().get(i)));

            //System.out.print("remaining data after n +1 day "+ (tariff.getRemainingData()+tariff.getDataProvided()));
            }
        System.out.print( tariff.getRemainingData()+tariff.getDataProvided());
    }

}
