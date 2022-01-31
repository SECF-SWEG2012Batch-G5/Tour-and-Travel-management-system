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
public class User extends Destination {
    
    public void showDest()
    {
       
       if(prev!=0) {
					System.out.println("****************************************");
 					System.out.println("** ID     DESTINATION       |  FARE |  SEAT**");
 					System.out.println("****************************************");
 					for(int i=0; i<prev;i++){
 					System.out.println("**"+ i+1 + "   "+ destName[i]   +  "|\t\t"   +  destPrice[i]  +  "|\t\t" + destAvailable[i]  + "**");
 					}
                    }else{
 						System.out.println("There is no destination registered!");
                        }
    }
    
    public void reserve()
    {
        Scanner input = new Scanner(System.in);
        String choice;
        int id, res=0, tic;
              
       showDest();
       System.out.println("Enter the name of the place you want to reserve");
       choice= input.nextLine();
       System.out.println("Enter the Id of the place you want to reserve");
       id= input.nextInt();
       
       for(int i=0; i<prev;i++){
           if(choice.equals(destName[i]) && id== i+1)
           {
               res=i;
           }
       }
       String username, phoneNumber;
          int dId, age;
          
          System.out.println("how may tickets do you want to buy"); 
           tic=input.nextInt();
            
           for(int i=0; i<tic;i++ )
           {
               
           /*int row= 10;//destAvailable[res]/4;
               
                
                   for(int l=0; l< row; l++)
                    {
                        for (int j=0; j< 4; j++)
                        {

                                     bus[l][j]= '_';

                        }
                    }
             
             System.out.println("\"*************************************** seat map ****************************************** ");
             
             System.out.print("                     ");

                            for( int k=0; k<4; k++)
                            {

                                    if (k==2)
                                    {
                                        System.out.print("            ");
                                    }else 
                                    {
                                        System.out.print("  ");
                                    }
                               System.out.print(k+1);


                            }
                            System.out.println();
                            System.out.println();
                            for(int l=0;l<row; l++)
                            {

                              System.out.print("               ROWS");
                            System.out.print(l+1+ "  ");
                              for(int j=0; j<4; j++)
                            {

                                if (j==2){
                                 System.out.print("      ");
                                }else{
                                     System.out.print("  ");
                                }

                               System.out.print(bus[l][j]);

                            }
                        System.out.println();
                            }
                             System.out.println("enter row and column number of your desired seat separeted by space");
                              int r= input.nextInt();
                              int c= input.nextInt();
                              if(bus[r-1][c-1]=='_')
                              {
                                 bus[r-1][c-1]='X';
                              }else if (bus[r-1][c-1]=='X') 
                              {
                                  System.out.println("this seat is already taken choose another one"); 
                                  reserve();
                              }*/
                     

             
          
               System.out.println("enter name");
             username= input.next();
             System.out.println("enter age");
             age= input.nextInt();
             System.out.println("enter phone number");
             phoneNumber= input.next();
             dId= res;
            
             Destination(username,age,phoneNumber,dId);
              destAvailable[id-1]--;
            
       }
           
    }
    public void cancle()
    {
          Scanner input = new Scanner(System.in);
        String username, phonenumber;
        int can;
        boolean flag= false;
        System.out.println("enter your name");
         username= input.next();
          System.out.println("enter your phone number");
        phonenumber= input.next();
        
        for(int i=0; i<tics; i++)
        {
            if(userName[i].equalsIgnoreCase(username) && phoneNumber[i].equalsIgnoreCase(phonenumber))
            {
                  can= i;  
                 Destination(can);
                 flag= true;
            } 
        }
        if(flag==true)
        {
            System.out.println("your reservation is cancelled");
        }else
        {
             System.out.println("no reservation found with this data");
        }    
    }
   
}
    
