//built in library that lets us get keyboard input
import java.util.Scanner;

public class VariablesAndInput {

    public static void main (String [] args) {
        //use + to concatenate/append/join strings
        System.out.print("my name is " + "brandon");

        //print() will output on the same line as before
        System.out.print("hi");

        //"\n" will output a line break
        System.out.print("\nnew line");

        //println() will make a line break AFTER what gets output
        System.out.println("something");

        System.out.println("now it's a new line");

        //variables - hold data that get assigned to names

        //similar to app lab - to declare use var x = 7

        //in java, need to specify data types

        //declare a variable of the String data type named word
        //and assign the value "hello"
        String word = "hello";

        System.out.println(word);

        //assign a different value
        word = "hi";
        System.out.println(word);

        //don't redeclare an existing variable (take out the data type)
        //String word = "hi";

        //ints are integers - whole numbers, incl 0 and negatives
        int num = 8;

        //num is an int variable so it can't hold other types of data
        //num = "potato"

        // = is the assignment operator
        //-first you evaluate what's on the RIGHT (take the val of num and add 2)
        //-second you assign that evaluation to the variable on the LEFT
        num = num + 2;

        System.out.println(num);

        //+ add, - subtract, * multiply, / divide, % modulo (mod)

        //3 bc there's a remainder of 3 after dividing 13 by 5
        System.out.println(13 % 5);

        System.out.println(10 % 5);

        //add 1 and save the new value back to num
        num++; //same as num = num + 1

        //num-- also works, (no ** // %%)

        num += 2; //same as num = num + 2
        //can also do -=, *=, /=, %=

        System.out.println("12 / 3 is " + 12 / 3);

        System.out.println("9 / 2 is " + 9 / 2);

        System.out.println("10 / 3 is " + 10 / 3);

        System.out.println("99 / 100 is " + 99 / 100);

        //when both terms of division are ints (no decimals)
        //int division occurs which means that any decimals
        //in the outcome get truncated (cut off)
        //-only the whole number part of the quotient gets kept
        //-never rounds up, only down

        //double - numerical data type that can hold decimals
        double dec = 9.5;
        //when at least one term of the division is a double (has a decimal)
        //then division will evaluate as a decimal
        System.out.println(dec / 10);

        dec = 2; //can assign int values to double variables and the .0 will get added
        System.out.println(dec);

        //can't assign a decimal number to an int var that wants a whole number
        //int num2 = 3.4;

        System.out.println();

        //double division - at least one term is a double (has a decimal)
        System.out.println(99.0 / 100);
        System.out.println(99 / 100.0);
        System.out.println(99.0 / 100.0);

        System.out.println(99 / 100); //int division - 0




        //input - allow the user to provide data via the keyboard for
        //use in the program

        //scanner object named input that will let us get what the user
        //types
        Scanner input = new Scanner(System.in);

        //prompt for input with a print statement
        System.out.println("what is your name?");

        //the program will pause and wait for the user to type something
        //and press enter
        //declare a string variable to save the user's input to
        String name = input.nextLine();

        System.out.println("hi " + name);

        System.out.println("tell me about your day");

        //.next() will only get the first input word before there's a space
        String day = input.next();
        System.out.println("response: " + day);

        System.out.println("how old are you?");
        int age = input.nextInt(); //nextInt() when the expected input is an int
        System.out.println("Your age int divided by 2 is " + age/2);

        System.out.println("tell me what pi is");
        double pi = input.nextDouble(); //nextDouble() when the expected input has a decimal
        System.out.println("your pi is " + pi);

        //stupid annoying scanner quirk - when you switch from
        //a numerical input to a string input, the first input.nextLine()
        //gets skipped

        //-add this extra input.nextLine() to intentionally get skipped
        //so then the color prompt will correctly pause and wait for input
        input.nextLine();

        //ask for favorite color, save to variable, print out favorite color
        System.out.println("favorite color?");
        String color = input.nextLine();
        System.out.println("your color is " + color);

    }

}
