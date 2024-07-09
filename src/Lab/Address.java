package Lab;

public class Address {
     String street;
     String city;
     String state;
     String postalCode;
     String country;

    public Address(String street, String city,String state, String postalCode) {
        this.street = street;
    }

    public boolean validate()
    {
        if(Integer.valueOf(postalCode)> 4330 && Integer.valueOf(postalCode)<5000){
            return true;
        }
        return false;
    }
}
