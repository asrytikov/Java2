package my_pack;

abstract public class Clients {
    abstract public String getName();
    abstract public void setName(String name);

    String surname;
    public void setSurname(String surname){
        this.surname = surname;
    }
}
