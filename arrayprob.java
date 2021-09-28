package mypack;
import java.util.Scanner;
public class arrayprob {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter no. of elements to store in 1st no");
		n=input.nextInt();
		System.out.println("Enter elements of array of 1st no");
		int a[]=new int[10];//Create array of memory length 10
		for(int i=0;i<n;i++) {
			a[i]=input.nextInt();//Storing element in a[i] array
		}
		System.out.println("Enter no. of elements to store in 2nd no");
		m=input.nextInt();
		System.out.println("Enter elements of array of 2nd no");
		int b[]=new int[10];//Create array of memory length 10
		for(int i=0;i<m;i++) {
			b[i]=input.nextInt(); //Storing element in b[i] array
		}
		System.out.println("Unmatched values between two arrays are as follows");
		/*The logic is user compare match values & break out of if loop & print unmatch values
		stored in "isElementPresent" via boolean operation*/
		for(int i=0;i<a.length;i++) {
			boolean isElementPresent= false;
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					 isElementPresent= true;
					 break;
				}
			}
			if(!isElementPresent) {
				System.out.print(a[i]+";");
			}
		}
		System.out.println();
		for(int i=0;i<b.length;i++) {
			boolean isElementPresent= false;
			for(int j=0;j<a.length;j++) {
				if(b[i]==a[j]) {
					 isElementPresent= true;
					 break;
				}
			}
			if(!isElementPresent) {
				System.out.print(b[i]+";");
			}
		}
	}
}
