public class twodarray 
{
    public static void main (String args[])
{
	int mat[][]={{0,1},{2,3}};
	int k=3;
	for(int i=0;i<mat.length;i++)
	{
		for(int j=0;j<mat[0].length;j++)
		{
			if(mat[i][j]==k)
			{
				System.out.print("location is = [" + i +"," +j + "]");
			}
		}
	}
	
	
	
	
}
    
}
