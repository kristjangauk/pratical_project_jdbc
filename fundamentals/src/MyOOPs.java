public class MyOOPs {
    public static void main(String[] args) {

        System.out.println("STARTED!!!");

        Studentz obj1 = new Studentz();
        obj1.name = "Yo";
        obj1.lastName = "Wadia";
        obj1.age = 1;
        obj1.sayName();
        obj1.sayAge();
        obj1.sayFullName();

        Studentz obj2 = new Studentz();
        obj2.name = "Java";
        obj2.age = 10;
        obj2.sayName();
        obj2.sayAge();

        obj1.checkForDiscount();
        obj2.checkForDiscount();





    }
}

class Studentz {
    String name;
    String lastName;
    int age;

    public void sayName() {
        System.out.println("My name is " + name);
    }
    public void sayAge() {
        System.out.println("My age is " + age);
    }
    public void sayFullName() {
        System.out.println("My full name is " + name + " " + lastName);
    }
    public void checkForDiscount() {
        if(age > 18) {
            System.out.println(name + ", sorry no discount");
        } else {
            System.out.println(name + ", You got a discount!!");
        }
    }

}