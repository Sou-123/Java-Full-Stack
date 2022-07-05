import java.util.Scanner;

public class ExceptionThree {
	
	static void bank() throws IllegalAccessException
    {
        double balance = 0, depositedAmount, withdrawalAmount;

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the deposited amount:");
        depositedAmount =sc.nextInt();
        balance=balance+ depositedAmount;

        Scanner s=new Scanner(System.in);
        System.out.println("Please enter the amount to be withdrawn:");
        withdrawalAmount=s.nextInt();
        balance= balance-withdrawalAmount;


        if ( withdrawalAmount<-1)
        {
            throw new IllegalAccessException();
        }
        else
            System.out.println("Withdrawal amount:"+withdrawalAmount);
        System.out.println("Balance in the account:"+balance);
    }

    public static void main(String args[])
    {

        try {
            bank();
        }
        catch(IllegalAccessException e) {
            System.out.println(" Warning :Not enough balance!! ");
        }
    }
}


