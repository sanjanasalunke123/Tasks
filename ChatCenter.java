class ChatCenter{



String centerName;
int centerId;
String location;
String ownerName;
boolean isOpen;
String items[]=new String[5];


public ChatCenter(){

System.out.println("ChatCenter object is created");
this("sai chats","near KLE ground",2,"ranganath",true);




}

public ChatCenter(String centerName,String location,int centerId,String ownerName){


this.centerName=centerName;
this.location=location;
this.items=items;
this.centerId=centerId;
this.ownerName=ownerName;
this. isOpen= isOpen;
}


public void displayChatCenterDetails(){


System.out.println(this.centerName+" "+this.centerId+" "+this.ownerName+" "+this.location+" "+this.boolean isOpen);
}

public void getItems(){
for(int i=0;i<items.length;i++){
System.out.println(this.items[i]);
}





}


}