public class MethosOverlod {

    static int add(int a, int b){
        return a+b;
    }
    static double add(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {

        int sum1 = add(10, 20);
        double sum2 = add(10.5, 20.5);

    }
}
