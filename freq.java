import java.util.*;
class freq
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string");
String str = sc.nextLine();
System.out.println("Enter the character");
char ch = sc.nextLine().charAt(0);
int length = str.length();
int count=0;
int i;
for(i=0;i<length;i++)
{
if(str.charAt(i)==ch)
{
count++;
}
}
System.out.println("Frequecy = " + count);
}
}

