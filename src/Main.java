import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = "goktug", password = "123456qW.";


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
                if(usernameInput.equals(username)){
                    System.out.println("Wrong password!\n"
                    +"Would you like to reset your password (yes or no): ");
                    String input = sc.nextLine();


                    if(input.equals("yes")){
                        System.out.print("New password : ");
                        String newPassword = sc.nextLine();

                        if(newPassword.equals(password)){
                            System.out.println("New password can not be same as the old password!");
                            continue;
                        }
                        else{
                            password = newPassword;
                            System.out.println("Password changed!");
                            System.out.println("New Password : " + password);
                            break;
                        }
                    }
                    else if(input.equals("no")){
                       break;
                    }
                    else{
                        System.out.println("Unvalid process!");
                    }

                }
                else{
                    System.out.println("Wrong username!");
                    break;   
                }
            }
        }
    }
}
