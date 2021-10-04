class 	NammMetro{

String metroStation;
int noOfMetro;
String location;
boolean isClose;

public NammMetro(){
this("kempegouda",6,"bangalore",false);

System.out.println("NammMetro object is created");





}

public NammMetro(String metroStation,int noOfMetro,String location,boolean isClose)
{

this.metroStation=metroStation;
this.noOfMetro=noOfMetro;   
this.location=location;
this.isClose= isClose;

}



public void displayNammMetroDetails(){

System.out.println(this.metroStation+""+this.noOfMetro +""+this.location+""+this.isClose);
}
}