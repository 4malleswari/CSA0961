import java.util.*;
class R192211434VI
{
public static void main(String[]args)
{
Scanner input=new Scanner(System.in);
int pos=0,neg=0,p=0,n=0,num=0;
while(num!=-1)
{
System.out.print("enter the number:-");
num=input.nextInt();
if(num>0)
{
pos++;
p=p+num;
} 
else if(num<0)
{
neg++;
n=n+num;
}
}
System.out.println("enter the no.of negative values"+neg);
System.out.println("enter the no.of positive values"+pos);
System.out.println("enter the sumof negative values"+n);
System.out.println("enter the sumof positive values"+p);
float p1=p/pos; 
float p2=n/neg;
System.out.println("avg of pos is"+p1);
System.out.println("avg of neg is"+p2);
}
}