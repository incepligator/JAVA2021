import java.util.Scanner;

public class Different {


    public static void main(String[] args) {


        long diff;

        Scanner in = new Scanner(System.in);

        while (in.hasNextLong()) {

            diff = in.nextLong() - in.nextLong();

            System.out.print(Math.abs(diff));
        }
    }
}
