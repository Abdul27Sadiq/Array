package Arrays;
import java.util.*;
public class Transpose_of_matrix {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int m=scn.nextInt();
	int[][] arr=new int[n][m];
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			//System.out.print(arr[i][j]+" ");
			arr[i][j]=scn.nextInt();
		}
	}
	System.out.println(" The transpose array is");
	for(int j=0;j<m;j++) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	
	}

}
