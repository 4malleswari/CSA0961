class sqrt
{
public static void main(String[] args)
{
 int n=656;
boolean flag=false;
int i;
for(i=0;i<n;i++)
{
 double square=Math.pow(i,2);
if(square==n)
{
 System.out.println("true :"+i+",-"+i);
flag=true;
break;
}
}
if(!flag)
{
System.out.println("false");
}
}
}