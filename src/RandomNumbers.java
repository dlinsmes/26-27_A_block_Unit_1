import java.util.Scanner;

public class RandomNumbers {

    public static void main(String [] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("how much is potato?");
//        double unitCost = input.nextDouble();
//        System.out.println("how many potato?");
//        int num = input.nextInt();
//
//        double taxPercent = 0.075;
//
//        double taxAmt = unitCost * taxPercent * num;
//        System.out.println("tax on " + num + " potatoes is $" + taxAmt);
//
//        //normal math order of operations - PEMDAS
//        //mult and div have the same priority and will run left to right
//        //-modulo falls in the same priority as mult and div
//        //add and subtract have the same priority after */%
//        double total = taxAmt + unitCost * num;
//
//        System.out.println("your total is: $" + total);
//
//
//        //-move the decimal to allow the place values desired
//        //to be ints
//        //-then cast as int to either truncate or round the remaining
//        //decimal
//        //-then move the decimal back to where it's supposed to be
//
//        double movedDecimal = total * 100;
//        System.out.println("moved decimal: " + movedDecimal);
//
//        int moneyInt = (int)(movedDecimal + 0.5);
//        System.out.println("money int: " + moneyInt);
//
//        //make sure to use double division by dividing by 100.0
//        //otherwise the desired cents get lost
//        double roundedAmt = moneyInt / 100.0;
//        System.out.println("rounded amt: " + roundedAmt );

        System.out.println("random numbers");

        //Math.random() will produce a random double
        //in the range [0,1);
        //it's possible for 0 to be produced, but never 1
        //-always 0.something

        double r = Math.random();
        System.out.println(r);

        //expand the range of generated double values to be between [0,5)
        //since Math.random() by itself is exclusive of 1, then when you
        //multiply that by x, the int value will always be less than x
        r = Math.random() * 5;
        System.out.println(r);

        //generate random ints [0,5) - same as [0,4]

        //this will always produce 0 bc only the term immediately to the right
        //of (int) will get cast.
        //since Math.random() produces 0.something, this will always cast to 0
        //then multiply 0 by anything and you get 0
        int random = (int) Math.random() * 5;
        System.out.println(random);

        //-NEED to include the multiplication before casting
        //[0,4]
        //-lowest produced int is 0, highest is 4
        random = (int)(Math.random() * 5);
        System.out.println(random);

        //generate random ints [1,5]
        //adding 1 to a range of [0, 4] will give [1, 5]
        random = (int)(Math.random() * 5 ) + 1;
        System.out.println(random);

        // [10, 20]

        //-multiplier is how many values fall in the produced range
        //-addition is the offset (starting value of your produced range)
        //-desired range is [min, max]
        //(int)(Math.random() * (max-min+1)) + min
        random = (int)(Math.random() * 11) + 10;
        System.out.println(random);

    }
}
