

public class MyMethods {

    int count=0;
    String name = "Kristjan";


    public void increaseCount(){
        count++;
    }

    public void increaseCountBy(int x){

        count = count + x;
    }

    public int add_numbers(int a, int b, int c){

        int sum = 0;
        sum = a + b + c;

        return sum;
    }

    public String add_lastName(String str){

        name = name + " " + str;

        return name;
    }


    public boolean isNameCorrect(String vardas){
        boolean correct=false;

        if(name.equals(vardas)){
            correct = true;
        }

        return correct;
    }


    public static void main(String[] args) {
        MyMethods m = new MyMethods();

        m.increaseCount();
        System.out.println("1... " + m.count);
        m.increaseCount();
        m.increaseCount();
        System.out.println("2... " + m.count);

        m.increaseCountBy(5);
        m.increaseCountBy(6);
        System.out.println("2... " + m.count);


        int answer = m.add_numbers(12,15,99);
        System.out.println("3... " + answer);


        String ans = m.add_lastName("Gauk");
        System.out.println("4... " + ans);


        boolean reply = m.isNameCorrect("Kristjan Gauk");
        System.out.println("5... " + reply);
    }


}
