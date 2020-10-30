package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LinksAndPearls {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Reader in = new Reader();
				String str = in.nextLine();
				int pearls = 0;
				int links = 0;
				
				for(char c : str.toCharArray()) {
					if(c=='o') {
						pearls++;
					}else {
						links++;
					}
				}
				
				if(links%pearls==0) {
					System.out.print("YES");
				}else {
					System.out.print("No");
				}
				
		}
}
			
/*class Reader { 
	BufferedReader br; 
	StringTokenizer st; 
			    
	 public Reader() {
		br = new BufferedReader(new
		InputStreamReader(System.in)); 
	} 
			  
	String next(){ 
		while (st == null || !st.hasMoreElements()){
			try{
				st = new StringTokenizer(br.readLine());
			}catch (IOException  e){ 
				e.printStackTrace(); 
			} 
		} return st.nextToken();
	} 
			  
	int nextInt(){ 
		return Integer.parseInt(next()); 
	} 
			  
	long nextLong() { 
		return Long.parseLong(next()); 
	} 
			   
	double nextDouble(){ 
		return Double.parseDouble(next()); 
	} 
			  
	String nextLine(){ 
		String str = ""; 
		try{
			str = br.readLine(); 
		}catch (IOException e){
			 e.printStackTrace();
		}return str;
	} 
}*/
