public class Laptop extends Computer{
    private boolean touchScreen;

    public Laptop(String make, String type, int size, boolean touchScreen){
        super (make, type, size);
        setTouchScreen(touchScreen);
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public String toString(){
        return super.toString() + "Touch Screen : " + isTouchScreen() + "\n";
    }
}
