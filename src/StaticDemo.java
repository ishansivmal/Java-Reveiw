public class StaticDemo {
    public static void main(String[] args) {
        var x = 10;
        var name = "ishan";

        System.out.println(x);
        System.out.println(StaticVarible.Name);
        System.out.println(StaticVarible.Age);
        System.out.println(StaticVarible.Address);
        StaticVarible.getINfor();
    }
}
