public class Computer implements IDable{
    private String id;
    private String make;
    protected Memory memory;

    public Computer(String make, String memType, int memSize){
        setID("no Id");
        setMake(make);
        //memory = new Memory(memType, memSize);
        setMemory(new Memory(memType, memSize));


    }

    public Computer(){
        this ("no make", "no memory type", 0);
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void setID(String id) {
        this.id = id;
    }

    public Memory getMemory() {
        return memory;
    }

    public String getMake() {
        return make;
    }

    public String getId() {
        return id;
    }

    public String toString(){
        return "Id : " + getId() + "\nMake : " + getMake() + "\n" + memory.toString();
    }
}
