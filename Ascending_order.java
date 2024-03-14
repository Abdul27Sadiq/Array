package Arrays;
import java.util.*;
public class Ascending_order {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int size=scn.nextInt();
	int arr[]=new int[size];
	
	for(int i=0;i<size;i++) {
		arr[i]=scn.nextInt();
		}
	boolean ascending=true;
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]>arr[i+1]) {
			ascending=false;
			
		}
	}
	if(ascending) {
		System.out.println("array is in ascending order");
	}
	else {
		System.out.println("array is not in ascending order");
	}
  }

}