public class Identity {
    //inside the class -out side the method with static keyword
    String name = "Peter";
    String surname = "Ray";
    String address = "Orchard grove 5 ha8 5bl";
    String dob = "20/01/1950" ;
    int age = 69;


    static void name() {
        System.out.println("Peter");
    }
    static void surname() {
        System.out.println("Ray");
    }
    static void dob() {
        System.out.println("20/01/1950");
    }
    static void address() {
        System.out.println("Orhard grove 5 ha8 5bl");
    }
    static void age() {

        System.out.println(69);
    }

    //java main method

    public static void main(String []args){
        name();
        surname();
        address();
        dob();
        age();

    }

}