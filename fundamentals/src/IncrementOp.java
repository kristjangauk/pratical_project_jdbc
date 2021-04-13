public class IncrementOp {

    public static void main(String[] args) {

        int a = 10;

        a = a + 1;
        a++;

        a = a - 1;
        a--;
        //a**; error  & a//.. ?

        System.out.println("Value of a = " + a);

        System.out.println("==================\n");

        a= a+2;
        a+=2;
        a+=5;

        System.out.println("value of a = " + a);
        //HW try a--; a-=5;

        System.out.println("=================\n");

        a=10;
        a = a * 10;
        a*=10;

        a/=10;

        System.out.println("multiplied a = " + a);
        System.out.println("=================\n");

        int x =0;
        x++;
        System.out.println("Post Increment: " + x++);
        System.out.println("Pre Increment: " + ++x);
        System.out.println(x);

        System.out.println("=================\n");

        x=10;
        int ans = 2 * (x+1);
        //int ans = 2 * (x++);//try with ++x
        System.out.println("ans = " + ans);
        System.out.println("x = " + x);











    }//psvm
}
