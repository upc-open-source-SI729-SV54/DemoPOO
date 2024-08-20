package shared;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;

    public Address() {
        this.street = "";
        this.city = "";
        this.state = "";
        this.zip = "";
        this.country = "";
    }

    public Address(String street, String city, String state, String zip, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }

    public String getFullAddress() {
        return "Street: " + street + ", City: " + city + ", State: " + state + ", ZIP:" + zip + ", Country: " + country;
    }

    public void setFullAddress(String street, String city, String state, String zip, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }
}
