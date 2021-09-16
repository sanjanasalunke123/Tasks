class CountriesName{ 

 static String []countriesName= new String[7];

 public static void main(String a[]){

countriesName[0] = "india";
countriesName[1] = "england";
countriesName[2] = "usa";
countriesName[3] = "southafrica";
countriesName[4] = "pakisthan";
countriesName[5] = "bangla";
countriesName[6] = "africa";
getCountriesName();
}

public static void  getCountriesName(){
System.out.println(countriesName.length);
 for(int z=0; z<countriesName.length;z++){
System.out.println(countriesName[z]+"");
}

}
}