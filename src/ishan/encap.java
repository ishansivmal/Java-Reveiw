package ishan;

public class encap {

    public static void main(String[] args) {
        accessModifer obj = new accessModifer();
        obj.setName("k");
        obj.setAge(20);
        obj.setAddress("Sri Lanka");


        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getAddress());


        accessModifer obj2 = new accessModifer();
        System.out.println(obj2.getName());





    }
}
