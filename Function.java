import com.sun.net.httpserver.Authenticator.Result;

public class Function { 
    public static void main(String[] arg){

     System.out.println(evenNumbers(4, 10, 8));

    }

    // This function checks if any three numbers are even
   public static boolean evenNumbers(int num1, int num2, int num3){
    boolean result = num1%2==0 && num2%2==0 && num3%2==0;  
    
    /*if(num1%2==0){
        System.out.println("yippee");

      }
      if(num2%2==0){
        System.out.println("woohoo");

      }
      if(num3%2==0){
        System.out.println("wordd");

      }*/
    return result;
   }
}