public class ConstEx {
    public static void main(String[] args) {

        Example obj = new Example(37, "Kristjan");

        System.out.println(obj.age);
        System.out.println(obj.name);
        System.out.println(obj.myPi);

        Example obj1 = new Example();
        System.out.println(obj1.myPi);


    }
}

class Example {
    int age;
    String name;
    float myPi;// = 3.14F;

    public Example() {
        this.myPi = 3.14F;
    }

    public Example(int age, String name) {
        this.age = age;
        this.name = name;
        this.myPi = 3.14F;
    }
}
