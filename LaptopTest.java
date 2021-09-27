class LaptopTest{


public static void main(String a[]){

Laptop laptop= new Laptop();
laptop.brandName="dell";
laptop.price=35000;
laptop.color="black";
laptop.type="i3";


System.out.println(laptop.brandName+" "+laptop.price+" "+laptop.color+" "+laptop.type);

laptop.quality();


Laptop laptop1= new Laptop();
laptop1.brandName="lenavo";
laptop1.price=50000;
laptop1.color="gray";
laptop1.type="i4";

System.out.println(laptop1.brandName+" "+laptop1.price+" "+laptop1.color+" "+laptop1.type);
laptop1.quality();


Laptop laptop2= new Laptop();
laptop2.brandName="hp";
laptop2.price=90000;
laptop2.color="gray";
laptop2.type="i6";

System.out.println(laptop2.brandName+" "+laptop2.price+" "+laptop2.color+" "+laptop2.type);
laptop1.quality();
}
}