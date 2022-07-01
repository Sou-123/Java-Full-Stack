import java.util.Scanner;

public class FirstAssignment {

	public static void main(String[] args) {
		
		int number,armstrong=0,temp,remainder;
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter a number");
		number=sc.nextInt();
		temp=number;
		while(temp>0)
		{
			remainder=temp%10;
			armstrong=armstrong+(remainder*remainder*remainder);
			temp=temp/10;
		}
		if(armstrong==number) {
			System.out.println("The number is Armstrong");
		}
		else {
			System.out.println("The number is not Armstrong");
			
		}
	
	}
}


		
