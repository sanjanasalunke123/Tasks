public class PropertyDTO{

public PropertyDTO(){
System.out.println("PropertyDTO is object is created");



}
private long propertyId;
private String name;
private int price;


public long getPropertyId(){
return propertyId;

}

public void setPropertyId (long propertyId){
this.propertyId=propertyId;



}
public String getName(){
return name;
}

public void setName(String name){
this.name=name;

}

public int getPrice(){
return price;
}

public void setPrice(int price){
this.price=price;
}
}
