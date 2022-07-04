import java.util.Scanner;

public class ThirdAssignment {

	public static void main(String[] args) {
	
		double amount, rate, time, simpleInterest,compoundInterest;
        Scanner sc=new Scanner (System. in);
        System.out.println("Enter the amount:");
        amount=sc.nextDouble();
        System. out. println("Enter the number of months:");
        time=sc.nextDouble();
        System. out. println("Enter the rate of  interest");
        rate=sc.nextDouble();
        simpleInterest=(amount * time * rate/100);
        compoundInterest=amount * Math.pow(1.0+rate/100.0,time) - amount;
        System.out.println("Simple Interest="+simpleInterest);
        System.out. println("Compound Interest="+compoundInterest);
	}

}
