public class stringbuilder {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("hello");

        // for (int i = 0; i < sb.length()/2; i++) {
        //     int front = i;
        //     int back = sb.length()-1-i;

        //     char frontChar = sb.charAt(front);
        //     char backChar = sb.charAt(back);

        //     sb.setCharAt(frontChar, backChar);
        //     sb.setCharAt(backChar, frontChar);

           
            
        // }
        // System.out.println(sb);




        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb); 

        sb.insert(0,'s'); // insert any word 
        System.out.println(sb);
        

        //delete

        sb.delete(1,2);
        System.out.println(sb);

        sb.append("i");  /// add at last 
        System.out.println(sb);
        System.out.println(sb.length());  

    }
}
