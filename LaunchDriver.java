import java.util.ArrayList;
import java.util.Scanner;

public class LaunchDriver {


    public static void main(String[] args) {
        int min = (int)Math.pow(10,9);
        Launch launch = new Launch();
        Scanner license = new Scanner(System.in);

        //System.out.print(" Enter the number of days for which the launch license is valid :- ");
        launch.setValidLicense(license.nextInt());

        while (1 > launch.getValidLicense() || launch.getValidLicense() > 1000000) {
           // System.out.print("INVALID INPUT: - Enter the number of days for which the launch license is valid :- ");
            launch.setValidLicense(license.nextInt());
        }

        //System.out.print(n);
        // int[] debris = new int[launch.getValidLicense()];
        ArrayList<Integer> debris = new ArrayList<Integer>();

        for (int i = 0; i < launch.getValidLicense(); i++) {
            debris.add(license.nextInt());
            // System.out.println(debris[i]);

            // while(debris[i]<0 || debris[i]>Math.pow(10,9)){
            //  System.out.print("Invalid Input please enter again for debris for day - "+ i);
            //  debris[i] = license.nextInt();
            //}


        }


        //launch.setSmall((int)Math.pow(10,9));

        //System.out.print(smallest);
        for (int i = 0; i < debris.size(); i++) {

            //if (launch.getSmall() > debris[i]) {
            //  launch.setSmall( debris[i]);
            //   launch.setDays(i);
            //}

            if (debris.get(i) < min) {
                min = debris.get(i);
            }
        }


        for (int i = 0; i < debris.size(); i++) {

            if (min == debris.get(i)) {
                launch.setDays(i);
                break;
            }

        }

        System.out.println(launch.getDays());

    }
}
