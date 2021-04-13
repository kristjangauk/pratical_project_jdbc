public class VarargsEx {

    public void addition(int ... numbers){
        int total=0;
        for(int x : numbers){
            System.out.println("value of x: " + x);
            total = total + x;
        }
        System.out.println("Addition: " + total);
    }

    public void billInfo(String who, int ... numbers){

        int total=0;
        for(int x : numbers){
            total = total + x;
        }
        System.out.println("The bill for " + who + " is " + total);

    }


    public static void main(String[] args) {
        VarargsEx obj = new VarargsEx();
        obj.addition(1,2,3,4,5,6,1000);
        obj.billInfo("Yohan", 5,7,3);

    }

}

/*
 Rules to avoid compiling ERROR:
 There can be only one type that can have variable values in the method.
 That Variable Argument must be the last argument.
*/