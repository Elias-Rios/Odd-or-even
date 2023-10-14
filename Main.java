import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print ("Enter a number to check if it's even or odd: ");
    int num = keyboard.nextInt();
    String odd = "odd!";

    //processes
    if (num % 2 == 0) 
      odd = "even!";

    //output
    System.out.println(num + " is " + odd);
    keyboard.close();
  }
}