public class Constructors {

    public Constructors() {
        this("ishan", 20, "Sri Lanka");
    }

    String  name;
    int age;
    String address;

    public Constructors(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void getINfor(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Constructors obj = new Constructors();
        obj.getINfor();
        Constructors obj1 = new Constructors("t", 20, "Sri Lanka");

        obj1.getINfor();

        Constructors obj2 = new Constructors();
        obj2.getINfor();

        Constructors obj3 = new Constructors();
    }
}
