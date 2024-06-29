class R192211434V
{
public static void main(String arg[])
{
int n=6;
int sum=1;
for(int i=2;i<=n/2;i++)
{
if(n%i==0)
{
sum=sum+i;
}
}
if(sum==n)
{
System.out.println("Perfect Number");
}
else
{
System.out.println("Not Perfect Number");
}
}
}
