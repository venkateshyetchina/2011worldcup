package groupss.group;

import java.util.Scanner;

public class swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /* //int a=10;
  int temp=0;
 // int b=20;
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  System.out.println("enter a value:"+a);
 
  int b=sc.nextInt();
  System.out.println("enter b value:"+b);
  if(true) {
	 temp=a;//temp=10
	 a=b;//a=20
	 b=temp;//b=10
	 System.out.println("now A:"+a);
	 System.out.println("now B:"+b);*/
		//fibonacci series
		int num;int a=0;int b=0;int c=1;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(int i=0;i<num;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+" ");
		}
		}
  
	}


