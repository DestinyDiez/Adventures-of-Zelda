import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     
     Scanner scan = new Scanner(System.in);
     
     int score = -10;
     if (score < 0 || score > 100)
     { 
    
     System.out.println("♣Adventures of Zelda♣");
     System.out.println("♥Welcme Please Choose one the following♥");
     System.out.println(">Start New Game");
     System.out.println(">Resume Game");
     System.out.println(">Create Character");
     System.out.println(">Edit Character");
     System.out.println(">Choose Map");
     System.out.println(">Shop");
     System.out.println(">Buy Coins");
     System.out.println(">Find Friends");
     System.out.println(">Settings");
     System.out.println(">Leave Game");
     System.out.println("♣have fun on your adventure♣");
     String name = scan.next();
      

  
    }
     if (score >= 0 || score <= 100)
     { 
    System.out.println("Leave game");
    String name = scan.next();
     }
     else if (-10 == 0)
     { 
    System.out.println("no");
    
    if (score < 0 || score > 100)
    { 
   System.out.println("Resume Game");
   String name = scan.next();
    }
    else if (-10 == 0)
    {  
    System.out.println("no");
    }
    



     }
 }}

  
