import java.util.*;


 public class TowersOfHanoi
 {
	 // This is the int value given by user.
	 // It represents how many disc's we'll be using
     public static int disc;
     
     // Create a Stack of Integers
     public static Stack<Integer>[] tower = new Stack[4]; 
 
     public static void main(String[] args)
     {
    	 // Create the three towers we need for the problem:
    	 
         tower[1] = new Stack<Integer>();
         tower[2] = new Stack<Integer>();
         tower[3] = new Stack<Integer>();
         
    	 // Create a scanner to allow the user to input
    	 // the amount of dics we gotta use.
         Scanner scan = new Scanner(System.in);
         
         // Number of disks set by user:         
         System.out.println("Gimme the disc's: ");
         int num = scan.nextInt();
         
         // assign our global variable to the input value
         disc = num;
         
         // push that value into tower[1]
         pushIntoStack(num);
     }

     // This method takes a stack and pushes "disks" in.
     public static void pushIntoStack(int n)
     {
    	 // for-loop the global variable into the first tower variable represents 
    	 // the number of disc's
         for (int i = n; i > 0; i--)
        	 
        	 // push the disc
        	 tower[1].push(i);
         
         	// check to see if the first tower has all the disc's
         	showMe();
         	
         	// call move method
         	moveTheDisc(n, 1, 2, 3);         
     }

     // Main recursive function that moves a disc
     public static void moveTheDisc(int n, int tower1, int tower2, int tower3)
     {
    	 // base case: if n is greater than zero, then we still have disc's to move so
    	 // if n is not greater than zero, then we have no more disc's to move
         if (n > 0)
         {
        	 // subtract the one disc we're moving and recursively call it again 
        	 // but swap the "b" and "c" variables as the towers will have new values
        	 moveTheDisc(n - 1, tower1, tower3, tower2);
             
             // create temp variable for the disc moved
             int temp = tower[tower1].pop();
             
             // because we can't move a bigger disc on top of another, push the temp 
             // variable (disc being moved), into the third tower.
             tower[tower3].push(temp);
             
             // show me the towers
             showMe();
             
             // recursively call it again, subtracting another disc, and swap the
             // variables again to reflect which towers have which discs
             moveTheDisc(n-1, tower2, tower1, tower3);     
         }         
     }
     
     // Function that creates a display for the stacks and disks
     public static void showMe()
     {
    	 // Print out some tower names
         System.out.println(" Tower 1 | Tower 2 | Tower 3");
         
         // This for-loop will loop through the towers and attempt to grab
         // the value within.  If there is no value (there's no disc there) try
         // the next one.  
         for(int i = disc - 1; i >= 0; i--)
         {
        	 // Create some variables needed for placement
             int disc1 = 0;
             int disc2 = 0;
             int disc3 = 0;
 
             // try to get a value from the tower.  If there's no value (because of there not
             // being a disc in that stack slot, move on to the next tower.  Whatever is found
             // in each slot, assign it to each variable.
             try
             {
            	 disc1 = tower[1].get(i);
             }
             catch (Exception e){
             }    
             try
             {
            	 disc2 = tower[2].get(i);
             }
             catch(Exception e){
             }
             try
             {
            	 disc3 = tower[3].get(i);
             }
             catch (Exception e){
             }
             
             // print out whatever values we grabbed and put them into the 
             // string variables, then, print them out below.
             System.out.println("    " + disc1 + "    |    " + disc2 + "    |    " + disc3);
         }
         // create some space
         System.out.println("\n");         
     }
 }