public class Person {

  //Create a Person class should have the following Instance variables / fields such as
    //
    //name, age, favorite sport, occupation, salary (All public)
    //
    //Create a default constructor and another constructor with all the fields/properties
    //Create a toString method
    //Create a PrintMethod that prints out the following using your fields
    //"My name is _____ and I am _____ years old. My Favorite sports is _____ and by this time next year my occupation will be _______ meaning I could be making up to ______ yearly!
    //
    //
    //In Main
    //Create two Person objects. One with a default constructor and one with the overloaded constructor.
    //
    //•Print out the object that was created with the default constructor
    //•Create a second object with the overloaded constructor then call the PrintMethod on the object to see what prints out


    int salary;
    int age;
    String home;
    String favoriteSport;
    String occupation;

        public Person () { }

        public Person ( int age, String home , String favoriteSport, String occupation, int salary ) {
            this.age = age;
            this.home = home;
            this.favoriteSport = favoriteSport;
            this.occupation = occupation;
            this.salary = salary;

        }

    @Override
    public String toString() {
        return "My name is Zaina and I am " +  age  + " years old. " + " My Favorite sports is " + favoriteSport +
                " and by this time next year my occupation will be " + occupation + " meaning I could be making up to " + salary + " yearly. ";
    }
}
