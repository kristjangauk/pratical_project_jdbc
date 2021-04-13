public class CharApp {

    public static void main(String[] args) {

        char c = 'a';
        System.out.println(c);
        System.out.println("\n");
        c = '8';
        System.out.println(c);
        System.out.println("hey \t wassup");

        System.out.println("=============");


        char c1 = '\u004E';
        char c2 = '\u005D';
        char c3 = (char)165; // ...casting
        char c4 = 78;
        c4 += 32;


        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);


        char sp = '\u0020';
        System.out.println("Yohan" + sp + "Wadia");



    }
}
//https://unicode-table.com/en/#control-character