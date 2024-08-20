package sales.domain.model.aggregates;

import shared.Address;
import java.util.UUID;

public class Customer {

    private final UUID customerId; // Son string largos pero que nunca se repiten
    private final String firstName;
    private final String lastName;
    private final Address address;

    public Customer(String firstName, String lastName, String address) {
        this.customerId = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.address  = new Address();
    }

    public void setAddress(String street, String city, String state, String zip, String country) {
        this.address.setFullAddress(street, city, state, zip, country);
    }
}
