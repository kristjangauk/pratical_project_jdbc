

public class ConstantVariables {
//===========================================
    /*FINAL
    variables - are constants, can never be changed
    methods - you can never override a final method()
    class - stops Inheritance*/
//===========================================


    //Recommended way... declare and initialize together
    //Static is also recommended since it doesnt need to be changed in any Class' object
    static final String SECRET= "k^h$b{f@n%$#jlk098^%$#";
    static final double PI = 3.141592653589793;


    public static void main(String[] args) {
        ConstantVariables obj = new ConstantVariables();

        System.out.println(obj.PI);
        System.out.println(obj.SECRET);
        //Math.PI;
        //obj.PI= 12.3333;

        System.out.println("====================");

        System.out.println(ConstantVariables.PI);
        System.out.println(ConstantVariables.SECRET);

        //final String str= "xxxxx";
        //str = "abc";

    }


}
