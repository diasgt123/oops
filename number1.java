import java.util.*;
import java.io.*;

class number1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numbers separated by a comma\n");
        String s= sc.nextLine();
        StringTokenizer st = new StringTokenizer(s,",");
        while(st.hasMoreTokens()) {
            String temp = st.nextToken();
            int a = Integer.parseInt(temp);
            try {
                if(a%2==0) {
                    Writer w = new FileWriter("even.txt",true);
                    String str = Integer.toString(a);
                    w.write(str);
                    w.close();
                } else {
                    Writer o = new FileWriter("odd.txt",true);
                    int i;
                    boolean isPrime = true;
                    for(i=2;i<=Math.sqrt(a);i++){
                        if(a%i==0){
                            isPrime = false;
                            break;
                        }
                    }
                    if(isPrime){
                        Prime obj2 = new Prime(a);
                        obj2.start();
                        obj2.sleep(1000);
                    } else {
                        Nonprime obj1 = new Nonprime(a);
                        obj1.start();
                        obj1.sleep(1000);
                    }
                    String str = Integer.toString(a);
                    o.write(str);
                    o.close();
                }
            } catch(Exception e) {
                System.out.println("exception"+e);
            }
        }
    }
}

class Prime extends Thread {
    private int num;
    public Prime(int num) {
        this.num=num;
    }
    public void run() {
        try {
            Writer p = new FileWriter("prime.txt",true);
            String str1 = Integer.toString(num);
            p.write(str1);
            p.close();
        } catch(Exception e) {
            System.out.println("exception"+e);
        }
    }
}

class Nonprime extends Thread {
    private int num;
    public Nonprime(int num) {
        this.num=num;
    }
    public void run() {
        try {
            Writer q = new FileWriter("nonprime.txt",true);
            String str2 = Integer.toString(num);
            q.write(str2);
            q.close();
        } catch(Exception e) {
            System.out.println("exception"+e);
            }
            }
            }
            
       

