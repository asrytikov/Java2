package my_pack;

public class Computers {


    private int memory;
    private int core;
    private int hd;
    int read;
    public String name;

    public static String nameProgrammer = "Ivan";


    public Computers(){
        name = "S1";
        core = 8;
        hd = 1024;
    }
    public Computers(String name){
        this.name = name;
    }

    public void readData(){
        read++;
    }
    public void readData(int r){
        read = read + r;
    }

    public int readData(int r, int t){
        return r*t;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getCore() {
        return core;
    }

    public void setCore(int core) {
        this.core = core;
    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }
}
