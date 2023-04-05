import java.util.*;
import java.lang.Math;

class Rectanglec extends Shape implements Comparable
{
	private double w;
	private double h;
	public Rectanglec(double w, double h)
	{
		this.w = w;
		this.h = h;
	}

	public double area()
	{
		return w * h;
	}

	public int compareTo(Object other)
	{
		Shape otherRect = (Shape)other;
		return (int)(this.area() - otherRect.area());
	}
}

public class RectangleSort
{
	public static void main(String[] args)
	{
		Rectanglec vec[];
		vec = new Rectanglec[10];
		double randomW = 0, randomH = 0;
		for(int i = 0; i < vec.length; i++)
		{
			randomW = 100 * Math.random();
			randomH = 100 * Math.random();
			vec[i] = new Rectanglec(randomW, randomH);
		}
		Arrays.sort(vec);
		for(int i = 0; i < vec.length; i++)
		{
			System.out.println("Dien tich HCN " + i + " = " + Math.round(vec[i].area()) + ", ");
		}
	}
}