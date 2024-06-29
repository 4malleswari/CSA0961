class Vehicle
{
int licenceplate;
String owner;
void get(int num,String name)
{
licenceplate=num;
owner=name;
}
}
class Car extends Vehicle
{
int rc;
void get1(int num)
{
rc=num;
}
void display()
{
System.out.println("Licence:"+licenceplate);
System.out.println("Owner name:"+owner);
System.out.println("RC:"+rc);
}
}
class Truck extends Vehicle
{
int capacity;
void get2( int weight)
{
capacity=weight;
}
void display1()
{
System.out.println("Licence:"+licenceplate);
System.out.println("Owner name:"+owner);
System.out.println("Capacity:"+capacity);
}
}
class Motorcycle extends Vehicle
{
int mileage;
void get3(int kilometers)
{
mileage=kilometers;
}
void display2()
{
System.out.println("Licence:"+licenceplate);
System.out.println("Owner name:"+owner);
}
}
class Main1
{
public static void main(String arg[])
{
Vehicle obj=new Vehicle();
obj.get(134,"Mavya");

Car obj1=new Car();
obj1.get1(8907);
obj1.display();

Truck obj2=new Truck();
obj2.get2(90);
obj2.display1();

Motorcycle obj3=new Motorcycle();
obj3.get3(25);
obj3.display2();
}
}




 

