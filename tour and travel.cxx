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