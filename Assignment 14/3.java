import java.util.Scanner;

public class VStarPattern2 {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int i, j, k, l;
		
		System.out.print("Enter V Shape Star Pattern Rows = ");
		int rows = sc.nextInt();
		
		System.out.println("Printing V Shape Star Pattern");
		i = 1 ;
		while( i <= rows) 
		{
			j = 1 ;
			while( j <= i ) 
			{
				System.out.print("*");
				j++;

			}
			k = 1 ;
			while( k <= 2 * (rows - i) ) 
			{
				System.out.print(" ");
				k++;
			}
			l = 1 ;
			while( l <= i ) 
			{
				System.out.print("*");
				l++;
			}
			System.out.println();
			i++;
		}
	}
}