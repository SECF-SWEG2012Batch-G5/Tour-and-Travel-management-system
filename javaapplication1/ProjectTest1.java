package javaapplication1;

import java.util.*;
public class ProjectTest1{
    Scanner input=new Scanner(System.in);
//    User user = new User();
    Main main = new Main();
    public static String[] destName=new String[100];
    public static int[] destPrice=new int[100];
    public static int[] destAvailable=new int[100];
    public static int[] destId=new int[100];
    public static int noDest; 
    
    public void showDestination(){
		int choice;                 
					  if(noDest!=0) {
		                //the DESTINATION DETAILS//
						//display the "Destination", every destination "Fare", and the "Seat" available//
					System.out.println("****************************************");
 					System.out.println("**ID |   DESTINATION   |  FARE |  SEAT**");
 					System.out.println("****************************************");
 					for(int i=0; i<noDest;i++){
 					System.out.println(destId[i]+" "+ destName[i]+"|\t"   +  destPrice[i]  +  "|\t" + destAvailable[i]  + "**");
 					}
                     }
                                          else{
                                              System.out.println("There is no destination registered!");
                                          }
 					
                                        System.out.println("****************************************");
 					System.out.println("1.Continue");
                                        System.out.println("1.Exit");
                                        choice = input.nextInt();
                                        switch(choice){
                                            case 1:
                                                redirect();
                                                break;
                                            case 2:
                                                break;
                                                
                                        }
		}

    

public void search(){
        int num;
        String namedest,nameuser;
        boolean flag=false;
	System.out.println("\n*********SEARCH*********\n");
        System.out.println("1.Destination");
        System.out.println("2.Customer");
        System.out.println("3.Exit");
        num = input.nextInt();
        
        switch(num){
            case 1:
                System.out.println("\nEnter name of the destination you want to Search for:\n");
                namedest = input.next();                
                for(int i=0; i<=noDest; i++){
                    if(namedest.equals(destName[i])){
                        System.out.println("***************************");
                        System.out.println("Destination  |   Price  |   Seats");
                        System.out.println("***************************");
                        System.out.println("** "+destName[i]+"  |"+destPrice[i]+"  |"+destAvailable[i]+" **");
                        flag=true;
                        break;
                    }
                }
                if(flag==false){
                    System.out.println("\nDestination Not Found!\n");
                }
                redirect();
                break;
            case 2:
                System.out.println("\nEnter name of Customer");
                nameuser= input.next();
                for(int i=0; i<=User.noCust; i++){
                    if(nameuser.equals(User.name[i])){
                        System.out.println("\n***************************");
                        System.out.println("\nCustomer Name  |   Address  |   Seat No");
                        System.out.println("\n***************************");
                        System.out.println("\n"+User.name[i]+"|"+User.address[i]+"|"+User.seatNo[i]);
                        flag=true;
                        break;
                    }
                    if(flag==false){
                    System.out.println("\nCustomer Not Found!\n");
                }
                    redirect();
                break;
                }
            case 3:
                break;
            default:
                System.out.println("\nWrong Input\n");
                search();
                
        }
        
        
		   }

    public void viewReport(){
        
        if(User.noCust!=0){
             System.out.println("\n***********************************\n");
                System.out.println("*************Database**************");
                System.out.println("***********************************\n");
                System.out.println("\nCustomer Name  |  Destiination  |  Seat No  |\n");
                for(int i=0; i<User.noCust; i++){
                System.out.println(i+1+". "+ User.name[i]+"  "+ User.custDest[i]+"  "+ User.seatNo[i]);
                }
        }
        else{
            System.out.println("\nThere are no Passengers registored! \n");
        }
        redirect();
		   }
    public void redirect(){
        int choice;
        System.out.println("***********************************");
        System.out.println("1.Main Menu");
        System.out.println("2.Continue");
        System.out.print("Enter choice:-");
                choice = input.nextInt();
                switch(choice){
                    case 1:
                        main.mainMenu();
                        break;
                    case 2:                      
                        break;
                    default:
                        System.out.println("Wrong Input!");
                        redirect();
                                                
                                                
        }
        
    }
}