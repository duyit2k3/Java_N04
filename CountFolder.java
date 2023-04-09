import java.io.*;

public class CountFolder
{
	public static int count(String path)
	{
		int cnt = 0;
		File f = new File(path);
		String[] filenames = f.list();
		for(int i = 0; i < filenames.length; i++)
		{
			File fi = new File(path + "\\" + filenames[i]);
			if(fi.isFile())
			{
				cnt++;
			}else
			{
				cnt += count(fi.getAbsolutePath());
			}
		} 
		return cnt;
	}

	public static void main(String[] args)
	{
		System.out.println(count("D:\\BaiHoc\\JavaN04"));
	}
}