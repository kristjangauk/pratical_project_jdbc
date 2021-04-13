public class StringsFive {

    public static void main(String[] args) {


        String s = "abcdefghij abcd defg";


        char c = s.charAt(9);
        System.out.println(c);

        System.out.println(s.indexOf( 'j' ));
        System.out.println(s.indexOf( 'X' ));//doesnt exist

        System.out.println( "===============" );

        System.out.println(s.indexOf( 'd' )); //1st occurence
        System.out.println(s.lastIndexOf( 'd' )); //last occurence

        //2nd occurence ???

        int x = s.indexOf('d');
        int y = s.indexOf('d', x+1);

        System.out.println("VALUE y: " + y);



        //how many times did it occur
        /*
        int count = 0;
        for(int i=0; i < s.length(); i++)
        {    if(s.charAt(i) == 'd')
            count++;
        }
        System.out.println("Letter d occurred: " + count);
        */





        System.out.println("===============" );

        String str = "JAVA is a Language, is a Coffee, is an Island. ";
        String find_str = "is";
        System.out.println(str.indexOf(find_str));
        System.out.println(str.lastIndexOf(find_str));
        System.out.println(str.length());

        //2nd occurence ???


        //count number of times word appears in string java





    }
}

/*
    int first = s.indexOf('d');
    int second = s.indexOf('d', first + 1);
        System.out.println(second);*/