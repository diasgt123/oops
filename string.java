import java.util.*;
class string
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string");
String str = sc.nextLine();
int i,flag=0;
int len=str.length();
str=str.toLowerCase(); 
for(i=0;i<len/2;i++)
{
if(str.charAt(i)!=str.charAt(len-i-1))
{
flag=1;
break;
}
}
if(flag==1){
System.out.println("It is not a palindrome");
}
else
{
System.out.println("It is a palindrome");
}
}
}
