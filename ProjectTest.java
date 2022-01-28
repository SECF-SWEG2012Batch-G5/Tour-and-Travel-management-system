import java.util.*;
import JavaApplication.Destination; 
public class ProjectTest {
	   //public  int available[] = new int[6];
	  
		 //"available[]" is the SEAT AVAILABLE//
		//store 20 seats every destination [1-5]//
    	
		public String name;
		public String password;
		public void showDestination(){
		                  
					  
		                //the DESTINATION DETAILS//
						//display the "Destination", every destination "Fare", and the "Seat" available//
						System.out.println("***************************************");
    					System.out.println("**   DESTINATION        |  FARE |  SEAT  **");
    					System.out.println("***************************************");
					  
					  /*System.out.println("***************************************");
    					System.out.println("**   DESTINATION        |  FARE |  SEAT  **");
    					System.out.println("***************************************");
						System.out.println("** 1.)ADAMA CITY        | 170Br |   "+available[1]+"   **");
    					System.out.println("** 2.)HARAR CITY        | 600Br |   "+available[2]+"   **");
    					System.out.println("** 3.)BAHIR DAR CITY    | 500Br |   "+available[3]+"   **");
    					System.out.println("** 4.)GONDER CITY       | 200Br |   "+available[4]+"   **");
    					System.out.println("** 5.)HAWASSA CITY      | 250br |   "+available[5]+"   **");
    					System.out.println("***************************************");
					  System.out.println("***************************************\n");*/
		}
 
		  public void search(){
			   
		   }
		  public void viewReport(){
			   
		   }
}
 class Admin extends ProjectTest{
       public String stuffId;
	     ArrayList <Destination> dest=new ArrayList <Destination>(6);
		 Scanner input=new Scanner(System.in);
		 public void login(){
		  
	     }
		 public void registerDestination(){
		 int num;
		 System.out.println("How many destinations do you want to register?");
		 num=input.nextInt();
		  for(int i=0; i<num;i++){
			  System.out.println("Enter name of the destination");
			  dest.destName.add(i)=input.nextLine();
			   System.out.println("Enter price of the destination");
			  dest.destPrice.add(i)=input.nextInt();
			   System.out.println("Enter available seat of the destination");
			  dest.destAvailable.add(i)=input.nextInt();
			
		  }
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
          
