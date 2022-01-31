package javaapplication1;

import java.util.*;
public class Main {
    
    /**
     *
     * @param args
     */
    
    public static void main (String[] args){
        Main main = new Main();
        System.out.println("**************************************");
        System.out.println("Welcome to Anit Bus resevation system");
	
        main.mainMenu();
            
            
        }
        

    
    public void mainMenu(){
        Admin admin=new Admin();
        User user=new User();
        
            Scanner input = new Scanner(System.in);
            int num;
        		
        
        System.out.println("**************************************");
	System.out.println("Enter:");
        System.out.println("1.Admin ");
        System.out.println("2.User");
        System.out.print("Enter Choice: ");
        num=input.nextInt();

        switch(num){
            case 1:
              admin.adminMenu();
              break;
            case 2:
              user.userMenu();
              break;
            default:
            System.out.println("Invalid Input!");
            mainMenu();
        }




}
}