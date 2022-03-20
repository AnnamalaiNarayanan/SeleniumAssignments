package Week1.day1;

public class AssignmentsFibonacciSeries {
	public static void main(String[] args) {
	int firstNum=0;
	int secNum=1;
	int sum;
	System.out.println(firstNum);
	System.out.println(secNum);
	for(int i=2;i<8;i++)
	{
		sum=firstNum+secNum;
		firstNum=secNum;
		secNum=sum;
		System.out.println(sum);
		
	}
	
	}

}
