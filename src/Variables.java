public class Variables {

    public static void main(String [] args) {

        //appending/concatenating/joining strings with a +
        System.out.print("my name is " + "jinbo");

        //print statements output on the same line as before
        System.out.print("bye");

        //can add "\n" as a string to go to a new line
        System.out.print("\nnew line");

        //println() - print line - adds a line break AFTER
        //the output string
        System.out.println("i'm hungry");
        System.out.println("i'm hungry");

        //Variables
        //-store data to a name

        //to set up a variable, you need to first declare it
        //with its data type and variable name

        String userName = "mishaIsAwesome123";

        //print the value stored in userName
        System.out.println(userName);
        //can append strings with variables
        System.out.println("You lose, " + userName);

        //to update the value of a variable, use the variable name
        //and assign it something else with the =
        userName = "something else";

        System.out.println("now my name is " + userName);

        //don't try to redeclare an existing variable - program won't
        //compile or run
        //String userName = "blah";

        //naming conventions - for multiple words, use
        //camelCase (first word lowercase, cap letter for any following words
        //or under_scores
        String best_friend = "bob";

        //appended strings can be saved to variables
        best_friend = "bob" + userName;
        System.out.println(best_friend);

        //= is the assignment operator
        //-first evaluate what's on the RIGHT of the =
        //-THEN save that value to the variable name on the left

        //(take the current value of userName and append steve)
        //(save that new value back to the userName variable)
        userName = userName + " steve";
        System.out.println(userName);

        //int is a numerical data type (integer)
        //-can hold whole numbers, including negatives and 0
        int num = 7;

        System.out.println("num is " + num);

        //invalid bc "jinbo" is a string but num is an int variable
        //which cannot hold string values
        //num = "jinbo";

        num = 25;
        System.out.println("now num is " + num);

        //similar as above - evaluate the right side of the =, then
        //assign that value to the left
        num = num + 75;
        System.out.println("num value: " + num);

        // + addition
        // - subtraction
        // * multiplication
        // / division
        // % modulo (mod) - gives the remainder after dividing

        // 13 DIVIDED by 5 is 2 remainder 3, mod only gives the remainder
        System.out.println( 13 % 5);

        //0 when there is no remainder - even division
        System.out.println(100 % 10);

        num = 3;
        num++; //add 1 - same as num = num + 1

        System.out.println(num);

        //similar for -- to subtract one, does not work for ** or //

        num += 2; //same as num = num + 2;
        System.out.println(num);
        //also works for -=, *=, /=

        System.out.println(9 / 3);

        //integer division - the result is only the whole number part
        //of the quotient
        System.out.println(9 / 2);

        //no rounding occurs - bc the answer SHOULD be 0.99
        //int division truncates (cuts off) any decimals
        System.out.println(99 / 100);

        System.out.println(10 / 3);

        //when both terms of a division operation are integers,
        //it will evaluate as int division and truncate any decimals

        //double is a numerical type that can hold decimal values
        double decimalNum = 4.8;
        //if one of the terms of the division is a double, then
        //a quotient with a decimal (double data type) will be
        //produced
        System.out.println(decimalNum/8);

        //can assign an int value to a double and it will be interpreted
        //as a double with a .0
        decimalNum = 5;
        System.out.println(decimalNum);

        System.out.println();

        //when at least one term of the division is a double,
        //you get a double as the evaluation
        System.out.println(99.0 / 100);
        System.out.println(99 / 100.0);
        System.out.println(99.0 / 100.0);

        //both these terms are ints (have no decimals) so int
        //division gets performed and any decimals get truncated
        System.out.println(99 / 100);
    }
}
