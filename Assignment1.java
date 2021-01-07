import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ASSIGNMENT 1 -NUMERICAL COMPUTATION & EXPRESSION 
		//1.	The program should ask detail personal background of customer
		//2.	The program should ask what product or services they provide
		//3.	Determine what price per quantity or how much the service charge per hour
		//4.	The program should ask customer how many item and quantity OR how many service they would like to order
		//5.	Calculate the total price need to be paid
		// Please use Scanner to get the input from the customer
		
		//26  	278751	Chong Chee Twau - Food/Drinks-Bread
		
		// Control structure selection (if/else statement)
		// Repetition structure (Loop using while/for/do while)

		String name, fm, ages;
		int  num1, num2, num3, num4, num5, num6, ans;
		long IC;
		double sum;
	
		System.out.println("Welcome to The Bakery House!");
		Scanner in = new Scanner (System.in);
				
		System.out.println("\n\tWhat would you like to do?");
		System.out.println("\t1. Buy Breads!");
		System.out.println("\t2. Just have a look!");
		System.out.println("\t3. Bye-bye!");
		
		String input = in.nextLine();
		if(input.equals("1")) {
			System.out.println("Welcome to The Bakery House!");
		}else if(input.equals("2")) {
			System.out.println("Welcome to The Bakery House......as well!");
		}else if (input.equals("3")) {
			System.out.println("Bye-bye?Maybe you can try to have a look!");
		}else 
			System.out.println("Invalid command!");
			
		
		//1.
		System.out.print("Enter your name: ");
		name = in.nextLine();
		System.out.print("Enter your age: ");
		ages = in.nextLine();
		//System.out.print("Enter your IC number: ");
		//IC = in.nextLong();
		System.out.print("Enter your gender :");
		fm = in.nextLine();
		System.out.println();
		
		//do while loop
		System.out.println("Please check your data again!");
		String[] data1 = {"Name", "Age", "Gender"};
		String[] data2 = {name, ages, fm};
		int i=0;
		do {
			System.out.println(data1[i] + "\t: " + data2[i]);
			i++;
		}while(i<data1.length);

		System.out.println();
		
		
		//2.&3.
		//System.out.println("Product provided(per one quantity): ");
		//System.out.println("White bread 	  = RM  5.00");
		//System.out.println("Wheat bread 	  = RM  7.00");
		//System.out.println("Whole Grain bread = RM  9.00");
		//System.out.println("Rye Bread 	  = RM  3.00");
		//System.out.println("French Bread 	  = RM 10.00");
		//System.out.println("Hot-Dog Bread 	  = RM 13.00");
		//System.out.println();
		//System.out.print("Please enter the code of product required: ");
		
		
		//For loop
		System.out.println("Product we provide with the price!");
		String[] breads = {"White bread = RM5.00", "Wheat bread = RM7.00", "Whole Grain bread = RM9.00", "Rye Bread = RM3.00", "French Bread = RM10.00", "Hot-Dog Bread = RM13.00"};
		for (String j : breads) {
			System.out.println(j);
		}
		System.out.println();		
			
		//4.
		System.out.println("Quantity of Item wanted: ");
		//integer1 = sc.nextInt();
		System.out.print("White Bread		=");
		num1 = in.nextInt();
		System.out.print("Wheat Bread 		=");
		num2 = in.nextInt();
		System.out.print("Whole Grain Bread  	=");
		num3 = in.nextInt();
		System.out.print("Rye Bread		=");
		num4 = in.nextInt();
		System.out.print("French Bread		=");
		num5 = in.nextInt();
		System.out.print("Hot-Dog Bread		=");
		num6 = in.nextInt();
		System.out.println();

		
		
		System.out.println("Please rate our service / shop quality!");
		System.out.println("Please enter either of the three rates below!");
		System.out.println("Excellent!");
		System.out.println("Good!");
		System.out.println("Still have room of improvement!");
		
		//while loop
		String rate1 = in.next();
		String[] rating = {rate1};
		int k = 0;
		while (k<rating.length) {
			System.out.println("I think the service / shop quality of The Bakery House is " + rating[k] + "!");
			k++;
		}
		
		
		System.out.println();
		
		 sum = ((num1*5) + (num2*7) + (num3*9) + (num4*3) + (num5*10) + (num6*13));
		 
			System.out.println("Total Price: RM " + sum);
			
			if (sum > 100) {
				System.out.println("Discount : RM" + sum*0.20);
				System.out.println("Price need to be paid : RM" + (sum-(sum*0.20)));
			}else if (sum < 100) {
				System.out.println("No Discount for this purchase!");
				System.out.println("Price need to be paid : RM " + sum);

				System.out.println();
		in.close();
}
	}
}
