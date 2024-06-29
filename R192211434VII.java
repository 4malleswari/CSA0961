class Number implements Runnable
{ 
public void run()
{
int i,k=0;
int n=5;
for(i=2;i<n;i++)
{
if(n%i==0)
{
k++;
}
}
if(k!=0)
{
System.out.println(n+" is NOT a Prime");
}
else
{
System.out.println(n+" is a Prime");
}
}
}
class R192211434VII
{
public static void main(String arg[]){
Number m = new Number();
Thread t=new Thread(m);
t.start();
} 
}