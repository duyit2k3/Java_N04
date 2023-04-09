import java.io.*;

public class CountCharFile
{
	public static int count(String path, char c)
	{
		int cnt = 0;
		FileInputStream fis = null;
		try{
			fis = new FileInputStream(path);
			int data = fis.read();
			while(data != -1)
			{
				if(data == c) cnt++;
				data = fis.read();
			}
		}
		catch(Exception e)
		{
			System.out.println("Loi Exception");
		}
		finally{
			try{
				fis.close();	
			}
			catch(Exception e)
			{
				System.out.println("Loi Exception");
			}
		}
		return cnt;
	}

	public static void main(String[] args)
	{
		System.out.println(count("D:\\BaiHoc\\JavaN04\\dem.txt", 'i'));
	}
}