import java.util.*;
class Commandcal{
public static void main(String[] args){
if(args.length!=3){
System.out.println("Usage is Calculator <number 1> <operator> <number 2>\n");
}
else{
double num1= Double.parseDouble(args[0]);
double num2= Double.parseDouble(args[2]);
String str = args[1];
double result;
switch(str)
{
case "+": result= num1+num2;
	System.out.println(result);
	break;
case "-": result= num1-num2;
	System.out.println(result);
	break;
case "x": result= num1*num2;
	System.out.println(result);
	break;
case "/": result= num1/num2;
	System.out.println(result);
	break;	
}
}
}
}
	
