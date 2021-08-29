#include <iostream>
#include <iomanip>
#include <string.h>
using namespace std;

struct place{


};

struct info{

   string name;
   int age;
   string phone;
   string email;
   string season[2]={"summer","winter"};
   string package[2]={"VIP","NORMAL"};
   string place[3]={"GONDER","AXUM","HARAR"};
   int id;


};

 void menu();
 void getinfo(info[],int);
 void display(info[], int, int,int );

int main()

{

    cout<<setw(70)<< "******************************************************"<< endl;
    cout<< setw(50)<<"WELCOME "<< endl;
    cout<< setw(70)<<"******************************************************"<< endl;
     cout<< setw(40)<< "ANIT tour and travel agency "<<endl;
   menu();


}
void menu()
   {
       int p,s,pk;
        int choice;
        int count=0;
       info inform[100];
    menu:

    cout<<endl<< setw(52)<< " select 1 to book tour "<< endl;
    cout<<endl<< setw(52)<< " select 2 to edit "<< endl;
    cout<<endl<< setw(52)<< " select 3 to search "<< endl;
    cout<< endl<<setw(45)<< "select 4 to input rating  "<< endl;
    cout<< endl<< setw(45)<< " select 5 to see record "<<endl;
    cout<<endl<< setw(45)<< "select 6 to see reports "<< endl;
    cout<< endl<<setw(48)<< "select 7 to see information"<< endl;

    cin>> choice;
     if (choice == 1)
    {
        count++;
        getinfo(inform,count);

          goto menu;



    }else if (choice ==2)
    {

    }else if(choice== 3)
    {

    }else if (choice ==4 )
    {

    }else if (choice ==5 )
    {
        display(inform, p, s, pk);
    }
    else if (choice ==6 )
    {
    }
    else{
        cout<< "invalid choice! enter again"<< endl;
       goto menu;
    }


    }
 void getinfo(info inform[],int count){
      string cplace;
       int p,s,pk;
       cout<<"Enter name: ";
       cin>>inform[count].name;

       cout<<"Enter age: ";
       cin>>inform[count].age;

       cout<<"Enter email: ";
       cin>>inform[count].email;

       cout<<"Enter phone: ";
       cin.ignore();
       getline(cin,inform[count].phone,'\n');


       cout<<"Enter destination of choice: "<<endl;

       cout<<"0 for Gonder "<<endl;
       cout<<"1 for Axum "<<endl;
       cout<<"2 for Harar"<<endl;
       cin>>p;
        cin.ignore();
       inform[count].place[p];
 }
