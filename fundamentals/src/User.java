public class User {

    private String name;
    String x;



    public String getName() {  return name;    }

    public void setName(String name) {
        this.name = name;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }
}


class Program2Run{

    public static void main(String[] args) {

        User obj = new User();

        //obj.name = "YOhan";
        //System.out.println(obj.name);




        obj.setName("YOhan");
        System.out.println(obj.getName());

        obj.setName("XYZ");
        System.out.println(obj.getName());
    }

}





