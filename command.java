import java.util.*;
class command{
public static void main(String[] args)
{
if(args.length!=3)
{
	System.out.println("Usage command <num1> <operator> <num2>");
}
else{
	double num1 = Double.parseDouble(args[0]);
	double num2 = Double.parseDouble(args[2]);
	String operator = args[1];
	double result=0;
	switch(operator)
	{
		case "+" : result= num1+num2;
			System.out.println(result);
			break;
		case "-" : result = num1-num2;
			System.out.println(result);
			break;
		case "*" : result = num1*num2;
			System.out.println(result);
			break;
		case "/": result = num1/num2;
			System.out.println(result);
			break;
	}

}}
}
