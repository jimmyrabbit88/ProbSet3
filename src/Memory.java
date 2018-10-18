public class Memory {
    private String type;
    private int size;

    public Memory(String type, int size){
        setType(type);
        setSize(size);
    }

    public Memory(){
        this ("No type", 0);
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        return "Type : " + type + "\nSize : " + size + "Gb\n";
    }
}
