import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WayTooLongWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader in  = new Reader();
		int limit = in.nextInt();
		String res = ""; 
		for(int i=0;i<limit;i++) {
			String str = in.nextLine();
			if(str.length()<=10) {
				res+=str+"\n";
			}
			else{
				res+=""+str.charAt(0)+(str.length()-2)+""+str.charAt(str.length()-1)+"\n";
			}
		}System.out.print(res);
	}
}
	class Reader { 
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
}
	
