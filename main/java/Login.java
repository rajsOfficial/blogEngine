import java.io.*;
import java.util.Scanner;

public class Login {


    /*
        @author Rajkanna
        Written on 26 Mar 2019
     */

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        do {

//            Console console = System.console();
//            console.flush();
//            PrintWriter printWriter = new PrintWriter(System.out);
//                                printWriter.flush();
            
            System.out.println("Blog Engine : /n /t The whole world is listening to you..!");

            System.out.println("Please enter your login credentials ");

            System.out.println("Email :");

            String loginEmail = in.nextLine();

            System.out.println("Password :");

            String loginPassword = in.nextLine();

            if (loginEmail != null && !loginEmail.isEmpty()) {

                if (loginPassword != null && !loginPassword.isEmpty()) {

                    if (loginEmail.equalsIgnoreCase("raj@gmail.com") && loginPassword.equalsIgnoreCase("1234")) {
                        System.out.println("Welcome to your blog ");
                        break;
                    } else {
                        System.out.println("Invalid email or password");
                    }

                }else{
                    System.out.println("Please enter password to proceed");
                }

            }else System.out.println("Please enter email to proceed");

        }while(true);
    }
}
