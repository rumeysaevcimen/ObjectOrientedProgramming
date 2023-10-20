import java.util.*;
import java.text.*;
public class Nsb2 {
    public static void main(String[] args) {
        String fullName, firstName, lastName, space;

        fullName = new String("Decafe Latte");
        space    = new String(" ");

        firstName = fullName.substring(0, fullName.indexOf(space));
        lastName  = fullName.substring(fullName.indexOf(space) + 1, fullName.length());

        System.out.println("Full Name: " + fullName);
        System.out.println("First: " + firstName);
        System.out.println("Last: " + lastName);
        System.out.println("Your last name has: " + lastName.length( ) + " characters.");

        Date today;
        SimpleDateFormat sdf;

        today = new Date();
        sdf   = new SimpleDateFormat("MM, EEEE, hh");

        System.out.println(sdf.format(today));

    }
}
