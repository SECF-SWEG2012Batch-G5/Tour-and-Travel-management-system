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
public class Destination {
        public  static  String[] destName= new String[100];
	public  static int[] destPrice=new int[100];
        public  static int[] destAvailable= new int[100]; 
        public  static int[] dId= new int[100];
        static int  prev,tics;
        public  static  String[] userName= new String[100];
	public  static int[] age=new int[100];
        public  static String[] phoneNumber = new String[100];
        
        public void Destination(String dest, int pri, int ava, int nodest){
             
           for(int i= 0; i<1; i++)
           {
               destName[prev]=dest;
               destPrice[prev]=pri;
               destAvailable[prev]=ava;
              prev++;
              
           }
           
        }
        public void Destination(String name, int agee, String pnumber, int dID){
             
           for(int i= 0; i<1; i++)
           {
               userName[tics]=name;
               age[tics]=agee;
               phoneNumber[tics]=pnumber;
               dId[tics]=dID;
              tics++;
                
           }
           
        }
        
        public void Destination( int c){
             
           for(int i= 0; i<tics; i++)
           {
               userName[c]=userName[c+1];
               age[c]=age[c+1];
               phoneNumber[c]=  phoneNumber[c+1];
               dId[c]= dId[c+1];
              tics--;
                
           }
           
        }
        
        public void search(){
             Scanner input = new Scanner(System.in);
       
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
                for(int i=0; i<=prev; i++){
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
                for(int i=0; i<=tics; i++){
                    if(nameuser.equals(userName[i])){
                        System.out.println("\n***************************");
                        System.out.println("\nCustomer Name  |   Address  |   Seat No");
                        System.out.println("\n***************************");
                        System.out.println("\n"+userName[i]+"|"+age[i]+"|"+phoneNumber[i]);
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
         public void redirect(){
             
          Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("***********************************");
        System.out.println("1.Main Menu");
        System.out.println("2.Continue");
        System.out.print("Enter choice:-");
                choice = input.nextInt();
                switch(choice){
                    case 1:
                        Main.menu();
                        break;
                    case 2:                      
                        break;
                    default:
                        System.out.println("Wrong Input!");
                        redirect();
                                                
                                                
        }
        
    }
        
}

