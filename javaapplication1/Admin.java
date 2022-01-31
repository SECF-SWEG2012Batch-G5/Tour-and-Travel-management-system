package javaapplication1;
import java.util.*;
public class Admin extends ProjectTest1{
     
     Scanner console=new Scanner(System.in);
     public String name;
     public String password;
     private final String adminid="Abebe";
     private final String pass="1234";
     int num;

     public void adminMenu(){
        System.out.println("*****************************");
        System.out.println("**********Admin Menu*********");
        System.out.println("*****************************");
        System.out.println("Enter:");
        System.out.println("1.Login");
        System.out.println("2.Exit");
	System.out.print("--:");
        num=console.nextInt();

        switch(num){
            case 1:
               login();
            break;
            case 2:
            break;
            default:
            System.out.println("Invalid Input!");
            
        }
     
     }
    
     public void login(){
        System.out.println("Enter User Name: ");
        name = console.nextLine();
        System.out.println("Enter Password: ");
        password = console.nextLine();

        if(( name.equals(adminid)) && ( password.equals(pass))){
             menu();
        }
        else{
           System.out.println("Incorrect UserName or Password!\n"); 
           login();
        }
     }
     public void menu(){
        System.out.println("*****************************");
        System.out.println("Enter:");
        System.out.println("1.Register Destination");
        System.out.println("2.Modify Destination");
        System.out.println("3.View Report");
        System.out.println("4.Exit");
        System.out.println("*****************************");
        System.out.print("--:");
        num=console.nextInt();

        switch(num){
            case 1:
               registor();
               menu();
            break;
            case 2:
               modify();
               menu();
            break;
            case 3:
             viewReport();
             menu();
            break;
            case 4:
            break;
            default:
            System.out.println("Invalid Input!");
            menu();
            
        }

     }
     public void registor(){
         int num1;
				 System.out.println("How many destinations do you want to register?");
				 num1=console.nextInt();
				 
				  for(int i=0, j=Admin.noDest; i<num1;i++,j++){
                                    System.out.println("Enter name of the destination");
					Admin.destName[j]=console.next();
				    System.out.println("Enter price of the destination");
					Admin.destPrice[j]=console.nextInt();
					System.out.println("Enter available seat of the destination");
					Admin.destAvailable[j]=console.nextInt();
                                        Admin.destId[j]=Admin.noDest;
                                        Admin.noDest++;
                    }	  
				 
     }
     public void modify(){
         String destname;
         int index=-1;
         System.out.println("\nEnter name of the destination you want to modify");
         destname = console.next();
         for(int i=0; i<=Admin.noDest; i++){
             if(destname.equals(Admin.destName[i])){
                 index=i;
                 break;
             }
         }
         if(index==-1){
             System.out.println("\nDestination Not Found!\n");
         }
         else{
             System.out.println("Edit name of the destination");
		Admin.destName[index]=console.next();
	     System.out.println("Edit price of the destination");
		Admin.destPrice[index]=console.nextInt();
	     System.out.println("Edit available seat of the destination");
		Admin.destAvailable[index]=console.nextInt();
             System.out.println("\nYou have successfully Edited the destination!\n");
	       
         }
         

     }

 }