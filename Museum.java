class Museum{

String museumName;
int noOfTypes;
String location;
boolean isClose;

public Museum(){
this("visvewaryya",17,"bangalore",false);

System.out.println("Museum object is created");





}

public Museum(String museumName,int noOfTypes,String location,boolean isClose)
{

this.museumName=museumName;
this.noOfTypes=noOfTypes;   
this.location=location;
this.isClose= isClose;

}



public void displayMuseumDetails(){

System.out.println(this.museumName+""+this.noOfTypes +""+this.location+""+this.isClose);
}
}