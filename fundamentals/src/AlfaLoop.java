public class AlfaLoop {
    public static void main(String[] args) {

        char c = 'a';
        System.out.println(c);

        while (c <= 'z') {
            System.out.println(c);
            c++;
        }

        System.out.println();
        c = 'a';

        do {
            System.out.println(c);
            c++;
        } while (c <= 'z');

        System.out.println();

        for (c = 'a'; c <= 'z'; c++) {
            System.out.println(c);
        }

    }
}
