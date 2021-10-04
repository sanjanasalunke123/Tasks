class Appliances{

String appliancesName;
int noOfitems;
String location;
boolean isOpen;

public Appliances(){
this("fan",17,"bangalore",true);

System.out.println("Apppliances object is created");





}

public Appliances(String appliancesName,int noOfitems,String location, boolean  isOpen){


this.appliancesName=appliancesName;
this.noOfitems=noOfitems;   
this.location=location;
this.isOpen= isOpen;

}



public void displayAppliancesDetails(){

System.out.println(this.appliancesName+""+this.noOfitems +""+this.location+""+this.isOpen);
}
}