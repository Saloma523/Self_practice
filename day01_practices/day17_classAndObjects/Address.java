package day17_classAndObjects;

public class Address {

    public int buildingNumber;
    public String street;
    public String city;
    public  String state;
    public int zipCode;

    public void setInfo(int buildingNumber, String street, String city, String state, int zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }


    @Override
    public String toString() {
        return "Address{" +
                "buildingNumber=" + buildingNumber +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
    /*Create a class named Address
        Attributes:
        buildingNumber, street, city, state, zipCode

        Actions
        setInfo: sets all the instances
        toString: returns the address
        EX:
        7925 Jones Branch Dr
        McLean Va, 22012*/
