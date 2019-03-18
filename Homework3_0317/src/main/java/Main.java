public class Main {


    // Create two Person objects. One with a default constructor and one with the overloaded constructor.
    //    //
    //    //•Print out the object that was created with the default constructor
    //    //•Create a second object with the overloaded constructor then call the PrintMethod on the object to see what prints out


    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person (22, "Nice home", "Soccer", "Software Engineer", 1000000000);
        System.out.println(person1.toString());

    }

}
