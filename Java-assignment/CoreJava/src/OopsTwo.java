class employee{
	int total1;
	int total(int sal,int incen) {
		total1=sal+incen;
		return total1;
	}
}	
	class mang extends employee{
	
		int total(int sal,int incen) {
			total1 = sal+ incen;
			return total1;
		}
		
		
	}
	class lab extends employee{
		int total(int sal,int over) {
			total1 = sal+ over;
			return total1;
		}
	}

 public class OopsTwo{
	public static void main(String args[]){ 
		int t,t1,t2,t3;
		mang m1=new mang();
		
		t=m1.total(20000,2000);
		t3=m1.total(15000,1000);
		lab l1=new lab();
		t1=l1.total(25000,3000);
		t2=t1+t+t3;

		System.out.println("total :"+ t1);
		System.out.println("total :"+ t);
		System.out.println("total :"+ t2);
		
	}
}