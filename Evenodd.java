import java.io.*;
class Evenodd{
public static void main(String a[]) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int num=Integer.parseInt(br.readLine());
if(num%2==0)
System.out.println("even");
else
System.out.println("odd");
}
} 