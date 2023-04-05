import java.util.Scanner;
import java.util.*;
import java.util.Vector;
import java.util.Enumeration;
import java.util.Arrays;
import java.lang.Math;

public class StudentManagement
{
	Vector<Student> list = new Vector<Student>();

	public StudentManagement()
	{
		while(true)
		{
			System.out.println("-	CHUONG TRINH QUAN LY SINH VIEN-*");
			System.out.println("-Chuc nang chuong trinh-*");
			System.out.println(" 1.Nhap danh sach sinh vien.");
			System.out.println(" 2.Xem danh sach sinh vien.");
			System.out.println(" 3.Sap xep danh sach sinh vien tang dan diem trung binh.");
			System.out.println(" 4.Tim sinh vien theo ten.");
			System.out.println(" 5.Thoat.");
			Scanner sc = new Scanner(System.in);
			System.out.print("Lua chon chuc nang: ");
			int n = sc.nextInt();
			switch(n)
			{
				case 1:
					this.input();
					break;
				case 2:
					this.view();
					break;
				case 3:
					sort();
					break;
				case 4:
					search();
					break;
				case 5:
					System.out.println("--------Chuong trinh ket thuc--------");
					return;
			}
		}
	}

	public void input()
	{
		System.out.print("Nhap so luong sinh vien: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++)
		{
			System.out.println("Nhap thong tin sinh vien thu: " + i);
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("Ten: ");
			String name = sc.nextLine();
			System.out.print("Diem trung binh: ");
			double aver = sc.nextDouble();
			Student st = new Student(id, name, aver);
			list.add(st);
		}
		System.out.println("\n------------------\n");
	}

	public void view()
	{
		System.out.println("Thong tin danh sach sinh vien");
		Enumeration vEnum = list.elements();
		int i = 1;
		while(vEnum.hasMoreElements())
		{
			Student st = (Student)vEnum.nextElement();
			System.out.println(" " + i + ".ID: " + st.getId() + ", ten: " + st.getName() + ", diem trung binh: " + st.getAver());
			i++;
		}
		System.out.println("\n------------------\n");
	}

	public void sort()
	{
		Student[] sts = new Student[list.size()];
		int idx = 0;
		Enumeration vEnum = list.elements();
		while(vEnum.hasMoreElements())
		{
			sts[idx] = (Student)vEnum.nextElement();
			idx++;
		}
		Arrays.sort(sts);
		System.out.println("\nDanh sach sinh vien da sap xep--");
		for(int i = 0; i < sts.length; i++)
		{
			System.out.println(" " + (i + 1) + ".ID: " + sts[i].getId() + ", ten " + sts[i].getName() + ", diem trung binh: " + sts[i].getAver()); 
		}
		System.out.println("\n------------------\n");
	}

	public void search()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten sinh vien can tim: ");
		String name = sc.nextLine();
		Enumeration vEnum = list.elements();
		System.out.println("\nThong tin tim kiem");
		int check = 0;
		while(vEnum.hasMoreElements())
		{
			Student st = (Student)vEnum.nextElement();
			if(st.getName().indexOf(name) != -1)
			{
				check = 1;
				System.out.println("ID: " + st.getId() + ", ten " + st.getName() + ", diem trung binh " + st.getAver());
			}
		}
		if(check == 0)
		{
			System.out.println("\nKhong tim thay sinh vien da nhap!");
		}
		System.out.println("\n------------------\n");
	}
	
	public static void main(String[] args)
	{
		new StudentManagement();
	}
}



class Student implements Comparable
{
	private int id;
	private String name;
	private double aver;
	
	public Student()
	{
		id = 0;
		name = "";
		aver = 0;
	}

	public Student(int id, String name, double aver)
	{
		this.id = id;
		this.name = name;
		this.aver = aver;
	}

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public double getAver()
	{
		return aver;
	}

	public int compareTo(Object other)
	{
		Student oth = (Student)other;
		return (int)(this.aver - oth.aver);
	}
}



