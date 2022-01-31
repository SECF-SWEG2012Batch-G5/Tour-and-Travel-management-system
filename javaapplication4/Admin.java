/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author Tensu.B
 */
class Admin extends Destination  {
    
    Scanner input = new Scanner(System.in);
    String desti;
    int pri, ava, noDest;
    Destination dest= new Destination();
public int setDestination() {
			       int num;
				 System.out.println("How many destinations do you want to register?");
				 num=input.nextInt();
				 
				
                                  for(int i=0; i<num; i++)
                                 {
					  System.out.println("Enter name of the destination");
					  desti=input.next();
					   System.out.println("Enter price of the destination");
					  pri=input.nextInt();
					   System.out.println("Enter available seat of the destination");
					  ava=input.nextInt();
                                          
					dest.Destination(desti, pri, ava,num);
                                        
                                 }
                                    
				  return num;
				  
		  }
		 
                 public void viewReport() {
                   
                 if(tics!=0) {
                     System.out.println("******************************************************************");
 		     System.out.println("** ID  | NAME  | AGE  |  PHONENUMBER |    DESTINATION       |  FARE **");
 		      System.out.println("**********************************************************************");
                      for(int i=0; i<tics; i++)
                      {  
                          System.out.println("**"+ i+1 + "   "+ userName[i]   +  "|\t\t"   + age[i]   +  "|\t\t"   +phoneNumber[i]   +  "|\t\t"   + destName[dId[i]]   +  "|\t\t"   +destPrice[dId[i]]  + "**");
                      }
                     }else
                     {
                         System.out.println("There is no destination registered!");
                     }
                 }
                 
      public void modify(){
                  
         String destname;
         int index=-1;
         System.out.println("\nEnter name of the destination you want to modify");
         destname =input.next();
         for(int i=0; i<=prev; i++){
             if(destname.equals(destName[i])){
                 index=i;
                 break;
             }
         }
         if(index==-1){
             System.out.println("\nDestination Not Found!\n");
         }
         else{
             System.out.println("Edit name of the destination");
		destName[index]=input.next();
	     System.out.println("Edit price of the destination");
		destPrice[index]=input.nextInt();
	     System.out.println("Edit available seat of the destination");
		destAvailable[index]=input.nextInt();
             System.out.println("\nYou have successfully Edited the destination!\n");
	       
         }
         

     }
}
