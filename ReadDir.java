import java.io.*;

public class ReadDir
{
	public ReadDir(String path)
	{
		File f = new File(path);
		String[] filename = f.list();
		for(int i = 0; i < filename.length; i++)
		{
			System.out.println(filename[i]);
		}
	}

	public static void main(String[] args)
	{
		new ReadDir("D:\\BaiHoc");
	}
}