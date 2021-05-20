import java.util.Scanner;

public class DifferentProblemDriver {

    public static void main(String[] args) {

        //double number1, number2;
        DifferentProblem solution = new DifferentProblem();

        Scanner input = new Scanner(System.in);

        //for integer input 1
        //System.out.println("Please input Integer Number1: < should greater or equals to 1 > ");
        while (input.hasNextLong()) {

            solution.setNumber1(input.nextLong());

            while (solution.getNumber1() < 0) {
                //System.out.println("Please input Integer Number1: < should greater or equals to 1 > ");
                solution.setNumber1(input.nextLong());
            }


            //for input integer 2
            //System.out.println("Please input Integer Number2: < should greater than 0 and less than 10^15>");

            solution.setNumber2(input.nextLong());
            //data validation for positive number & less than 10^15
            while (solution.getNumber2() > Math.pow(10, 15) || solution.getNumber2() < 0) {
                //System.out.println("INPUT INVALID PLEASE ENTER integer Number2: < should greater than 0 and less than 10^15 >");
                solution.setNumber2(input.nextLong());
            }


            System.out.println(Math.abs(solution.getNumber1() - solution.getNumber2()));

        }
    }


}
