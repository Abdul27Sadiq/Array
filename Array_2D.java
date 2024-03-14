package Arrays;
import java.util.*;

public class Array_2D {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int rows=scn.nextInt();
		int columns=scn.nextInt();
		int[][] arr=new int[rows][columns];
		
		// for input
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				arr[i][j]=scn.nextInt();
			}
		}
		
		// for output
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print( arr[i][j] + " ");
			}
			System.out.println();
		}
		// To find index of a given number
		int x=scn.nextInt();
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				if(x==arr[i][j]) {
					System.out.println("index of x is" + '('+i +","+j+')');
				}
			}
		}
		
	}

}
