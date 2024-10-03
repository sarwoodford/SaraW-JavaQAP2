public class Address {
    // assign attributes
    private String street;
    private String city;
    private String state;
    private String zip;

    // constructor
    public Address(String street, String city, String state, String zip){
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // display results
    public String toString(){
        return street + ", " + city + ", " + state + " " + zip;
    }
}
