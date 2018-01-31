import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {
		
		NumberFormat formatter = new DecimalFormat("#0.000");
		int atBat;
		int numBases = 0;
		int basesSum = 0;
		int successfulAtBats = 0;
		double batAvg;
		double slugPer;
		String userResponse = "y";

		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to the Batting Average Calculator!");
		System.out.println();

		while (userResponse.equalsIgnoreCase("y")) {

			System.out.print("Enter a number of times at bat:  ");
			atBat = scan.nextInt();
			scan.nextLine();
			System.out.println();

			System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");
			System.out.println();

			for (int i = 0; i < atBat; i++) {
				System.out.print("Result for at-bat " + i + ":  ");
				numBases = scan.nextInt();
				scan.nextLine();

				switch (numBases) {

				case 1:
					successfulAtBats += 1;
					basesSum += 1;
					break;

				case 2:
					successfulAtBats += 1;
					basesSum += 2;
					break;

				case 3:
					successfulAtBats += 1;
					basesSum += 3;
					break;

				case 4:
					successfulAtBats += 1;
					basesSum += 4;
					break;
				
				default:
					break;
				}
			}
			
			batAvg = (double) successfulAtBats / (double) atBat;
			slugPer = (double) basesSum / (double) atBat;

			System.out.println();
			System.out.println("Batting average: " + formatter.format(batAvg));
			System.out.println("Slugging Percentage: " + formatter.format(slugPer));
			System.out.println();
			System.out.println("Another batter? (y/n): ");
			userResponse = scan.nextLine();

		}

		System.out.println();
		System.out.println("Thank you for using the Batting Average Calculator");
		System.out.println("Goodbye!");
		scan.close();

	}

}