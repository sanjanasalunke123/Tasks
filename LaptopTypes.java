jclass LaptopTypes{
  static String LNames[]={"dell","aces","lenavo","kesar 5"};
  static int CostOfLnames[]={1200,13000,7000,4000};


public static void main(String a[]){
System.out.println("main method started");
getCostOfLnames(CostOfLnames);
getLNames(LNames);
System.out.println("main method ended");
 }
public static void getCostOfLnames(int []CostOfLnames){

for(int i=0;i<CostOfLnames.length;i++){
System.out.println(CostOfLnames[i]);



}

}
public static void getLNames(String []LNames){

for(int i=0;i<LNames.length;i++){
System.out.println(LNames[i]);
}
}}