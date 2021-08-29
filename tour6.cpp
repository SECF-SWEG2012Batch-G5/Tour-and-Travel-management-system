#include<iostream>
#include<iomanip>
using namespace std;
struct place
{ string name,season;
   int sits;
int 
};
class Turist{
private:
    string pack[2] = {"VIP","NORMAL"};
    string season[2] = {"Summer","winter"};
public:
    string name;
    int age,seat;
    
    
};
int admin(place sites[],int x);
int main(){
	 cout<<setw(70)<< "******************************************************"<< endl;
    cout<< setw(50)<<"WELCOME "<< endl;
    cout<< setw(70)<<"******************************************************"<< endl;
     cout<< setw(60)<< "ANIT tour and travel agency "<<endl;
     int n;
      cout<<"\nDo you want to log in:"<<endl;
      cout<<"Enter 1 for Admin 2 for user "<<endl;
      cin>>n;
      if(n==1)
      admin();
      user();
return 0;

}
int admin(place sites[],int x){

    sites[0].name = "Gonder";
    sites[0].season = "Summer";
    sites[0].sits = 20;
    for(int i = 1; i < x ;i++){
        sites[i] = SiteReg();
        }
        return x;
}
place SiteReg(){
        place site;
        cout<<"Enter site name: ";
        cin>>site.name;
        cout<<"Enter site season: ";
        cin>>site.season;
        cout<<"How many passengers: ";
        cin>>site.sits;
        return site;
}


Turist user(){
    Turist tour;
    cout<<"Enter name: ";
    cin>>tour.name;
    cout<<"Enter age: ";
    cin>>tour.age;
}

 
