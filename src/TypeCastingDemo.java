public class TypeCastingDemo {

    public static void main(String[] args) {
        int x = 10;
        double y = x;// auto matically type casted
        System.out.println(x);
        System.out.println(y);


        double myDouble = 9.78;
        int Myint = (int) myDouble; // Manual type casting: double to int
        System.out.println(myDouble); // Outputs 9.78
        System.out.println(Myint);    // Outputs 9


    }
}
