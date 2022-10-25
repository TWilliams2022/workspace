package CompositionExamples;

public class Address {
    private String city;
    private String country;


    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    //returns city and country info
    public String getAddressInfo(){
        //String is a local variable
        return getCity() + " " + getCountry();
    }




}
