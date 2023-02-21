import java.util.*;
class multithread{
public static void main(String[] args){
System.out.println("Enter string 1\n");
Scanner sc= new Scanner(System.in);
String str= sc.nextLine();
System.out.println("Enter string 2\n");
String str1= sc.nextLine();
A obj1 = new A(str);
B obj2 = new B(str1);
obj1.start();
try{
//obj1.sleep(1000);
}
catch(Exception e){}
obj2.start();
try{
//obj2.sleep(1000);
}
catch(Exception e){}
}
}
class A extends Thread{
private String str;
public A(String str){
this.str=str;
}
public void run(){
int i;
for(i=0;i<5;i++){
System.out.println("String 1: "+str);
A obj1 = new A(str);
try{
obj1.sleep(1000);
}
catch(Exception e){}
}
}
}
class B extends Thread{
private String str1;
public B(String str1){
this.str1=str1;
}
public void run(){
int i;
for(i=0;i<5;i++){
System.out.println("String 2: "+str1);
B obj2 = new B(str1);
try{
obj2.sleep(1000);
}
catch(Exception e){}
}
}
}

