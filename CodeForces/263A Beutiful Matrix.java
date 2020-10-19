import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BeutifulMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix = new int[5][5];
		int column=0, rows = 0;
		int moves =0;
		Reader in = new Reader();
		for(int i = 0; i<matrix.length;i++ ) {
			for(int j=0;j<matrix.length;j++) {
				int num = in.nextInt();
				if(num==1) {
					rows = Math.abs(3-i-1);
					column = Math.abs(3-j-1);
					
				}if(rows>0)
					break;
			}if(rows>0)
				break;
		}moves = rows+column;
		System.out.print(moves);
	}
}
	