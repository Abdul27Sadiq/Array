package Arrays;
import java.util.*;
public class Spiral_order_matrix {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		int[][] arr=new int[n][m];
		
		// Spiral order example
		// 1 2 3 4
		// 5 6 7 8
		// 9 7 6 3
		// so spiral order of this matrix is = 1 2 3 4 8 3 6 7 9 5 6 7
		
		//input of 2D array
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=scn.nextInt();
			}
		}
		int row_start=0;
		int row_end=n-1;
		int col_start=0;
		int col_end=m-1;
		//Output
		while(row_start<=row_end && col_start<=col_end) {
			for(int col=col_start;col<=col_end;col++) {
				System.out.print(arr[row_start][col] + " ");
			}
			row_start++;
			 for(int row=row_start; row<=row_end; row++) {
	              System.out.print(arr[row][col_end] +" ");
	          }
	          col_end--;


	          //3
	          for(int col=col_end; col>=col_start; col--) {
	              System.out.print(arr[row_end][col] + " ");
	          }
	          row_end--;


	          //4
	          for(int row=row_end; row>=row_start; row--) {
	              System.out.print(arr[row][col_start] + " ");
	          }
	          col_start++;


	          System.out.println();


//		for(int i=0;i<=row_start;i++) {
//			for(int j=0;j<col;j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//		}
//		row_start++;
//		for(int i=row_start;i<row;i++) {
//			for(int j=col_end;j<col;j++) {
//				System.out.print(arr[i][j]+ " ");
//			}
//		}
//		col_end--;
//		for(int i=row_end;i<row;i++) {
//			for(int j=col_end;j<=col;j++) {
//				System.out.print(arr[i][j]+ " ");
//			}
//		}
		}
		
	}

}
