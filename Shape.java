class Shape
{
int r;
void get()
{
r=4;
}
void cal()
{
System.out.println("r:"+r);
}
}
class Sphere extends Shape
{
double pi,area,volume;
void get1()
{
pi=3.14;
}
void cal1()
{
area=4*pi*r*r;
volume=1.33*pi*r*r*r;
System.out.println("Area:"+area);
System.out.println("Volume:"+volume);
}
}
class Cone extends Sphere
{
int l,h;
double area1,volume1;
void get2()
{
l=10;
h=6;
}
void cal2()
{
area1=area+pi*r*(l+r);
volume1=volume+(0.33)*pi*r*r*h;
System.out.println("Area:"+area1);
System.out.println("Volume:"+volume1);
}
}
class Cylinder extends Cone
{
double area2,volume2;
int h;
void get3()
{
h=9;
}
void cal3()
{
area2=area1+2*pi*r*(h+r);
volume2=volume1+pi*r*r*h;
System.out.println("Area:"+area2);
System.out.println("Volume:"+volume2);
}
}
class Areatest
{
public static void main(String arg[])
{
Cylinder obj=new Cylinder();
obj.get();
obj.get1();
obj.get2();
obj.get3();
obj.cal();
obj.cal1();
obj.cal2();
obj.cal3();
}
}




