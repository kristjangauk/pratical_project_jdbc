public class ValueOf {
    public static void main(String[] args) {

        float f = 13.55f;
        int i = 15;

        String str_F = String.valueOf(f);
        System.out.println(str_F);

        String str_I = String.valueOf(i);
        System.out.println(str_I);


        System.out.println("==============\n");

        String str1= "101.99";
        String str2= "100";

        f = Float.valueOf(str1);
        i = Integer.valueOf(str2);

        System.out.println("Float: " + f);
        System.out.println("Integer: " + i);

    }
}
