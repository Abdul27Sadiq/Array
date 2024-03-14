package Arrays;
import java.util.*;
public class maximum_and_minimum {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size=scn.nextInt();
		int arr[]=new int[size];
		//input
		for(int i=0;i<size;i++) {
			arr[i]=scn.nextInt();
		}
		int max= Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println("Minimum number is" + min);
		System.out.println("Maximun number is" + max);
	}

}
