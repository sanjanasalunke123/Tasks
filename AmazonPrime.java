class AmazonPrime{
static String movies[]={"shersha","cindrella","rakthacharitra","kgf","robert","yuvaratna","master"};
static String series[]={"the family man","money heist","four more shots","the last shifts","mumbai diaries","inside edges","mirzapur"};


static String movie="dia";

public static void main(String a[]){
System.out.println("main method started");
getMovies(movies);

String mov=getMovies(movie);
System.out.println(mov);
}

public static void getMovies(String[] movies){
System.out.println("inside getMovies method with string array parameteters");
for(int i=0;i<movies.length;i++){
System.out.println(movies[i]);
}
}



public static String  getMovies(String movies){
System.out.println("inside the get movies method");
return movie;
}
}