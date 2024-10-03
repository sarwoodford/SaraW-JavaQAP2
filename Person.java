public class Person {
    // assign attributes
    private String firstName;
    private String lastName;
    private Address address;

    // constuctor 
    public Person(String firstName, String lastName, Address address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    // display results 
    public String toString(){
        return firstName + " " + lastName + ", " + address.toString();
    }
}
