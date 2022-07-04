import java.util.Scanner;

public class SixthAssignment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.println("Please enter your username");
        String userName = sc.nextLine();

        System.out.println("Please enter your password");
        String userPassword = sc.nextLine();

        System.out.println( " WELCOME "+userName+"!!" );

        System.out.println(" Enter your login credentials");

            System.out.println("Please enter your username");
            String loginName = sc.nextLine();

            System.out.println("Please enter your password");
            String loginPass = sc.nextLine();

        while (count <= 2) {

            if ((!userName.equals(loginName)) || (!userPassword.equals(loginPass))) {
                System.out.println("WARNING: USERNAME OR PASSWORD MISMATCH!!");

                System.out.println("Please enter your username");
                loginName= sc.nextLine();

                System.out.println("Please enter your password");
                loginPass= sc.nextLine();
            } else {
                System.out.println("YOU HAVE SUCCESSFULLY LOGGED IN!!");
                break;
            }
            count++;

        }
        if (count > 2) {
            System.out.println("CONTACT YOUR ADMIN!!");
        }

	}

}
