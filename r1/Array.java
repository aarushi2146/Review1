import java.util.*;

public class Array{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int m = sc.nextInt();
		System.out.println("Enter number of columns");
		int n = sc.nextInt();
		int[][] arr1 = new int[m][n];
		System.out.println("Enter entries for first array:");
		for(int i=0;i<m;i++){
			for(int j=0; j<n ;j++){
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter entries for second array:");
		int[][] arr2 = new int[m][n];
		for(int i=0;i<n;i++){
			for(int j = 0;j<m;j++){
				arr2[i][j] = sc.nextInt();
			}
		}
		int[][] sumArray = new int[m][n];
		for(int i = 0;i<m;i++){
			for(int j=0;j<n;j++){
				sumArray[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		System.out.println("The resultant Array :");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(sumArray[i][j]+" ");
			}
			System.out.println();
		}
		int sum = 0;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				sum +=sumArray[i][j];
			}
		}
		System.out.println(sum);
	}
}