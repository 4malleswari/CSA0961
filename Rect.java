import java.util.*;
class Square1{
	void area(int a){
		int area = a*a;
		System.out.println("Area of Square:"+area);
		}
}
class Rect extends Square1{
	void area(int x, int y){
		super.area(x);
		int rect = x*y;
		System.out.println("Area of Rectangle:"+rect);
		}

public static void main(String arg[]){
	Rect n = new Rect();
	n.area(4,2);
	}
}