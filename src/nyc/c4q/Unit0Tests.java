package nyc.c4q;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Unit0Tests {

    /*
     * Name of the method implies what the method should do.
     * Some of these methods require that the method return signature change.
     * For example, `returnPrimitiveBooleanTrue()` should return `boolean`, not `Object`.
     */
    public static void main (String args[]) {
      // Use main to test your methods
      printHelloWorld();
        System.out.println(returnPrimitiveBooleanTrue());
        System.out.println(returnPrimitiveInt1729());
        System.out.println(returnPrimitiveDoubleThreePointOneFour());
        System.out.println(returnPrimitiveCharZ());
        printSumOf1Upto10UsingForLoop();
        printSumOf1Upto10000UsingForLoop();
        System.out.println(isOdd(30));
        System.out.println(isOddAndIsMultipleOfThree(99));
        repeatStringXTimes("potato", 5);
        returnStringUntilQ("shaniqua");
        System.out.println(declareAndReturnPersonNamedAda());
        System.out.println(declareAndReturnPersonNamedAlanTuringFromLondon());
        System.out.println(isFromLondon(declareAndReturnPersonNamedAlanTuringFromLondon()));
        System.out.println(declareAndReturnArrayListOfThreePlaces());
        System.out.println(declareAndReturnHashmapOfAlanTuringAndGraceHopper());
        changeTuringsCityToPrinceton(declareAndReturnHashmapOfAlanTuringAndGraceHopper());
    }

    public static void printHelloWorld() {
      System.out.println("Hello World");
    }

    public static boolean returnPrimitiveBooleanTrue() {
      return true;
    }

    public static int returnPrimitiveInt1729() {
      return 1729;
    }

    public static double returnPrimitiveDoubleThreePointOneFour() {
      return 3.14;
    }

    public static char returnPrimitiveCharZ() {
        return 'z';
    }

    public static void printSumOf1Upto10UsingForLoop() {
        int sum = 0;
        for(int i = 1; i < 10; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);

    }

    public static void printSumOf1Upto10000UsingForLoop() {
        int sum = 0;
        for(int i = 1; i < 1000; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);

    }

    public static boolean isOdd(int n) {
      if (n % 2 != 0) {
          return true;
      } else {
          return false;
      }
    }

    public static boolean isMultipleOfThree(int n) {

        if (n % 3 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOddAndIsMultipleOfThree(int n) {

        if (n % 3 != 0 && n % 2 != 0)
        {
            return true;
        } else {
            return false;
        }
    }

    public static String repeatStringXTimes(String input, int times) {
        // Given string "input" and a positive integer "times",
        // return a string that is equal to the input string repeated X times.
        // If "times" is 0 negative, return a blank string.
        // For example, repeatStringXTimes("potato", 5) should return "potatopotatopotatopotatopotato".

        if (times == 0 || times < 0) {
            System.out.println("");
        }

        for (int i = 0; i < times; i++) {
            System.out.print(input);
        }
        System.out.println("");


        return "";
    }

    public static String returnStringUntilQ(String input) {
        // Given string "input", return a string that stops at the first occurrence of the character 'q'.
        // For example, given the string "ubiquitous", return "ubi".
        // If the string does not contain a q, then return the empty string "".

        for (int i = 0; i < input.length(); i++) {
           if (input.charAt(i) == 'q')
           {
               break;
           } else {
               System.out.print(input.charAt(i));;
           }
        }
        System.out.println("");

        return "";
    }

    public static Person declareAndReturnPersonNamedAda() {
      Person ada = new Person("Ada");

        return ada;
    }

    public static Person declareAndReturnPersonNamedAlanTuringFromLondon() {
      Person alan = new Person("Alan");
        alan.setCity("London");

        return alan;
    }

    public static boolean isFromLondon(Person person) {
      if (!person.getCity().equalsIgnoreCase("london"))
      {
          return false;
      } else {
          return true;
      }
    }

    public static ArrayList<Place> declareAndReturnArrayListOfThreePlaces() {
        ArrayList<Place> places = new ArrayList<Place>();

        Place thailand = new Place("Thailand");
        Place paris = new Place("Paris");
        Place cancun = new Place("Cancun");


        places.add(thailand);
        places.add(paris);
        places.add(cancun);

        return places;
    }

    public static HashMap<String, Person> declareAndReturnHashmapOfAlanTuringAndGraceHopper() {
      // The HashMap should have key-value pairs of:
      // - key: `Alan Turing`, value: instance of Person with name `Alan Turing`
      // - key: `Grace Hopper`, value: instance of Person with name `Grace Hopper`

        HashMap<String, Person> peoples = new HashMap<String, Person>();

        Person alanTuring = new Person();
        Person graceHopper = new Person();

        peoples.put("Alan Turing", alanTuring);
        peoples.get("Alan Turing").setCity("London");
        peoples.put("Grace Hopper", graceHopper);
        peoples.get("Grace Hopper").setCity("Arlington");

      return peoples;
    }

    public static void changeTuringsCityToPrinceton(HashMap<String, Person> people) {
        people.get("Alan Turing").setCity("Princeton");
    }

    // Bonus Problems
    public static void bonusPrintOutSumOfFirstTenFibonacciNumbers() {

    }

    public static void bonusPrintOutSumOfFirstFortyFibonacciNumbers() {

    }
}
