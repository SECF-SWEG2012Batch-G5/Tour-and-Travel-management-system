/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

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
}

