import java.util.Scanner; 
public class addition
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);    
		int a,b,c;
		
		System.out.println("Enter a");
		a = ip.nextInt();
 		
		System.out.println("Enter b");
		b = ip.nextInt();
	
		c = a + b;

		System.out.println("C is : "+c);
      }
} 