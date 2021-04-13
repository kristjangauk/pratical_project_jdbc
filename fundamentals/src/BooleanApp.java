public class BooleanApp {

    public static void main(String[] args) {

        boolean paid_fees = true;

       System.out.println(paid_fees);


        //if(paid_fees==true){
       if(paid_fees){
           System.out.println("YES fees paid");
       }
       else{
           System.out.println("NO NO NO");
       }

        System.out.println("============");

       paid_fees = !paid_fees;
       System.out.println(paid_fees);

        paid_fees = !paid_fees;
        System.out.println(paid_fees);

        System.out.println(!paid_fees);
        System.out.println(paid_fees);



    }

}
