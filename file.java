import java.util.*;
import java.io.*;
class file{
public static void main(String[] args){
/*try{
Reader r = new FileReader("text.txt");
int ch;
ch=r.read();
while(ch!=-1){
System.out.print((char)ch);

if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
{
System.out.print(" Vowel\n");
}
else{
System.out.print(" Consonent \n");
}
ch=r.read();
}
System.out.print(" ");
r.close();
}
catch(Exception e){
System.out.print("done"+e);
}*/
try {
Reader r = new FileReader("text.txt");
int ch;
ch=r.read();
Writer w = new FileWriter("text1.txt",true);
if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
{
while(ch!=-1){
w.write(ch);
ch=r.read();
}
}
else{}
w.close();
r.close();
System.out.println("Written");
}
catch(Exception e){
System.out.print("done"+e);
}
}
}
