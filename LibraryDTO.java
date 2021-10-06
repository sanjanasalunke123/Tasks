public class LibraryDTO{

public LibraryDTO(){
System.out.println("LibraryDTO is object is created");



}
private long libId;
private String libName ;
private int price;


public long getLibId(){
return libId;

}

public void setLibId (long libId){
this.libId=libId;



}
public String getLibName(){
return libName;
}

public void setLibName(String libName){
this.libName=libName;

}

public int getPrice(){
return price;
}

public void setPrice(int price){
this.price=price;
}
}
