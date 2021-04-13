

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcher {

        public static void main(String[] args) {
            String regex = "s..";//"S..\\s";
            String str = "See how soon we ship to San fran";//"see how soon we ship to san fran";

            Pattern pattern = Pattern.compile(regex);//(regex, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(str);

            //matcher.find() sees if there is a match, returns a boolean, and moves to the next match
            while (matcher.find()) {
                if(matcher.group().length()!=0){
                    System.out.println(matcher.group());
                    System.out.println("Starts: " + matcher.start());
                    System.out.println("Ends: " + matcher.end());
                }

            }

            System.out.println("\n");

            regex = "(?i)java";
            str = "Now we will be learning Regex for JAva or java or JAVA. email me yo@yo.com. telephone is +12345678.yoyoyoyoyo\n"
                    + "	for a tab\n\n"
                    + "A new line, with aa bbb cc and ccc and ccccc.\n"
                    + "abc is not the same as xyz. Neither is abcdefghij.";

            pattern = Pattern.compile(regex, Pattern.MULTILINE);
            matcher = pattern.matcher(str);

            while (matcher.find()) {
                if(matcher.group().length()!=0){
                    System.out.println(matcher.group());
                    System.out.println("Starts: " + matcher.start());
                    System.out.println("Ends: " + matcher.end());
                }
            }
        }
}
//https://youtu.be/s_PfopWcMwI
//https://regex101.com