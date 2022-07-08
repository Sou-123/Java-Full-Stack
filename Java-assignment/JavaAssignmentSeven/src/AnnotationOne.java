
@interface Test
{
	String custom() default"Test annotation done";
	}



@Test(custom=" Annotation on class")

class TestAnnotation{
	@Test(custom="Annotation on method")
	
	void show() {
			
			System.out.print("Demo");
		}
	
	
}
public class AnnotationOne extends TestAnnotation{
	
	public static void main(String []args) {
		TestAnnotation t= new TestAnnotation();
		t.show();
	}
	
	

}