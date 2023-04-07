public class scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a);
        String name = "man";
        System.out.println(name);
        System.out.println(b);


        {
            a=30;
            System.out.println(a);
            int c = 50;
            System.out.println(c);
            System.out.println(name);
        }
        System.out.println(a);
        //System.out.println(c);  --> c can not resolve outside that block.
        System.out.println(name);
    }
    
}
