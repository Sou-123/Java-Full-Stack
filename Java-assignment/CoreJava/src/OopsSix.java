
abstract class Persistence{
	abstract void persist();
	
}
class FilePersistence extends Persistence{
	public void persist() {
		System.out.print("The Persist is in FilePersistence");
		
	}
	
}
class DatabasePersistence extends Persistence{
	public void persist() {
		System.out.print("The Persist is in DatabasePersistence");
		
	}
	
}
public class OopsSix {
	public static void main(String args[]) {
		FilePersistence file=new FilePersistence();
		file.persist();
		DatabasePersistence data=new DatabasePersistence();
		data.persist();
	}

}