import java.util.Scanner;

public class darray {
    public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     System.out.println("enter the no. of rows & cols");
    //     int rows = in.nextInt();
    //     int cols = in.nextInt();

    //     int[][] numbers = new int[rows][cols];

    //     // input
    //     System.out.println("enter the  value of rows and cols one by one");
    //     for (int i = 0; i < rows; i++) {
    //         for (int j = 0; j < cols; j++) {
    //             numbers[i][j] = in.nextInt();

    //         }

    //     }

    //     // output
    //     System.out.println("your output is ");
    //     for (int i = 0; i < rows; i++) {
    //         for (int j = 0; j < cols; j++) {
    //             System.out.print(numbers[i][j] + " ");
    //         }

    //         System.out.println();
    //     }


    // QUESTION ...-->

    //FIND THE NO. IN 2D ARRAY AND WRITE ITS INDICES


    Scanner in = new Scanner(System.in);
        System.out.println("enter the no. of rows & cols");
        int rows = in.nextInt();
        int cols = in.nextInt();

        int[][] numbers = new int[rows][cols];

        // input
        System.out.println("enter the  value of rows and cols one by one");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = in.nextInt();

            }

        }
        System.out.println("the value of x is");
        int x  = in.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                //compare with x
                if(numbers[i][j] == x){
                    System.out.println("x is found at("+i+","+j+")");

                }
                
            }
            
        }


     }

}
