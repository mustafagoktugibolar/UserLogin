import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = "goktugibolar", password = "123456qW.";


        System.out.print("Username : " );
        String usernameInput = sc.nextLine();

        System.out.print("Password : ");
        String passwordInput = sc.nextLine();
        
        while(true){
            if(usernameInput.equals(username) && passwordInput.equals(password)){
                System.out.println("Login successful!");
                break;
            }
            else{
                System.out.println("Wrong username or password!\n"
                +"1 - Reset password\n"
                +"2 - try again");

                System.out.print("Choose process :");
                int input = sc.nextInt();

                if(input == 1){
                    if(usernameInput.equals(username)){
                        System.out.print("Enter your new password :");
                        String newPassword = sc.nextLine();

                        if(newPassword.equals(password)){
                            System.out.println("New password can't be the same as the old one!");
                            break;
                        }
                        else{
                            password = newPassword;
                        }   
                    }
                    else{
                        System.out.println("Username doesn't match!");
                        continue;
                    }
                }
                else if(input == 2){
                    continue; 
                }
                else{
                    System.out.println("Unvalid process!");
                }
            }
        }
    }
}
