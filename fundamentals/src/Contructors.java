

public class Contructors {

    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println("MyCar specs: " + myCar.color + " | " + myCar.maxSpeed);
        myCar.maxSpeed = 50;
        myCar.color = "Red";
        System.out.println("MyCar specs: " + myCar.color + " | " + myCar.maxSpeed);

        System.out.println("\n===========================");




        Audi audi1 = new Audi();
        Audi audi2 = new Audi("black",100,true);
        Audi audi3 = new Audi(true);

        audi1.getSpecifications();
        audi2.getSpecifications();
        audi3.getSpecifications();
    }

}

//========================================================
//differecnt type of classes

class Car{
    String color;
    int maxSpeed;

    public Car(){ }
}


class Audi{
    String color;
    int max_Speed;
    boolean SUV;

    public Audi(){ }//........1

    public Audi(String color, int max_Speed, boolean SUV){//.....2
        this.color = color;
        this.max_Speed = max_Speed;
        this.SUV = SUV;
    }

    public Audi(boolean SUV){//..........3
        this.SUV = SUV;
    }//.......3




    public void getSpecifications(){
        System.out.println("Color: " + color);
        System.out.println("MaxSpeed: " + max_Speed);
        System.out.println("SUV: " + SUV);
        System.out.println("===================");
    }

}