package Week1.day1;

public class PositiveNegativeNumber {
	public static void main(String[] args) {

		int number= -440;
		if(number <=0)
		{
			System.out.println("The number " + number + " is negative");
			int positivenumber= number -number -number;
			System.out.println("The negative number " + number + " is converted to positive " + positivenumber );
		}
		int num=35;
		if(num<=0)
		{
			System.out.println("The number is negative");
		}
		else if (num>=0) {
			System.out.println("The number is positive");
		}
		else
		{
			System.out.println("The number is neither positive or negative");
		}
}
}