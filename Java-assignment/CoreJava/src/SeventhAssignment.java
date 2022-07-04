import java.util.Scanner;

public class SeventhAssignment {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int i,j=0,flag=0,x;
		 System.out.println(" Enter the array elements");
		 int Arr[]=new int[15];
		 for(i=0;i<Arr.length;i++)
			 Arr[i]=s.nextInt();
		 System.out.println(" Enter the elements you want to find");
		 x=s.nextInt();
		 for(j=0;j<Arr.length;j++) {
			 
			 if(Arr[j]==x)
			 {
				 flag=1;
				 break;
			 }
			 else {
				 flag=0;
			 }
			 
		 }
		 if(flag==1) {
			 System.out.println(" Element found at position:"+(i+1));
		 }
	}
}


