import java.io.*;
import java.util.*;
class filehand{
public static void main(String[] args)
{
try{
Reader r = new FileReader("test.txt");
int ch;
ch=r.read();
while(ch!=-1)
{	
	System.out.println((char)ch);
	ch=r.read();
}
r.close();
}
catch(Exception e){}
try{
Writer w = new FileWriter("test.txt");
String str= "How are you";
w.write(str);
w.close();
}
catch(Exception e){}
}
}
