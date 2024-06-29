class Marks
{
int python,java,c,cpp;
void get(int m1,int m2,int m3,int m4)
{
python=m1;
java=m2;
c=m3;
cpp=m4;
}
}
class Average extends Marks
{
double average;
int total;
void cal()
{
total=python+java+c+cpp;
average=total/4;
}
void display()
{
System.out.println("Total:"+total);
System.out.println("Average:"+average);
}
}
class Grade extends Average
{
void get1()
{
if(average>=75)
{
System.out.println("Distinction");
}
else if(average>=65 && average<75)
{
System.out.println("First class");
}
else if(average>=55 && average<65)
{
System.out.println("Second class");
}
else if(average>=45 && average<55)
{
System.out.println("Third class");
}
else
{
System.out.println("Fail");
}
}
}
class Grademarks
{
public static void main(String arg[])
{
Grade obj=new Grade();
obj.get(90,80,70,60);
obj.cal();
obj.display();
obj.get1();
}
}

