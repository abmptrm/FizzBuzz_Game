import java.util.Scanner;
public class Main{   
     
     
     public static void fizzBuzz(int total) {
        
        for (int i = 1; i <= total; i++) {
             if (i % 3 == 0 && i % 5 == 0){
                  System.out.println(i + " => Fizz Buzz");
             }else if (i % 3 == 0) {
                  System.out.println(i + " => Fizz");
             }else if (i % 5 == 0) {
                  System.out.println(i + " => Buzz");
             }else{
                  System.out.println(i);
             }
        }
        
     }
    
    
	public static void main(String[] args) {
	     
	     Scanner inputUser = new Scanner(System.in);
	     
	     System.out.print("Masukan: ");
	     int x = inputUser.nextInt();
	     
	     fizzBuzz(x);
		
     }
}
