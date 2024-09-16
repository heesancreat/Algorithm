import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int [] arr = new int[9];
		int sum=0;
		
		for(int i=0; i<9;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		
		
		for(int i =0; i<arr.length-1;i++) {
			for(int j = i+1; j<arr.length;j++) {
				if(sum-arr[i]-arr[j]==100) {
					arr[i]=0;
					arr[j]=0;
					sum=100;
					break;
				}
			}
		}
		
		Arrays.sort(arr);
		
		for(int i : arr) {
			if(i==0) {
				continue;
			}
			sb.append(i).append("\n");
		}
		
		
		System.out.println(sb.toString());
	}

}
