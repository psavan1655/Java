 //Greedy algorithm to find the minimum number of coins
import java.util.*; 
  
class GreedyAlgo
 
{ 
  
    // All denominations of Indian Currency  
    static int curr[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000}; 
    static int n = curr.length; 
  
    static void minimum(int V) 
    { 
       
        Vector<Integer> ans = new Vector<>(); 
  
     
        for (int i = n - 1; i >= 0; i--) 
        { 
            
            while (V >= curr[i])  
            { 
                V -= curr[i]; 
                ans.add(curr[i]); 
            } 
        } 
  
        // Printing output  
        for (int i = 0; i < ans.size(); i++) 
        { 
            System.out.print( 
                " " + ans.elementAt(i)); 
        } 
    } 
  
    //main method: the execution of the program starts from here
    public static void main(String[] args)  
    { 
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the amount of money to be checked:");
        int n = sc.nextInt();
        System.out.print("Minimum number of denominations needed for "+ n + " is:"); 
        minimum(n); 
    } 
} 