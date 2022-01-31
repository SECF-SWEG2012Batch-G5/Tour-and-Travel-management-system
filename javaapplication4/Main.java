/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Tensu.B
 */
public class Main extends Destination {
  public static void main(String[] args) { 
    /*  JLabel label= new  JLabel();
      label.setText("Welcome to Anit Bus resevation system");
      JFrame frame= new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(500,500);
      frame.setVisible(true);
        frame.add(label);*/
        System.out.println("**************************************");
        System.out.println("Welcome to Anit Bus resevation system");
       System.out.println("**************************************");
                menu();
  } 
    public static void menu()
   {
    Scanner input = new Scanner(System.in);
        
        
           boolean again= true;
           boolean check= true;
           int choice;
           Admin admin=new Admin();
           Destination dest= new Destination();
   
            
          int num;
          
           
		
		System.out.println("Enter 1 for Admin 2 for User");
		num=input.nextInt();
                
		
                     if(num== 1){
                
                      
                     checkLogin();
                      choice= showChoiceAdmin(); 
		
		String ch;
			switch (choice){
                case 1: {
                                    admin.setDestination();
                                    do
                                    {
                                        System.out.println("To where you want to be redirected main menu or Admin?");
                                        System.out.println("Enter Menu for main menu or Admin for Admin menu");
                                        ch=input.next();
                                        if(ch.equalsIgnoreCase("ADMIN")== true) {
                                            showChoiceAdmin();}
                                        else if(ch.equalsIgnoreCase("MENU")==true) {
                                            showChoiceUser();}
                                        else
                                        {
                                            System.out.println("Incorrect Choice!");
                                            again= false;
                                        }
                                    }while(again ==false);
                                    break;
                        }
		case 2: {
                                    
                                    admin.modify();
                                      menu();
                                      break;
                        }
		case 3: {
                                    admin.viewReport();
                                      menu();
                                      break;
                        }
                case 4:
                {
                                dest.search();
                                break;
                }
                                default : System.out.println("Incorrect choice!");
			}
                    //admin.editDestination();
                    //admin.viewReport();
                    		
		
           }else if(num==2){
                
		     showChoiceUser();
		}
                     
  
}
    public static void checkLogin()
   {
            Scanner input = new Scanner(System.in);
            String userName, password;
            int choice;
            System.out.println("Enter user name");
            userName=input.nextLine();
            System.out.println("Enter password name");
            password=input.nextLine();
            
            if(userName.equals("ADMIN") && password.equals("ADMIN"))
            {
                 showChoiceAdmin();
                 
            }else{
                System.out.println("Incorrect username or password");
                 checkLogin();
            }
         
    }
	public static int showChoiceAdmin(){
		
		Scanner input = new Scanner(System.in);
		int choice;
		//the MAIN MENU//
		System.out.println("*********************************************");
		System.out.println("**Anit BUS RESERVATION AND TICKETING SYSTEM**");
		System.out.println("*********************************************");
		System.out.println("** [1] Register Destination                               **");
		System.out.println("** [2] Edit Destination               **");
		System.out.println("** [3] VIEW REPORT                      **");
                System.out.println("** [4] SEARCH                      **");
		System.out.println("** [5] Exit                         **");
		System.out.println("*********************************************");
		System.out.println("*********************************************\n");
		System.out.print("ENTER CHOICE: ");
		choice=input.nextInt();
		return choice;
	}
	public static  void showChoiceUser(){
		
		Scanner input = new Scanner(System.in);
		int choice;
		//the MAIN MENU//
		System.out.println("********************************************");
		System.out.println("**Anit BUS RESERVATION AND TICKETING SYSTEM**");
		System.out.println("********************************************");
		System.out.println("** [1] DESTINATION                        **");
		System.out.println("** [2] RESERVE SEAT                       **");
		System.out.println("** [3] CANCEL RESRVATION                  **");
		System.out.println("** [4] SEARCH                             **");
		System.out.println("** [5] MAKE PAYMENT                       **");
		System.out.println("** [6] Exit                               **");
		System.out.println("********************************************");
		System.out.println("********************************************\n");
		
		System.out.print("ENTER CHOICE: ");
		choice=input.nextInt();
		showChoiceA(choice);
		
	}
       public static void showChoiceA(int choice){
           User user=new User();
           int choice1=choice;
           Destination dest= new Destination();
			switch (choice1){
				
				case 1: 
				user.showDest();
                                  menu();
				break;
				case 2:
                                  user.reserve();
                                    menu();
				//user.reservation();
				break;
				case 3:
                                    user.cancle();
                                     menu();
				//user.cancelReservation();
				break;
				case 4:
                                     dest.search();
				//user.search();
				break;
				case 5:
				//user.makePayment();
				break;
				default:
				System.out.println("Incorrect choice!");
			}
           
       } 

    private static void exit() {
        throw new UnsupportedOperationException("Not supported yet."); 
          
    }
}

    
     

