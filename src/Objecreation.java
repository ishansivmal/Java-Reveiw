public class Objecreation {
    public  String name = "ishan";
    public  int age = 20;
    public  String  address = "Sri Lanka";


        public void getINfor(){
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Address: " + address);
        }

        public static void main(String[] args) {

            Objecreation man1 = new Objecreation();
            man1.getINfor();

            Objecreation man2 = new Objecreation();
            man2.getINfor();
        }

}
