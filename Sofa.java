class Sofa{

public String Type;
public int amount;

public Sofa(String Type,int amount){

System.out.println("sofa object is created");
this.Type= Type;
this.amount=amount;
System.out.println(this.Type+""+this.amount);

}

public static void main(String a[]){


Sofa sofa= new Sofa("square",1234);
Sofa sofa1 = new Sofa("round",2345);


}






}