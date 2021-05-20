import java.util.Scanner;

public class McDonalds {

    private String managerName;


    McDonalds(){

        managerName = new String("Jessy");
    }

    public String getManagerName(){
        return managerName;
    }

    public void setManagerName(String managerName){
        this.managerName=managerName;

    }

    Scanner input = new Scanner(System.in);
    public void display() {


        input.next();
    }
}
