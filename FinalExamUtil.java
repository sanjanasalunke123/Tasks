import java.util.Scanner;	

class FinalExamUtil{
static String[]hallTicket=new String[3];

public static void main(String a[]){

Scanner sc=new Scanner(System.in);
System.out.println("enter the candidate name");
String candidateName=sc.next();

System.out.println("enter the usn No");
String usnNo=sc.next();

System.out.println("enter the Subject");
String subjectName=sc.next();

hallTicket[0]=candidateName;
hallTicket[1]=usnNo;
hallTicket[2]=subjectName;



System.out .println("main method started");
FinalExam.allow(hallTicket);
FinalExam.allow(1100);
System.out.println("main method ended");
}


}


