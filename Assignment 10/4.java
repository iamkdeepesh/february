import java.io.*;
import java.lang.*;
  
class GFG {
    public static int log2(int N)
    {
        int result = (int)(Math.log(N) / Math.log(2));
  
        return result;
    }
    public static void main(String[] args)
    {
  
        int N = 1024;
  
        System.out.println("Log " + N + " to the base 2 = "+ log2(N));
    }
}