import java.util.Scanner;

public class Aman {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String dep = in.next();


            // nested switch case 


        switch(empId){
            case 1:
            System.out.println("aman");
            break;
            case 2:
            System.out.println("gunnu");
            break;
            case 3:
                switch (dep) {
                    case "it":
                        System.out.println("it dep");
                        break;
                    case "manager":
                        System.out.println("manager hai ");
                        break;
                    default :
                        System.out.println("dalla");


                }break;

                default:
                    System.out.println("chaprasi");

        }


    }
    
}
