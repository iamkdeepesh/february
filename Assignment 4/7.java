import java.io.*;
 
class Main
{
    public static void main(String args[])
    {
        double principle = 10000, rate = 5, time = 2;
        double A = principle *
                    (Math.pow((1 + rate / 100), time));
          double CI = A - principle;
         
        System.out.println("Compound Interest is "+ CI);
    }
}