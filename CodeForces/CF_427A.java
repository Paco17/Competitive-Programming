package CodeForces;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF_427A {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReaderClass in = new FastReaderClass();
		int n = in.nextInt();
		int sum= 0, count =0;
		while(n-- >0) {
			int num = in.nextInt();
			if(sum+num<0) {
				count++;
			}else {
				sum+=num;
			}
		
		}System.out.println(count);
	}
}
	
	class FastReaderClass { 
		BufferedReader br; 
	    StringTokenizer st; 
	    
	    public FastReaderClass() {
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
}
	