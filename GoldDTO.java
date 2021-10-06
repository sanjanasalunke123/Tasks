public class DrivingLicDTO{

public DrivingLicDTO(){
System.out.println("DrivingLicDTO  object is created");



}
private long driverId;
private String name;
private int adharNo;


public long getDriverId(){
return driverId;

}

public void setDriverId (long driverId){
this.driverId=driverId;



}
public String getName(){
return name;
}

public void setName(String name){
this.name=name;

}

public int getAdharNo(){
return adharNo;
}

public void setAdharNo(int adharNo){
this.adharNo=adharNo;
}
}
