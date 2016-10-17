import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws IOException
	{
		// your code goes here
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        if(num>0)
            System.out.print("positive");
        else if(num<0)
            System.out.print("negitive");
        else
            System.out.print("zero");
	}
}