package javaapplication1;

import java.util.*;
public class User extends ProjectTest1{
    //User user = new User();
    Scanner read =new Scanner(System.in);
  public static String[] address;
  public static String[] name;
  public static int[] seatNo;
  public static String[] custDest;
  public static int noCust;
    
    public void userMenu(){
        int choice;
        System.out.println("*****************************");
        System.out.println("**********User Menu*********");
        System.out.println("*****************************");
        System.out.println("Enter:");
        System.out.println("** [1] DESTINATION                        **");
		System.out.println("** [2] RESERVE SEAT                       **");
		System.out.println("** [3] CANCEL RESRVATION                  **");
		System.out.println("** [4] SEARCH                             **");
		System.out.println("** [5] Exit                               **");
		System.out.println("********************************************");
		System.out.println("********************************************\n");
        System.out.print("ENTER CHOICE: ");
		choice=input.nextInt();
        switch (choice){
				
				case 1: 
				showDestination();
                                userMenu();
				break;
				case 2:
				reservation();
                                userMenu();
				break;
				case 3:
				cancelReservation();
                                userMenu();
                                
				break;
				case 4:
			           search();
                                   userMenu();
				break;
				case 5:
                                    System.exit(0);
				break;
				default:
				System.out.println("Incorrect choice!");
                                userMenu();
			}

    }
    public void reservation(){
        int num;
        System.out.println("*****************************");
        System.out.println("**********Reservation********");
        System.out.println("*****************************");
        System.out.println("Enter the following information:");
        System.out.print("Name:");
        name[noCust]= read.next();
        System.out.print("Adderss:");
        address[noCust] = read.next();
        showDestination();
        System.out.print("Choose destination by id:");
        num = read.nextInt();
     /*   for(int i=0; i<User.noDest; i++){
            if(num == User.destId[i])
            custDest[noCust] = User.destName[i];
            User.destAvailable[i]--;
        }
        seatNo[noCust] = */
        
        
    }
    public void cancelReservation(){
        
    }
    
} 
