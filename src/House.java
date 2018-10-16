public class House {
    private String address;
    private String type;
    private float price;
    private Person owner;

    public House(){
        this ("no address", "no type", 0.00f, "no name", 0);
    }

    public House(String address, String type, float price, String personName, int personAge){
        setAddress(address);
        setType(type);
        setPrice(price);
        Person owner = new Person(personName, personAge);
        setOwner(owner);
    }

    public String toString(){
        return "Address : " + address +"\nType : " + type +"\nPrice : " + price +  "\nOwner\n    Name :" + owner.getName() +"\n    Age : " + owner.getAge();
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public void setPrice(float price) {
        if(price >= 0) {
            this.price = price;
        }
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
