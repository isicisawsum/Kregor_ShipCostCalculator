import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //making inputting available for the user
        System.out.println("Enter the price of your item (in format of dollars.cents):"); //asking user to enter price of item


       // if(in.hasNextDouble())
      //  {
            double price = in.nextDouble(); //defining variable price
            in.nextLine(); //creating new line
            if (price >= 100.00)
            {
                System.out.println("The price of your item was $" + price + " which is greater than $100 so your shipping is free, leading to the same total price of $" + price); //outputting that there is no shipping cost
            }
        	else if (price > 0 && price < 100)
            {
                double shipping = price * 0.02;
                double total = price + shipping; //defining variables shipping and total to be used in the final output
                System.out.println("The price of your item was $" + price  + " which is less than $100 so you have an additional shipping cost of $" + shipping + " making the total cost be $"  + total); //outputting that there is additional shipping cost and the total
            }
        	else
            {
                System.out.println("You can’t enter a negative number!"); //outputting that user made a mistake
            }
        //}
       // else
       // {
       //     String bad = in.nextLine(); //defining variable bad for when user makes a mistake
       //     System.out.println("Pick a valid number, not " + bad); //telling user about their mistake
       // }

    }
}
