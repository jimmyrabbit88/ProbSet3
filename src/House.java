public class House {
    private String address;
    private String type;
    private float price;
    private Person owner;

    public House(String address, String type, float price, String personName, int personAge){
        setAddress(address);
        setType(type);
        setPrice(price);
        Person owner = new Person(personName, personAge);
        setOwner(owner);
    }

    public String toString(){
        return "address " + address + "\nOwner :" + owner.getName() +"\n    " + owner.getAge();
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String getAddress() {
        return address;
    }

    public float getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public Person getOwner() {
        return owner;
    }
}
