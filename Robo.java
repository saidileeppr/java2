package programs;
import java.util.Scanner;
public class Dummy {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int input1=sc.nextInt(),input2=sc.nextInt();
		sc.close();
		String a[]=s1.split("-",4);
		int x=Integer.parseInt(a[0]),y=Integer.parseInt(a[1]),c=0;
		String b[]=s2.split(" ",10);
		for(int i=0;i<b.length;i++){
			if(b[i].equals("M")){
				if(a[2].equals("E") && x+1<=input1){
					x++;
				}
		        if(a[2].equals("W") && x-1>=0){
					x--;

				}
				if(a[2].equals("N") && y+1<=input2){
					y++;
				}
				if(a[2].equals("S") && y-1>=0){
					y--;
				}


			}
		if(b[i].equals("R")){

			if(a[2].equals("N")){
				a[2]="E";
			}
			else if(a[2].equals("S")){
				a[2]="W";
			}
			else if(a[2].equals("E")){
				a[2]="S";
			}
			else if(a[2].equals("W")){
				a[2]="N";
			}

		}
			if(b[i].equals("L")){

				c++;
				if(a[2].equals("N")){
					a[2]="W";
				}
				else if(a[2].equals("S")){
					a[2]="E";
				}
				else if(a[2].equals("E")){
					a[2]="N";
				}
				else if(a[2].equals("W")){
					a[2]="S";
				}

		}
	}

		
		System.out.println(x+" "+y+" "+a[2]);

		}
}
