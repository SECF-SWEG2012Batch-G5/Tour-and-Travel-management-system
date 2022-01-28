package project;
import java.util.*;
import JavaApplication.Destination; 
public class ProjectEmpl {
       public static int noDest=0;
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
        int num;
		System.out.println("**************************************");
        System.out.println("Welcome to Anit Bus resevation system");
		System.out.println("**************************************");
		System.out.println("Enter 1 for Admin 2 for User");
		num=input.nextInt();
		Admin admin=new Admin();
		User user=new User();
		if(num==1){
		int choice=showChoiceAdmin();
		String ch;
			switch (choice){
				case 1: 
				admin.login();
				break;
				case 2:
				noDest=admin.setDestination();
				System.out.println("To where you want to be redirected main menu or Admin?");
				System.out.println("Enter Menu for main menu or Admin for Admin menu");
				ch=input.next();
				if(ch.toUpperCase()=="ADMIN") {
				showChoiceAdmin();}
				else if(ch.toUpperCase()=="MENU") {
					showChoiceUser();}
				else
			    {System.out.println("Incorrect Choice!");}
	
				break;
				case 3:
				admin.editDestination();
				break;
				case 4:
				admin.viewReport();
				break;
				default:
				System.out.println("Incorrect choice!");
			}
		}
		
		else{
		int choice1=showChoiceUser();
			switch (choice1){
				
				case 1: 
				user.showDestination(noDest);
				break;
				case 2:
				user.reservation();
				break;
				case 3:
				user.cancelReservation();
				break;
				case 4:
				user.search();
				break;
				case 5:
				user.makePayment();
				break;
				default:
				System.out.println("Incorrect choice!");
			}
		}
	
	  }
	public static int showChoiceAdmin(){
		
		Scanner input = new Scanner(System.in);
		int choice;
		//the MAIN MENU//
		System.out.println("*********************************************");
		System.out.println("**Anit BUS RESERVATION AND TICKETING SYSTEM**");
		System.out.println("*********************************************");
		System.out.println("** [1] LOGIN                               **");
		System.out.println("** [2] Register Destination                **");
		System.out.println("** [3] Edit Destination                      **");
		System.out.println("** [4] VIEW REPORT                         **");
		System.out.println("** [5] Exit                                **");
		System.out.println("*********************************************");
		System.out.println("*********************************************\n");
		System.out.print("ENTER CHOICE: ");
		choice=input.nextInt();
		return choice;
	}
	public static int showChoiceUser(){
		
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
		return choice;
		
	}
}
