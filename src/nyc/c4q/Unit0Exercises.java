package nyc.c4q;

import javax.lang.model.element.NestingKind;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Unit0Exercises {
    /*
     * Name of the method implies what the method should do.
     * Some of these methods require that the method return signature change.
     * For example, `returnPrimitiveBooleanTrue()` should return `boolean`, not `Object`.
     * additional information in the comments of each method
     */
    public static void main (String args[]) {
        // Use main to test your methods
        //print();
        //System.out.println(returnPrimitiveCharASCII35());
        System.out.println(returnSumOfTheFirst200MultiplesOf3());
       // System.out.println(alternateS1AndS2Xtimes("ja", "xy", 5));

        //changeJayZsLocationToLosAngeles(returnSingers());
    }

    public static void print() {
        // print out "I'm sorry Dave, I'm afraid I can't let you do that."
        System.out.println("I'm sorry Dave, I'm afraid I can't let you do that.");
    }  //done

    public static boolean returnPrimitiveBooleanFalse() {
        return false;
    } //done

    public static int returnPrimitiveInt55Plus44() {
        return 55+44;
    } //done

    public static double returnPrimitiveDouble2Point718() {
        // This is the start of a famous mathematical constant.
        // What's that constant?
        return 2.718;
    } //done

    public static char returnPrimitiveCharASCII35() {
        // What's the character for the ASCII number 35?
        // Look at an ASCII table and return that character.
        // You can look at the ASCII table at http://www.asciitable.com/
        return (int) 35 ;
    } //done

    public static boolean isEven(int n) {
        return n % 2 == 0;
    } //done

    public static boolean isMultipleOfX(int n, int x) {

        // 0 is a multiple of every number (except 0)
        // For example:
        //      isMultipleOfX(0, 3) == true
        //      isMultipleOfX(1, 3) == false
        //      isMultipleOfX(3, 3) == true
        //      isMultipleOfX(10, 3) == false
        //      isMultipleOfX(28, 7) == true
        // TODO expect a ArithmeticException in Test with x==0
        return n % x == 0;
    } //done

    public static int returnSumOfOddNumbersBetween1And100() {
        int sum = 0;
        for (int i = 0; i < 100; i++ ) {
            if (i%2 != 0) {
                System.out.println(i);
                sum +=i;
            }

        }

        // Starts with [1, 3, 5, ...]
        // Ends with   [..., 95, 97, 99]
      return sum;
    } //done

    public static int returnSumOfTheFirst200MultiplesOf3() {
        int x = 0;
        for (int i = 0; i <= 597; i++) {
            if (i % 3 == 0) {
                x += i;
                System.out.println(x);
            }
        }


        // Starts with [0, 3, 6, ...]
        // Ends with   [..., 591, 594, 597]
      return x;

    }

    public static boolean isEmptyString(String str) {
        return str.isEmpty();
    } //done

    public static String alternateS1AndS2Xtimes(String s1, String s2, int x) {
        String data = "";
        if (x == 0) {
            return "";
        } else {
            for (int i = 0; i < x; i++) {
                data += s1 + s2;
            }
        }

        // Given string `s1`, `s2` and a positive integer `x`,
        // return a string that is equal to s1 + s2 repeated x times.
        // If x is 0 or negative negative, return an empty string `""`.
        // For example:
        //      alternateS1AndS2Xtimes("abra", "cadabra", 0).equals("") == true
        //      alternateS1AndS2Xtimes("abra", "cadabra", 1).equals("abracadabra") == true
        //      alternateS1AndS2Xtimes("abra", "cadabra", 2).equals("abracadabraabracadabra") == true
        //      alternateS1AndS2Xtimes("abra", "cadabra", 3).equals("abracadabraabracadabraabracadabra") == true
        return data;
    } //done

    public static String stringSplit(String s, String splitOn) {

        String nString = "";
        String two = "";
        int count = 0;

        for (int i = 0; i <= s.length(); i++) {

            if (nString.contains(splitOn)) {
                for (int x = count; x >0; x--) {
                    two += nString.charAt(x);

                    return two;
                }
            }
            nString += s.charAt(i);
            count++;

        }




        // Given string s, return a string that stops at the first occurrence of "split".
        // For example:
        //      stringSplit("ubiquitous", "q").equals("ubi") == true
        //      stringSplit("hellogoodbye", "good").equals("hello") == true
        //      stringSplit("fancy seeing you", "there").equals("") == true
        // If the string does not contain split, then return the empty string "".
        return "";
    }

    public static Singer returnBeyonce() {
        Singer singer = new Singer("Beyonce", "USA");

      // should return an instance of Singer with the name "Beyonce" and location "USA"
      return singer;
    }

    public static Singer returnSingerChild(Singer s1, Singer s2) {
        Singer joe = new Singer(s1.getName(), s2.getLocation());
      // should return an instance of Singer with the name of s1 and the location of s2.
      // For example:
      //      Singer queenB = new Singer("Beyonce", "USA");
      //      Singer rihanna = new Singer("Rihanna", "Barbados");
      //      returnSingerChild(queenB, rihanna) ==> returns an instance of Singer with name "Beyonce" and location "Barbados".
      return joe;
    }

    public static HashMap<String, Singer> returnSingers() {
        Singer beyonce  = new Singer("Beyonce", "USA");
        Singer jayz  = new Singer("Jay-Z", "USA");
        Singer bieber  = new Singer("Bieber", "Canada");
        Singer drake  = new Singer("Drake", "Canada");
        Singer jepsen  = new Singer("Jepsen", "Canada");

        HashMap<String, Singer> list = new HashMap<String, Singer>();

        list.put("Beyonce", beyonce);
        list.put("Jay-Z", jayz);
        list.put("Bieber", bieber);
        list.put("Drake", drake);
        list.put("Jepsen", jepsen);

        // should return a HashMap of the following singers:
        //      key="Beyonce",  Singer(name="Beyonce", location="USA")
        //      key="Jay-Z",    Singer(name="Jay-Z",   location="USA")
        //      key="Bieber",   Singer(name="Bieber",  location="Canada")
        //      key="Drake",    Singer(name="Drake",   location="Canada")
        //      key="Jepsen",   Singer(name="Jepsen",  location="Canada")
        return list;
    }

    public static boolean isFromCanada(Singer person) {

        return person.getLocation().equals("Canada");
    }

    public static void changeJayZsLocationToLosAngeles(HashMap<String, Singer> people) {


        for (Singer list : people.values()) {
            if (list.getName().equals("Jay-Z")){
                list.setLocation("Los Angeles");
            }

        }



        // people will have the values of the `returnSingers()` method you filled in previously.
        // the city should be set to "Los Angeles"
        // old value of Jay-Z:
        //      Singer(name="Jay-Z",   location="USA")
        // new value of Jay-Z:
        //      Singer(name="Jay-Z",   location="Los Angeles")
    }

    public static void removeJepsenFromSingers(HashMap<String, Singer> people){

        for (String list : people.keySet()) {
            if (list.equals("Jepsen")){
                people.remove(list);
            }

        }

        // people will have the values of the `returnSingers()` method you filled in previously.
        // old keys in `people`:
        //  ["Beyonce", "Jay-Z", "Bieber", "Drake", "Jepsen"]
        // new keys in `people`:
        //  ["Beyonce", "Jay-Z", "Bieber", "Drake"]





    }

//    // Bonus Problems
//    public static void readFileAndOnlyPrintCanadianCelebrities() {
//        // TODO Use Apache Commons CSV and provide boilerplate for reading the file
//        // https://commons.apache.org/proper/commons-csv/
//      try {
//        FileReader fr = new FileReader("celebrities.csv");
//      } catch (FileNotFoundException e) {
//        e.printStackTrace();
//      }
//    }
//
//    public static void readFileAndPrintCelebrityAges(){
//        // TODO similar as above
//    }
}
