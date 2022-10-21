/**
 * SER-515 User information class
 * 
 * @author Manasi Anantpurkar , manantpu@asu.edu
 * @version 1.0
 * @since 10-20-2022
 */
import java.util.Scanner;
public class UserInfoItem {
	String UserName;
	String password;
	int UserType;
	
	public void createUSer() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Username");
		UserName = scan.nextLine();
		System.out.println("Enter Password");
		password = scan.nextLine();
		System.out.println("Enter 1 if Buyer 0 if Seller");
		UserType = scan.nextInt();
		
		System.out.println(" User Created \n"+"Name:"+UserName);
		if(UserType==0){
			System.out.println("\n User Type: Seller");
		}
		else{
			System.out.println("\n User Type: Buyer");
		}

		return;
	}
}
