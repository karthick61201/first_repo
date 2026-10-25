class double_upndown_pyramid
{
	public static void main(String args[])
	{
		for(int i = 1; i <= 9; i++)
		{
			for(int j = 1; j <= 10; j++)
			{
				if((i == 1 && j == 2) || (i == 1 && j == 3) || (i == 1 && j == 4) || (i == 1 && j == 5)
					 || (i== 1 && j == 6) || (i== 1 && j == 7) || (i== 1 && j == 8) || (i== 1 && j == 9))
				{
					System.out.print("  ");
				}
				else if((i== 2 && j == 3) || (i == 2 && j == 4) || (i == 2 && j == 5) || (i== 2 && j == 6)
						|| (i== 2 && j == 7) || (i== 2 && j == 8))
				{
					System.out.print("  ");
				}	
				else if((i== 3 && j == 4) || (i== 3 && j == 5) || (i== 3 && j == 6) || (i== 3 && j == 7))
				{
					System.out.print("  ");
				}	
				else if((i == 4 && j == 5) || (i == 4 && j == 6)) 
				{	
					System.out.print("  ");
				}	
				else if((i == 6 && j == 5) || (i == 6 && j == 6))
				{
					System.out.print("  ");
				}
				else if((i== 7 && j == 4) || (i== 7 && j == 5) || (i== 7 && j == 6) || (i== 7 && j == 7))
				{
					System.out.print("	");
				}
				else if((i== 8 && j == 3) || (i== 8 && j == 4) || (i== 8 && j == 5) || (i== 8 && j == 6) 
                 || (i == 8 && j == 7) || (i == 8 && j == 8))
				{
					System.out.print("  ");
				}
				else if((i== 9 && j == 2) || (i== 9 && j == 3) || (i== 9 && j == 4) || (i == 9 && j == 5)    
                  || (i == 9 && j == 6) || (i == 9 && j == 7) || (i == 9 && j == 8) 
                  || (i == 9 && j == 9))
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
