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

for(int i=0; i<no_dest; i++)
	   {
	   	if(dest_name==sites[i].name)
		 {
	   	    n1=i;
	     }
	   }// ending of the loop that checks for matching name of destination
	for(int i=0; i<j; i++)
	  {
		if(user_id+j==users[i].id)
		 {
	   		n2=i;
		 }
      } // ending of the for loop that checks for matching user id

      cout<< "\nPrice for Normal package to "<< sites[n1].name << " is "<< sites[n1].nprice<<endl;
      if ( users[n2].visitorp == 3)
       {
	         cout<< " you have a 50 % discount because this is your third trip with us. thank you for being a loyal customer "<<endl;
	        cout<< "your new price is: "<<sites[n1].nprice * 0.5<<endl;
	        users[n2].visitorp = 0;
       } // ending of if statement for checking visitor point to place discount


   } // function for displaying price for NORMAL package
void display_dest(int no_dest){
	cout<<"\nSite name\tSeason\tSize\tDate\tDuration"<<endl;

   	for(int i=0; i<no_dest; i++)
	   {
   		    cout<<sites[i].name<<"\t\t"<<sites[i].season<<"\t"<<sites[i].sits<<"\t"<<sites[i].date.dd<<"/"<<sites[i].date.mm<<"/"<<sites[i].date.yy<<"\t"<<sites[i].duration<<" days"<<endl;
       }// for loop to display registered sites
   } // function to display registered sites
 void modify(int j,int no_dest) {
  	int id,x = -1;
  	bool flag=false;
  	cout<<"\n....RESERVATION MODIFICATION...."<<endl;
  	id:
  	cout<<"\nEnter id: ";
  	cin>>id;

  	for (int i=0; i<j; i++)
	  {
  		if(id==users[i].id)
		  {
  			x=i;
  			break;
		  }
	  } //ending of the for loop checking matching id
	  if(x == -1)
      {
          cout<< "there is no such id. try again "<<endl;
          goto id;
      }else{
	  cout<<"Enter name: "; cin>>users[x].name;
	  cout<<"Enter age: "; cin>>users[x].age;
	  display_dest(no_dest); // calling function to display registered sites
      choice:
	  cout<<"\nEnter destination by name: "; cin>>users[x].package.name;

	  	for (int i= 0; i< no_dest; i++)
		   {
			     if(users[x].package.name == sites[i].name)
				    {
					    if(sites[i].sits==0)
					       {
						     	cout<<"\nSorry this destination is fully booked, choose another"<<endl;
						     	goto choice;
						   } // ending of if statement to check if sites is fully booked
						else
						   {
							    flag=true;
							    break;

						   }
				    }//ending of if statement to check if the entered sites matches with registored sites
			     else
					{
			            continue;
				    }
			}
		if(flag==false)
			{
				cout<< "\nNo match choose another place"<<endl;
				goto choice;
			}

		flag=false;
        choice1:
        cout<<"Enter travel season: ";
        cin>>users[x].package.season;

        for (int i= 0; i< no_dest; i++)
			{
				if(users[x].package.season == sites[i].season)
					{
					    flag=true;
					    break;
					}//ending of if statement to check if the entered season matches with registored season
				else
				   {
			            continue;
				   }
			}
         if(flag==false)

			{
				cout<< "\nNo match choose another season"<<endl;
				goto choice1;
			}
        pack:
        cout<<"\nChoose prefered package\n1.VIP\n2.NORMAL\n-: ";
        cin>>users[x].package.offer;

        if (users[x].package.offer == 1)
	    	{
           	    vipp( no_dest,  j, users[x].package.name, id); // calls function for displaying price for VIP

	    	}
		else if(users[x].package.offer == 2)
	    	{
			    normp( no_dest, j,  users[x].package.name, id); // calls for function for displaying price for normal
	    	}
		else
	    	{
				cout<<"\nWrong input. Try again ";
				goto pack;
			}
		cout<<"\nModification of reservation information of customer with id "<<id<<" is complete."<<endl;
      }
   }
void report(int no_dest){
      	cout<<"sites\tseason\tDep_Date\tNO_Pass"<<endl;

      	for (int i=0; i<no_dest; i++)
		   {
      		    cout<<sites[i].name<<"\t"<<sites[i].season<<"\t"<<sites[i].date.dd<<"/"<<sites[i].date.mm<<"/"<<sites[i].date.yy<<"\t"<<sites[i].reserved<<endl;
		   }
   } // function for displaying report for registered sites
   // this function will allow users to search records by using id
   void searchh(User users[], int *j)
   {
       int id;
       cout<< "enter the id of the user you want"<<endl;
       cin>> id;

       for (int i=0; i< *j;i++)
       {
           if (id == users[i].id)
           {
               cout<<"ID \t"<<"Name"<<" \t"<<"Destination  "<<"Season \tPackage"<<endl;
               cout<< users[i].id<<"\t"<<users[i].name<<"\t"<<users[i].package.name<<"\t"<<users[i].package.season<<"\t"<<users[i].package.offer<<endl;
               break;
           }else
           {
               cout<< "no match"<<endl;
           }
       }
   }
   // this function displays users information in an alphabetical order
   void sortt (User users[], int *j)
{
        User temp;
    for (int i=0; i< *j;++i)
    {
        for (int k =i+1 ; k< *j;++k)
        {
            if (users[i].name > users[k].name )
            {
                temp = users[i];
                users[i] = users[k];
                users[k] = temp;
            }
        }
    }
    cout<< "alphabetical order"<<endl;

    cout<<"ID \t"<<"Name"<<" \t"<<"Destination  "<<"Season \tPackage"<<endl;
    for(int i=0; i<*j; i++)
    {

        cout<< users[i].id<<"\t"<<users[i].name<<"\t"<<users[i].package.name<<"\t"<<users[i].package.season<<"\t"<<users[i].package.offer<<endl;
    }
}
   // this function reads user information , make reservation , adds visitor point and give a unique id to the user
void rate(int no_dest){
    	string site_name;
    	int x=-1;
    	display_dest(no_dest);
    	place:
    	cout<<"Enter name of destination you want to rate: ";
    	cin>>site_name;
    	for(int i=0; i<no_dest; i++){
    		if(site_name==sites[i].name){
		    	x=i;
		    	break;
			}

		}
		if(x==-1){
			cout<<"\nWrong choice. Choice another site: "<<endl;
			goto place;
		}
