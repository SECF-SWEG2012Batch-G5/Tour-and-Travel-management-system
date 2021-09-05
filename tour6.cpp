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
