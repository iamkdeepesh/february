class Main{
 
// Function to calculate the sum
// of numbers divisible by 3 or 4
static int sum(int N)
{
    int S1, S2, S3;
 
    S1 = ((N / 3)) * (2 * 3 + (N / 3 - 1) * 3) / 2;
    S2 = ((N / 4)) * (2 * 4 + (N / 4 - 1) * 4) / 2;
    S3 = ((N / 12)) * (2 * 12 + (N / 12 - 1) * 12) / 2;
 
    return S1 + S2 - S3;
}
 
// Driver code
 public static void main (String[] args) {
    int N = 20;
 
    System.out.print(sum(12));
}
 
}