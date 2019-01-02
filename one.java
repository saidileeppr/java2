package programs;
import java.util.*;
public class one {
	public static void main(String[] args) {
		String s1;
		String[] s,s2= {"","",""};
		int i,j,op;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		s1=sc.nextLine();
		System.out.println("Select 1 or 2");
		op=sc.nextInt();
		s=s1.split(" ");
		if(op==2) {
			for(i=0;i<3;i++) {
				for(j=0;j<s[i].length();j++) {
					if(j%2==0) {
						s2[i]=s2[i]+s[i].charAt(j);
					}
				}
					for(j=0;j<s[i].length();j++) {
						if(j%2!=0) {
							s2[i]=s2[i]+s[i].charAt(j);
						}
					}
			}
		System.out.println(s2[0]+" "+s2[1]+" "+s2[2]);
}
		if(op==1) {
			for(i=0;i<3;i++) {
				for(j=0;j<s[i].length();j++) {
					if(j%2==0) {
						s2[i]=s2[i]+s[i].charAt(j);
					}
				}
				for(j=s[i].length()-1;j>=0;j--) {
					if(j%2==1) {
						s2[i]=s2[i]+s[i].charAt(j);
					}
				}
			}
		System.out.println(s2[0]+" "+s2[1]+" "+s2[2]);
		}
	}
}
