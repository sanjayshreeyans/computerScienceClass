public class RamTracing {
    public static void main (String[] args)
   {
   	int A, B, C;
   	double answer;
 
   	String words = "This is a quiz";
   	A = -4;
   	B = A * A;
   	C = A - 2 * 5;
   	A = A + 10;
   	answer = A + (B + C) / 3;
 
   	System.out.println ("What is this?");
   	System.out.print (words);
   	System.out.printf (A+"%.2f", answer);
    System.out.println();
   	System.out.println (C + "and some numbers!");
   }
 


}