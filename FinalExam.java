class FinalExam{

    public static String universityName = "VTU";
    public static  int fees  =1350;
    

       public static void allow(String[] hallTicket){
       System.out.println("Start of allow method");
          
        if(hallTicket != null){
        getHallTicket(hallTicket);
}

else{
System.out.println("No hall ticket found");
}
System.out.println("end of allow method") ;
} 
           
public static void allow(int fees){
System.out.println("start of allow method with fees");
if(fees>1000){
System.out.println(fees);
}

else{
System.out.println("gubee...please pay the fees");
}
System.out.println("end of allow method with fees");
}

 public static void getHallTicket(String[] hallTicket){
 for(int i=0;i<hallTicket.length;i++){
 System.out.println(hallTicket[i]);
        }

      }




}