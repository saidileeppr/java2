package programs;

import java.util.Scanner;

public class two {
	public static void main(String[] args) {
		String s1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		s1=sc.nextLine();
		String[] s;
		s=s1.split(" ");
		int i,j,sum=0,sum1;
		for(i=0;i<3;i++) {
			sum1=0;
			for(j=0;j<s[i].length()/2;j++) {
				sum1=sum1+Math.abs((int)s[i].charAt(j)-(int)s[i].charAt(s[i].length()-j-1));
			}
			sum=sum+sum1;
			System.out.print(sum+"+");
		}
	}

}
