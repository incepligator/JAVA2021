public class DifferentProblem {

    public long getNumber1() {
        return number1;
    }

    public void setNumber1(long number1) {
        this.number1 = number1;
    }

    public long getNumber2() {
        return number2;
    }

    public void setNumber2(long number2) {
        this.number2 = number2;
    }

    private long number1;
    private long number2;

    public DifferentProblem(){

    }


    public DifferentProblem(long number1, long number2){
        this.number1=number1;
        this.number2=number2;

    }


    public double difference(){
        double difference;
        if(number1<number2)
            difference = number2-number1;
        else
            difference = number1-number2;
        return difference;
    }





}
