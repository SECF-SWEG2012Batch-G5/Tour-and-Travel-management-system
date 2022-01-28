package project;
import java.util.*;
import JavaApplication.Destination; 
public class ProjectTest {
	   //public  int available[] = new int[6];
	  
		 //"available[]" is the SEAT AVAILABLE//
		//store 20 seats every destination [1-5]//
	   Scanner input=new Scanner(System.in);
		public String name;
		
		public  String[] destName=new String[10];
		public  int[] destPrice=new int[10];
		public  int[] destAvailable=new int[10];
		public void showDestination(int destNo){
		                  
					  if(destNo!=0) {
		                //the DESTINATION DETAILS//
						//display the "Destination", every destination "Fare", and the "Seat" available//
					System.out.println("****************************************");
 					System.out.println("**   DESTINATION       |  FARE |  SEAT**");
 					System.out.println("****************************************");
 					for(int i=0; i<destNo;i++){
 					System.out.println("**1.)"+ destName[i]   +  "|\t\t"   +  destPrice[i]  +  "|\t\t" + destAvailable[i]  + "**");
 					}}
 					else
 						System.out.println("There is no destination registered!");
 					
		}
		  int setDestination() {
			  int num;
				 System.out.println("How many destinations do you want to register?");
				 num=input.nextInt();
				 int i=0;
				  while( i<num){
					  System.out.println("Enter name of the destination");
					  destName[i]=input.next();
					   System.out.println("Enter price of the destination");
					  destPrice[i]=input.nextInt();
					   System.out.println("Enter available seat of the destination");
					  destAvailable[i]=input.nextInt();
					  i++;
					  }
				  showDestination(num);
				  return num;
				  
		  }

		  public void search(){
			   
		   }
		  public void viewReport(){
			   
		   }
}
class Admin extends ProjectTest{
    public String stuffId;
    public String password;
	      Destination[] dest=new Destination[6];
		
		 public void login(){
		  
	     }
		
		 
      public void editDestination(){
		  
	     }
	    public void viewReport(){
		  
	    }
}
class User extends ProjectTest{
	
	   public String address;
    public String seatNo;
	   public int  phoneNumber;
	
	
	 public void reservation(){
	 
	 }
	public void cancelReservation(){
	
	       }
	   public  void makePayment(){
	
	
		  }
}
       

