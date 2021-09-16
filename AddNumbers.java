/* method overloading\*

class AddSubNumbers{


public static void main(String a[]){
add(1,7);
add(1,7,8);
sub(7,1);
sub(1,7,8);
}
 public static void add(int a,int b){
 System.out.println(a+b);

}

 public static void add(int a,int b,int c){
 System.out.println(a+b+c);
}

 public static void sub(int a,int b){
 System.out.println(a-b);
}
 public static void sub(int a,int b,int c){
 System.out.println(a-b-c);
}


