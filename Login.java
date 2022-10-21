import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * SER-515 Login class implementing the implementation for login using facade
 * class
 * 
 * @author Manasi Anantpurkar manantpu@asu.edu
 * @version 1.0
 * @since 10-20-2022
 */
public class Login {
		int userType=-1;
		Login() {
			userType = 0;
		}
		public int login() {
            System.out.println("Login Initiated ");
            System.out.println("Enter Username ");
            @SuppressWarnings("resource")
            Scanner scan = new Scanner(System.in);
            String username = scan.next();
            System.out.println("Enter Password ");
            String password = scan.next();
            userType = validation(username, password);
            return userType;
        }

        public static int validation(String username, String password) {
            int userType=-1;
            String[][] files = {{"data/BuyerInfo.txt", "Buyer"},{"data/SellerInfo.txt", "Seller"}};

            for(int j=0; j<2; j++){
                Path filePath = Paths.get(files[j][0]);
                if(files[j][1] == "Buyer"){
                    userType = 0;
                } else {
                    userType = 1;
                }
                String fileContent = null;
                try {
                    fileContent = Files.readString(filePath);
                } catch (IOException e) {
                    System.out.println("WARNING: DATABASE READ ERROR");
                }
                String[] lines = fileContent.split("\\r?\\n");
                for(int i=0; i< lines.length; i++){
                        if(lines[i].split(":")[0].equals(username)){
                            if(lines[i].split(":")[1].equals(password)){
                                if(userType == 0) {
                                    System.out.println("Welcome "+username);
                                    return userType;
                                } else {
                                    System.out.println("Welcome "+username);
                                    return userType;
                                }
                            }
                        }
                    }
                }
            return userType;
        }

}
		

	

