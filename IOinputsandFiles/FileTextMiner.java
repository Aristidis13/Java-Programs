import java.io.*;

public class Askisi3
{
	public static void main(String[] args) throws IOException
	{
			try
			{
				int count=0;
				String str="";
				File f = new File("src.txt");
				FileInputStream fi = new FileInputStream(f); 
				DataInputStream df = new DataInputStream(fi);
				
				FileOutputStream n = new FileOutputStream("newfile.txt");
				File nf = new File("newFile.txt");
				DataOutputStream nd = new DataOutputStream(n);
				byte []data=new byte [Math.toIntExact( f.length() )];
			
				df.read(data);
				for (int i=0; i<data.length; i++)
				{
					if(data[i]==(byte)32)
					{
						data[i]=(byte)36; 
						++count;
						str = str +(char) data[i];
					}
					else
					{
						str = str +(char) data[i];
					}
					if(data[i]==(char)'\n') 
					{
						str=str + System.lineSeparator();
					}
				}
				for(int i=0; i<str.length(); i++)
				{
					{
						nd.write((int)str.charAt(i)); 
					}
				}
				System.out.println("'src.txt' consists of " + f.length()+ " bytes.");
				System.out.println("'newfile.txt' consists of " + nf.length()+ " bytes.");
				System.out.println("The number of $ added was " + count);
				n.close();
				df.close();
				fi.close(); 
			}
			catch (FileNotFoundException e)
			{
				System.err.println("File has not been Found.\nBring a file named 'src.txt' and run the program again.");
			}
	}
}