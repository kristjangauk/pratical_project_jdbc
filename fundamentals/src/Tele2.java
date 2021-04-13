public class Tele2 {
    public static void main(String[] args) {

        Clients obj1 = new Clients("Yohan");
        Clients obj2 = new Clients("Kristjan");
        Clients obj3 = new Clients("Liisu");

        Clients obj = new Clients("Indrek");

        System.out.println(obj1.mobile_num);
        System.out.println(obj2.mobile_num);
        System.out.println(obj3.mobile_num);
        System.out.println(obj.mobile_num);
        System.out.println(Clients.counter);


    }
}

class Clients {
    String cust_name;
    int mobile_num;
    static int counter;

    public Clients(String cust_name) {
        this.cust_name = cust_name;
        this.mobile_num = counter;
        counter++;
    }
}