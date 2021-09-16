class EngineerGet{  

 static String []branchName= new String[3];

 public static void main(String a[]){
 
branchName[0] = "cse";
branchName[1] = "mech";
branchName[2] = "electrical";
getbranchName();
}

 public static void getbranchName(){
 for(int z=branchName.length-1;z>=0;z--){
 System.out.println(branchName[z]);
}
 }
}