
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class AssignmentFour {
	
	public static void main(String[] args) throws IOException {
	var path="C:\\Users\\SMANUEL\\OneDrive - Capgemini\\Desktop\\Java11Assignments_StudentList.txt";
	String regex = "\\s+";
     String data=Files.readString(Path.of(path));
     String[] strSplit = data.split(regex);
     
     System.out.println("The count is " + strSplit.length);
     System.out.println(data);
     
	}
}