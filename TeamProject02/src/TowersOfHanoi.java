import java.util.*;


 public class TowersOfHanoi
 {
     public static int N;
     
     // Make the stack
     public static Stack<Integer>[] tower = new Stack[4]; 
 
     public static void main(String[] args)
     {
         Scanner scan = new Scanner(System.in);
         tower[1] = new Stack<Integer>();
         tower[2] = new Stack<Integer>();
         tower[3] = new Stack<Integer>();
         
         // Number of disks set by user:         
         System.out.println("Enter number of disks");
         int num = scan.nextInt();
         N = num;
         pushIntoStack(num);
     }

     // This method takes a stack and pushes "disks" in.
     public static void pushIntoStack(int n)
     {
         for (int j = n; j > 0; j--)
             tower[1].push(j);
         display();
         move(n, 1, 2, 3);         
     }

     // Main recursive function.
     public static void move(int n, int a, int b, int c)
     {
         if (n > 0)
         {
             move(n - 1, a, c, b);     
             int d = tower[a].pop();                                             
             tower[c].push(d);
             display();                   
             move(n-1, b, a, c);     
         }         
     }
     
     // Function that creates a display for the stacks and disks
     public static void display()
     {
         System.out.println("  A  |  B  |  C");
         System.out.println("---------------");
         for(int i = N - 1; i >= 0; i--)
         {
             String d1 = " ", d2 = " ", d3 = " ";
             try
             {
                 d1 = String.valueOf(tower[1].get(i));
             }
             catch (Exception e){
             }    
             try
             {
                 d2 = String.valueOf(tower[2].get(i));
             }
             catch(Exception e){
             }
             try
             {
                 d3 = String.valueOf(tower[3].get(i));
             }
             catch (Exception e){
             }
             System.out.println("  " + d1 + "  |  " + d2 + "  |  " + d3);
         }
         System.out.println("\n");         
     }
 }