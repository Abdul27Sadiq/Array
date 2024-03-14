package Arrays;
import java.util.*;

public class Basic_question {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int size=scn.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=scn.nextInt();
		}
		int x=scn.nextInt();
		for(int i=0;i<size;i++) {
			if(arr[i]==x) {
				System.out.println("arr present at inder:" + i);
			}
		}
		
	}

}
