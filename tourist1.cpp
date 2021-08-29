#include<iostream>
#include<string.h>

using namespace std;
struct tour{
 	char ad_place[20],ad_code[20],ad_country[20],ad_days[20],ad_prices[20];
 	char us_phone[20],us_name[20],us_people[20],us_date[20],us_status[20],us_dcode[20];
};
class Tourist{
             public:
                void ad_pack(tour r);
	            tour ad_unpack(char a[]);
	            void ad_writedata();
	            void ad_display();
};
// ADMIN PANEL
void Tourist ::ad_pack(tour r){
   r buff[45];
     strcpy(buff,r.ad_code);
     strcat(buff,"|");
     strcat(buff,r.ad_place);
     strcat(buff,"|");
     strcat(buff,r.ad_country);
     strcat(buff,"|");
     strcat(buff,r.ad_days);
     strcat(buff,"|");
     strcat(buff,r.ad_prices);
     strcat(buff,"|");
     for(int i=0;i<45-strlen(buff);i++)
            strcat(buff,"|");
     
}
tour Tourist::ad_unpack(char buff[]){
	tour r;
	int i=0,j=0;
	while(buff[j]!='|')
	 r.ad_code[i++]=buff[j++];
	 r.ad_code[i]='\0';
	i=0;
	j++;
	while(buff[j]!='|')
	      r.ad_place[i++]=buff[j++];
	r.ad_place[i]='\0';
	i=0;
	j++;
	while(buff[j]!='|')
	      r.ad_country[i++]=buff[j++];
	r.ad_country[i]='\0';
	i=0;
	j++;
	while(buff[j]!='|')
	      r.ad_days[i++]=buff[j++];
	r.ad_days[i]='\0';
	i=0;
	j++;
	while(buff[j]!='|')
	      r.ad_prices[i++]=buff[j++];
	r.ad_prices[i]='\0';
	return(r);
}
void Tourist::ad_writedata(){
    tour s;
    cout<<"Enter the Destination Code\nD-";
    cin>>s.ad_code;
    cout<<"Enter the Destination Place\n";
    cin>>s.ad_place;
    cout<<"Enter the Country of the Destination\n";
    cin>>s.ad_country;
    cout<<"Enter the Number of days of the Trip\n";
    cin>>s.ad_days;
    cout<<"Enter the Cost of the trip\n";
    cin>>s.ad_prices;
    ad_pack(s);
}
void Tourist::ad_display(){

   	char buff[45];
   	tour r;
    cout<<"-------------------------------------------------------------------------------------------------\n";
    cout<<"Sr No.\t\tDEST. CODE\tPLACE\t\tCOUNTRY\t\tDAYS\t\tPRICES\n";
    cout<<"-------------------------------------------------------------------------------------------------\n";
    int c=1;
  
       		r=ad_unpack(buff);
        cout<<c++<<"\t\t"<<r.ad_code<<"\t\t"<<r.ad_place<<"\t\t"<<r.ad_country<<"\t\t" <<r.ad_days<<"\t\t"<<r.ad_prices<<endl;

    return;
}
int main(){
    cout<<"                              \t\t WELCOME TO TOURIST RESERVATION SYSTEM\n\n\n";
    cout<<"                                   \t    TOURIST RESERVATION SOFTWARE\n\n\n";
    cout<<"                                     \t      PRESS ENTER TO CONTINUE....\n\n";
    if(cin.get()=='\n'){
        system("cls");
        int choice,ch1,ch2;
        Tourist obj;
        cout<<"\n Who are You?\n";
        cout<<"1. ADMIN\n";
        cout<<"2. USER\n\n";
        cout<<"Enter any other key for exit\n\n\n";
        cout<<"Enter Your Option\n";
        cin>>choice;
        switch(choice){
            case 1:
                system("cls");
                cout<<"WELCOME ADMIN\n";
                cout<<"Enter your option\n";
                cout<<"1. New trips\n";
                cout<<"2. Display a Trip\n";
                cout<<"3. Display a Reservation\n";
                cout<<"Enter any other key for exit\n\n";
                while(1){
                    cout<<"\nENTER UR CHOICE: ";
                    cin>>ch1;
                    switch(ch1){
                        case 1:
                            obj.ad_writedata();
                            break;
                        case 2:
                            obj.ad_display();
                            break;
                        case 3:
                            obj.us_display();
                            break;

                        default:
                            exit(0);
            }
        }
            case 2:
                system("cls");
                cout<<"WELCOME USER\n";
                cout<<"Enter your option\n";
                cout<<"1. New Reservation\n";
                cout<<"Enter any other key for exit\n\n\n";
                while(1){
                    cout<<"\nENTER UR CHOICE: ";
                    cin>>ch2;
                    switch(ch2){
                        case 1:
                            cout<<"-----------------------------------";
                            cout<<"\n Choose Your destination\n";
                            cout<<"-----------------------------------\n";
                            obj.ad_display();
                            cout<<"\n";
                            obj.us_writedata();
                            break;
                        default:
                            exit(0);
                    }
                
        
    }
}
