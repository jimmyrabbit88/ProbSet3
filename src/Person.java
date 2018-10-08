public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        setName(name);
        setAge(age);
    }

    public Person(){
        this ("No Name", 0);
    }

    public String toString(){
        return "Name :: " + name + "\nAge :: " + age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
