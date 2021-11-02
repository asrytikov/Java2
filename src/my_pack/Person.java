package my_pack;

public class Person extends Clients{
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }
}
