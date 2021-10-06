public class LicDTO1{

public LicDTO1(){
System.out.println("LicDTO object is created ");
}

private String name;
private int invest;
private String policyEnd;



public String getName(){
return name;
}

public String setName(String name){
this.name=name;
}

public int getInvest(){
return invest;

}

public int setInvest(int invest){

this.invest=invest;

}

public String getPolicyEnd(){
return policyEnd;
}

public String setPolicyEnd(String policyEnd){
this.policyEnd=policyEnd;
}
}