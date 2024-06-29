class Pattern0
{
	public static void main(String arg[])
	{
	int i,j,count=1;
	int n=4;
	for( i=1; i<=n; i++ )
	{
	for( j=1; j<=i; j++ )
	{
	System.out.println(count*count+" ");
	count++;
	}
	System.out.println();
	}
	}
}