import java.util.*;
import java.lang.Math;

abstract class Shape
{
	public abstract double area();
	public String toString()
	{
		return "Dien tich la " + area();
	}
}

class Rectangle extends Shape
{
	private double h;
	private double w;
	public Rectangle(double h, double w)
	{
		this.h = h;
		this.w = w;
	}
	public double area()
	{
		return w * h;
	}
}

class Circle extends Shape
{
	private double r;
	
	public Circle(double r)
	{
		this.r = r;
	}
	
	public double area()
	{
		return Math.PI * r * r;
	}
}


public class TestShape
{
	public static void main(String[] args)
	{
		Shape vec[] = {new Circle(3), new Rectangle(4, 5), new Circle(4), new Circle(8)};
		for(int i = 0; i < vec.length; i++)
		{
			System.out.println(vec[i]);
		}
	}
}