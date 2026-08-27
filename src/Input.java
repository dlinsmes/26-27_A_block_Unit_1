//Scanner is a built-in library that we use to
//get input from the user
import java.util.Scanner;

public class Input {

    public static void main(String [] args) {
        int age = 58;
        System.out.println(age + " years");

        //full decades

        //int division is helpful bc we don't want
        //the number of decades to round up, only down
        System.out.println(age / 10 + " decades");

        //remaining years not counted in a decade
        System.out.println(age % 10 + " remaining years");

        //can also calculate the long way:
        int remaining = age - ((age / 10) * 10);
        System.out.println(remaining + " remaining years (long way)");

        //calculate decades as a decimal
        //one of the division terms needs to be a double (have a decimal)
        System.out.println(age / 10.0 + " decades (as decimal)");

        //input - the user can type values into the keyboard to use as data
        //in the program

        Scanner input = new Scanner(System.in);

        //prompt for input
        System.out.println("what is your name?");
        //declare a variable to save the input value to

        //data type of the variable depends on the
        //value that you're saving

        //-String for name

        //input.nextLine() will wait for the user
        //to type something in and press enter
        String name = input.nextLine();

        System.out.println("hi " + name);

        System.out.println("tell me about your day, " + name);
        //input.next() will only get the first word before a space
        //input.nextLine() will get everything the user types before
        //pressing enter
        String response = input.next();

        System.out.println("your response was: " + response);

        System.out.println("what's your favorite whole number?");
        //next() and nextLine() both produce strings, but strings
        //cannot be saved to int variables
        //int num = input.nextLine();

        //use input.nextInt() when the input will be a whole number
        int num = input.nextInt();

        //note - if the user puts in input that isn't a number, the
        //program will crash - don't worry about it. assume the user
        //will comply with instructions

        System.out.println("your number times 2 is " + num*2);

        System.out.println("what's your favorite decimal number?");
        //nexctDouble() when the input is expected to have a decimal
        double dec = input.nextDouble();

        System.out.println(dec/10);

        //when switching from a numerical input back to a text input,
        //the following input.nextLine() will get skipped and won't
        //wait for input

        //to counter this, add an extra input.nextLine() that will
        //intentionally be the line that gets skipped so then
        //input will begin to get collected again

        //this gets skipped so that the next one will run
        input.nextLine();

        System.out.println("what's your favorite color?");
        String color = input.nextLine();
        System.out.println("your favorite color is " + color);

    }
}
