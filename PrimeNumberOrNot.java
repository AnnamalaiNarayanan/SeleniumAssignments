package Week1.day1;

public class PrimeNumberOrNot {
	public static void main(String[] args) {

		int input=14;
		boolean varflag=false;

		for(int i=2; i<=7; i++)
		{
			if(input % i == 0)
			{
				varflag=true;
			}
			break;
		}

		if(varflag == true)
		{
			System.out.println("It is prime number");
		}
		else
		{
			System.out.println("It is not prime number");
		}
	}
}
