//{ Driver Code Starts
import java.util.*;
class Replace{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
		int n=sc.nextInt();
		Solution g=new Solution();
		System.out.println(g.convertFive(n));
	}
}
}
// } Driver Code Ends


/*Complete the function below*/
class Solution{
	public static int convertFive(int n){
    String str=Integer.toString(n);
    str=str.replaceAll("0","5");
    int ans=Integer.valueOf(str);
    return ans;
    
    
    
    
    
    //add code here.
    }
}