class R192211434IV
{
public static void main(String arg[])
{
int num=153,x=num;
int rem=0;
int rev=0;
while(num!=0)
{
rem=num%10;
rev=rev+rem*rem*rem;
num=num/10;
}
if(x==rev)
{
System.out.println("Armstrong Number");
}
else
{
System.out.println("Not Armstrong Number");
}
}
}