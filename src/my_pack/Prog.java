package my_pack;

public class Prog {

    public static void main(String[] args) {
        Computers comp1 = new Computers();
        comp1.setMemory(4096);
        comp1.setCore(8);
        comp1.setHd(1024);
        comp1.name = "My_comp";
        comp1.read = 500;


        System.out.println(comp1.name + " " + comp1.getMemory());

        System.out.println(Computers.nameProgrammer);

        comp1.readData();
        comp1.readData();
        System.out.println(comp1.read);

        comp1.readData(10);
        System.out.println(comp1.read);

        comp1.read = comp1.readData(10, 50);
        System.out.println(comp1.read);

        //Смоделировать класс с полями и методами, определить конструктор, сделать несколько перегрузок методов. Создать несколько объектов в массиве.

      /*  boolean flag = false;

        if (!flag){
            System.out.println("true");
        }*/

        Servers srv = new Servers();
        srv.setLocation("srv_base");
        System.out.println(srv.name);
        srv.readData();
        System.out.println(srv.getRead());



    }

}
