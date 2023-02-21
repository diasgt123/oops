import java.util.*;
class token{
public static void main(String[] args){
int sum=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the digits separated by a comma");
String s= sc.nextLine();
StringTokenizer st = new StringTokenizer(s,",");
while(st.hasMoreTokens()){
String temp= st.nextToken();
//System.out.println(temp);
int a = Integer.parseInt(temp);
sum+=a;
}
System.out.println("The sum is: "+sum);
}
}

