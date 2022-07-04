import java.util.Scanner;

public class FourthAssignment {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
        System.out.println("Enter the mark of first subject:");
        int subjectOne=s.nextInt();
        System.out.println("Enter the mark of second subject:");
        int subjectTwo=s.nextInt();
        System.out.println("Enter the mark of third subject:");
        int subjectThree=s.nextInt();
        if (subjectOne>=60 && subjectTwo>=60 && subjectThree>=60) {
            System.out.println("Passed");
        }
        else if (((subjectOne>=60 && subjectTwo>=60)) ||  ((subjectTwo>=60 && subjectThree>=60 )) || ((subjectThree>=60 && subjectOne>=60 ))) {
            System.out.println("Promoted");
        }
        else if(subjectOne>60|| subjectTwo >60|| subjectThree>60 || (subjectOne<60&&subjectTwo<60&&subjectThree<60)) {
            System.out.println("Failed");
        }
        else
        {
            System.out.println("Please enter valid details");
        }
    }

	}


