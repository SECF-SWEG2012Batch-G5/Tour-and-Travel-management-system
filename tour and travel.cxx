#include<iostream>
#include<string.h>
using namespace std;
struct dep_date{
	int dd,mm,yy;
}; // structure to store date of departure
struct rating{
	string name;
	int rate;
}; //structure to store rating and the rater
struct Dest {
    string name,season,duration;
	dep_date date;
	rating ranks;
    int sits,reserved,offer;
    float vprice,nprice;
}sites[100]; // structure to store info of sites

class User{
    public:
        string name;
        int age;
        Dest package;
        int id=100, visitorp = 0;
}users[100]; // class to register users info


Dest newSite(){
    Dest site;
            cout<<"Enter site name: ";
            cin>>site.name;
            cout<<"Enter travel season: ";
            cin>>site.season;
            cout<<"Enter number of passengers: ";
            cin>>site.sits;
            cout<<"Enter duration of the tour: ";
            cin>>site.duration;
            cout<<"Enter date of departure(dd mm yy): ";
            cin>>site.date.dd>>site.date.mm>>site.date.yy;
            cout<< "enter price for VIP package"<<endl;
    		cin>> site.vprice;
   			cout<< "enter price for normal package"<< endl;
    		cin>> site.nprice;

        return site;
} // function for site registering by the admin

void del(int &j){
    int id,x;
    cout<<"\n.......CANCEL RESERVATION......"<<endl;
    cout<<"\nEnter id: ";
    cin>>id;

    for (int i=0; i<j; i++)
    {
      if(id==users[i].id)
      {
        x=i;
        break;
      }
    }
    for(int i=x+1; i<j; i++)
    {
      users[i-1]=users[i];
  }
  --j;
    cout<<"\nReservation if user with id "<<id<< "is canceled."<<endl;
  }     // function for deleting/cancelling a reservation

void vipp(int no_dest, int j, string dest_name, int user_id){
   	int n1,n2;

   	for(int i=0; i<no_dest; i++)
	   {
	   	if(dest_name==sites[i].name)
		  {
	   		n1=i;
	      }
	   } // ending of the loop that checks for matching name of destination
	for(int i=0; i<j; i++)
	   {
		if(user_id+j==users[i].id)
		  {
	   		n2=i;
		  }
       }// ending of the for loop that checks for matching user id

      cout<< "\nPrice for vip package to "<< sites[n1].name << " is "<< sites[n1].vprice<<endl;
      if ( users[n2].visitorp == 3)
       {
         cout<< " you have a 50 % discount because this is your third trip with us. thank you for being a loyal customer "<<endl;
	        cout<< "your new price is: "<<sites[n1].vprice * 0.5<<endl;
        users[n2].visitorp = 0;
       } // ending of if statement for checking visitor point to place discount

   } // function for displaying price for VIP package

void normp(int no_dest, int j, string dest_name, int user_id){
   	int n1,n2;

