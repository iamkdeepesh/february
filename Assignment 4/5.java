import java.io.*;
 
class GFG {
    static int getProduct(int n)
    {
        int product = 1;
 
        while (n != 0) {
            product = product * (n % 10);
            n = n / 10;
        }
 
        return product;
    }
    public static void main(String[] args)
    {
        int n = 4513;
 
        System.out.println(getProduct(n));
    }
}