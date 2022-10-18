import java.util.*;
class Main{
 public static void main(String[]args){
   Scanner input = new Scanner(System.in);
   boolean run = true, a = true, b = true;
   while(true){
     System.out.println("Logic gate: ");
     String gate = input.next();
     gate = gate.toUpperCase();
      while(run){
     try{
       System.out.print("A = "); 
       a = input.nextBoolean();
       System.out.print("B = ");
       b = input.nextBoolean();
       run = false;
     } catch (InputMismatchException e){
       System.out.println("Only true and false are accepted as input values. "); 
      }
      }
      switch(gate){
        case "XNOR": 
          xnor(a,b); 
          break;
        case "AND":
          and(a,b);
          break;
        case "OR":
          or(a,b);
          break;
        case "XOR":
          xor(a,b);
          break;
        case "NAND":
          nand(a,b);
          break;
        case "NOR":
          nor(a,b);
          break;
        default: System.out.println("That is not a recognized gate");  
      }
     }
      }
  public static void and(boolean c, boolean d){
    System.out.println("output is " + (c&&d));
  }
  public static void or(boolean c, boolean d){
    System.out.println("output is " +( c||d));
  }
  public static void xor(boolean c, boolean d){
    System.out.println("output is " + !(c==d));
  }
  public static void nand(boolean c, boolean d){
    System.out.println("output is " + !(c&&d));
  }
  public static void nor(boolean c, boolean d){
    System.out.println("output is " +!(c||d));
    }
  public static void xnor(boolean c, boolean d){
    System.out.println("output is " +( c==d));
  }
}