import java.util.*;
import java.io.*;
class stringtoken
{
public static void main(String[] args)
{
	int sum=0;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the digits separated with a comma");
	String str =sc.nextLine();
	StringTokenizer st = new StringTokenizer(str,",");
	while(st.hasMoreTokens()){
	String temp = st.nextToken();
	int a = Integer.parseInt(temp);
	sum+=a;
	}
	System.out.println(sum);
}
}
