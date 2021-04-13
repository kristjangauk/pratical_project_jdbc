
public class StringRegex {

    public static void main(String[] args) {

        String names = "Mr.A, Mr.B, Mr.C, Mr.D, Mr.E";

        String[] vardas = names.split(",");// ("\\s");  (",\\s");

        for (String s :  vardas) {
             System.out.println(s);
        }
    }
}
