class House
{
	private int houseWidth;
	private int houseLength;
	String[][] house;

	public House(int i, int j)
	{
		houseWidth = i;
		houseLength = j;
		house = new String[houseWidth][houseLength];	
		
		for (int a = 0; a < houseLength; a++)
		{
			house[0][a] = "#";
			house[houseWidth-1][a] = "#";
		}
		
		for (int a = 0; a < houseWidth; a++)
		{
			house[a][0] = "#";
			house[a][houseLength-1] = "#";
		}
		
		
		for (int a = 1; a < houseLength -1; a++)
		{
			for (int b = 1; b < houseWidth - 1; b++)
			{
				house[a][b] = "-";
			}
		}
	}

	public void setFire(int a, int b)
	{
		if (a < houseWidth && b < houseLength)
		{
			house[a][b] = "F";
		}
		else
		{
			System.out.println("Error. Could not set on fire.");
		}

		for(int i = 0; i<houseWidth; i++)
		{
    			for(int j = 0; j<houseLength; j++)
    			{
        			System.out.print(house[i][j]);
    			}
    			System.out.println();
		}
	}
	
	public void spreadFire()
	{
		for(int a = 1; a < houseWidth-1; a++)
		{
    			for(int b = 1; b < houseLength-1; b++)
    			{
				String status = house[a][b];
				String top = house[a-1][b];
				String bottom = house[a+1][b];
				String right = house[a][b-1];
				String left = house[a][b+1];
 
				if (status.equals("#")) break;
				else if (status.equals("F")) break;
				else if (status.equals("S"))
				{
					house[a][b] = "F";
				}
				else if (top.equals("F") 
					|| bottom.equals("F") 
					|| right.equals("F")
					|| left.equals("F"))
				{
					house[a][b] = "S";
				}
			}
		}

		for(int i = 0; i<houseWidth; i++)
		{
    			for(int j = 0; j<houseLength; j++)
    			{
        			System.out.print(house[i][j]);
    			}
    			System.out.println();
		}
	}

	public void getStatus()
	{
		for(int i = 0; i<houseWidth; i++)
		{
    			for(int j = 0; j<houseLength; j++)
    			{
        			System.out.print(house[i][j]);
    			}
    			System.out.println();
		}
	}
    
}
