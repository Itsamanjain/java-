import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //float salary ;
        Scanner in = new Scanner(System.in);
        System.out.println("enter your salary"); // now we r saying to enter the  value 
        float salary = in.nextFloat();
        
        if (salary > 10000) {
            salary = salary + 2000;

        } else if  (salary>20000) {
            salary = salary + 3000;
        }else{
            salary += 1000;
        }
        System.out.println(salary);
    }

}
