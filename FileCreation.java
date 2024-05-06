import java.io.*;

class FileCreation
{
	public static void main(String args[])
	{
		try
		{
			File f = new File("SGGS.txt");
			if(f.createNewFile())
			{
				System.out.println("File "+f.getName()+"created");
			}
			else
			{
				System.out.println("File not created");
			}
		}
		catch(Exception ex)
		{
			System.err.println(ex);
		}
	}
}
