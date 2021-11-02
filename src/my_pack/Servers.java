package my_pack;

public class Servers extends Computers{

    private String location;
    private int read;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRead() {
        return read;
    }

    public void setRead(int read) {
        this.read = read;
    }

    public Servers(){
        super();
        read = 500;
    }

    @Override
    public void readData(){
        read = read + 10;
    }



}
