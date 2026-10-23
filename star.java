import java.util.Scanner;

class star 
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);

        int a, b, n;

        System.out.print("Enter the number: ");
        n = sc.nextInt();

        for (a = 1; a <= n; a++) 
		{
            for (b = 1; b <= n; b++) 
			{
                if (a >= 2 && b >= 2 && b <= n - 1) 
				{
                    System.out.print("  ");
                } else 
				{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
