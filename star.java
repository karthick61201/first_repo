class star
{
	public static void main(String args[])
	{	
		int a, b;
   		System.out.println();

      	for(a = 1; a <= 5; a++)
		{
			for(b = 1; b <= 5; b++)
			{
				if((a == 2 && b == 2) || (a == 2 && b == 3) || (a == 2 && b == 4))
				{
					System.out.print("  ");
				}
				else if((a == 3 && b == 2) || (a == 3 && b == 3) || (a == 3 && b == 4))
				{
					System.out.print("  ");
				}
				else if((a == 4 && b == 2) || (a == 4 && b == 3) || (a == 4 && b == 4))
				{
					System.out.print("  ");
				}
				else if((a == 5 && b == 2) || (a == 5 && b == 3) || (a == 5 && b == 4))
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print("* ");
				}
			}
		 System.out.println(); 
		}
	}
}
