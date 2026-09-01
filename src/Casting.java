import java.util.Scanner;

public class Casting {

    public static void main(String[] args) {

    //warm up
    //prompt for two numbers
    //output the quotient of the first divided by the second
        Scanner input = new Scanner(System.in);
        System.out.println("give me number");
        int num = input.nextInt();

        System.out.println("give me more number");
        double num2 = input.nextInt();

        //when both division operands are ints, int division is performed
        //only the whole number is kept and any decimals get truncated

        //to get a decimal in your division quotient, at least one term needs to be
        //a double (have a decimal)
        System.out.println(num + " / " + num2 + " is " + num/num2);

        //double variables CAN be assigned int values, and .0 will be added
        //automatically
        double d = 12;
        System.out.println(d);

        int a = 8;
        int b = 16;
        //can also cast (convert) an int variable to a double
        System.out.println(a);

        //to cast a into a double:

        //when you cast a value, only the term immediately to the right
        //of (double) gets converted to the other type
        System.out.println( (double)a  );

        //= assignment operator - right side first (9 / 2 gives 4)
        //THEN assign 4 to the double variable c and get 4.0

        double c = 9 / 2;
        System.out.println(c);

        //9.0/2
        c = (double) 9 / 2;
        System.out.println(c);

        // 9/2.0
        c = 9 / (double) 2;
        System.out.println(c);

        //order of operations - 9 / 2 gets evaluated to 4,
        //then gets cast to a double
        c = (double)(9 / 2);
        System.out.println(c);

        //can also cast a double into an int
        int x = (int)2.9;

        //any decimals will get truncated, NOT rounded
        System.out.println(x);

        //normal rounding - if the decimal is .5 or higher
        //move up to the next whole number, otherwise keep the
        //existing, unchanged whole number

        double toRound = 3.9;

        //apply the regular rounding rule and save the result to
        //an int variable

        //add .5 to the initial value, THEN cast as an int
        int rounded =  (int)(toRound + .5)  ;
        System.out.println(toRound + " rounded is " + rounded);

        //doubles can evaluate with slight imprecision

        d = 9.7 - 2.2;
        System.out.println(d);

        d = 9.7 - 2.1;
        System.out.println(d);

        d = 47.49 % 1;
        System.out.println(d);

        d = 9.7 - 2.2;
        d = 7.31;
        //try to round to one decimal place so that you get number.x
        System.out.println(d);

        //move the decimal so that the whole number includes the place value
        //that should be kept
        System.out.println(d * 10);
        //THEN round to an int
        double mult = d * 10;
        int multRound = (int)(mult+0.5);
        System.out.println(multRound);

        //move the decimal back to where it was
        //-make sure to use double division to keep the desired decimal
        System.out.println(multRound / 10.0);


    }
}
