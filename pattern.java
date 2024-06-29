import java.util.*; 
class pattern
{
    public int pas(int i)
    {
        if (i == 0)
            return 1;
        return i * pas(i - 1);
    }
    public static void main(String[] args)
    {
        int n = 4, i, j;
        pattern m = new pattern();
        for (i = 0; i <= n; i++) 
	{
            for (j = 0; j <= n - i; j++) 
		{
                System.out.print(" ");
            	}
            for (j = 0; j <= i; j++) 
		{
                System.out.print(" "+ m.pas(i)/ (m.pas(i - j) * m.pas(j)));
           	 }
            System.out.println();
        }
    }
}