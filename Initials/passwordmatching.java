package Initials;

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String r=sc.nextLine();
		int t=sc.nextInt();
		
		int[] arr=new int[t];
		for(int i=0;i<t;i++){
		    arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<t;i++){
		    sum+=arr[i];
		}
		StringBuilder str;
		int x=sum%s.length();
		if(sum>0){
		   str=new StringBuilder(s.substring(s.length()-x)+s.substring(0,s.length()-x));
		}
		else if(sum<0){
		    str=new StringBuilder(s.substring(x)+s.substring(0,x));
		}
		else{
		    str=new StringBuilder(s);
		}
        if(str.toString().equals(r)){
            System.out.println("Matched");
        }
        else{
            System.out.println("Try again");
        }
	}
}