import java.util.Scanner;

public class NinthAssignment {

	public static void main(String[] args) {
		
		int sOneA, sOneB, sOneC, sTwoA, sTwoB, sTwoC, sThreeA, sThreeB, sThreeC;
		System.out.println(" Enter the marks scored by student one");
		Scanner s=new Scanner(System.in);
		
		System.out.println(" Enter the marks obtained in subject A");
		sOneA=s.nextInt();
		System.out.println(" Enter the marks obtained in subject B");
		sOneB=s.nextInt();
		System.out.println(" Enter the marks obtained in subject C");
		sOneC=s.nextInt();
		int sOnetotal=sOneA+sOneB+sOneC;
		int sOneavg=sOnetotal/3;
		System.out.println("Total marks obtained by student one:"+sOnetotal);
		System.out.println(" Average marks obtained by student one:"+sOneavg);
		
		
		System.out.println(" Enter the marks scored by student two");
		System.out.println(" Enter the marks obtained in subject A");
		sTwoA=s.nextInt();
		System.out.println(" Enter the marks obtained in subject B");
		sTwoB=s.nextInt();
		System.out.println(" Enter the marks obtained in subject C");
		sTwoC=s.nextInt();
		int sTwototal=sTwoA+sTwoB+sTwoC;
		int sTwoavg=sTwototal/3;
		System.out.println("Total marks obtained by student two:"+sTwototal);
		System.out.println(" Average marks obtained by student two:"+sTwoavg);
		
		
		System.out.println(" Enter the marks scored by student three");
		System.out.println(" Enter the marks obtained in subject A");
		sThreeA=s.nextInt();
		System.out.println(" Enter the marks obtained in subject B");
		sThreeB=s.nextInt();
		System.out.println(" Enter the marks obtained in subject C");
		sThreeC=s.nextInt();
		int sThreetotal=sThreeA+sThreeB+sThreeC;
		int sThreeavg=sThreetotal/3;
		System.out.println("Total marks obtained by student three:"+sThreetotal);
		System.out.println(" Average marks obtained by student three:"+sThreeavg);
		
		int A=sOneA+sTwoA+sThreeA;
		int Aavg=A/3;
		System.out.println("Total marks obtained by three students in subject A:"+A);
		System.out.println(" Average marks obtained by three students in subject A:"+Aavg);
		
		int B=sOneB+sTwoB+sThreeB;
		int Bavg=B/3;
		System.out.println("Total marks obtained by three students in subject B:"+B);
		System.out.println(" Average marks obtained by three students in subject B:"+Bavg);
		
		int C=sOneC+sTwoC+sThreeC;
		int Cavg=C/3;
		System.out.println("Total marks obtained by three students in subject C:"+C);
		System.out.println(" Average marks obtained by three students in subject C:"+Cavg);
		
		
		
		}
}
