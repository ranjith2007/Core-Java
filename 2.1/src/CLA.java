
public class CLA {
	public static int isPalindrome(String str)
    {
        int n = str.length();
  
        
        for (int i = 0; i < n / 2; i++)
            if (str.charAt(i) != str.charAt(n - i - 1))
  
        return 0;
  
        return 1;
    }
  
    public static void main(String[] args)
    {
  
        if (args.length > 0) {
  
            int res = isPalindrome(args[0]);
  
            // Check if res is 0 or 1
            if (res == 0)
                // Print No
                System.out.println("No\n");
            else
                // Print Yes
                System.out.println("Yes\n");
        }
        else
            System.out.println("No command line " + "arguments found.");
                             
    }
}
