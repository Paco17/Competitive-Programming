public class SumofRoundNumbers {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader in = new Reader();
		int num = in.nextInt();
		
		
		while(num>0) {
			int number = in.nextInt();
			if(number<11) {
				System.out.println("1");
				System.out.println(number);
			}else {
				int numeros = 0;
				String str = String.valueOf(number);
				String numerosString = "";  
				for(int i=0;i<str.length();i++) {
					if(str.charAt(i)>48) {
						Integer n = (int) ((int) Character.getNumericValue(str.charAt(i))*Math.pow(10, str.length()-1-i));
						numerosString+=""+n+" ";
						numeros++;
						
					}
				}System.out.println("\n"+numeros);
				System.out.print(numerosString);
			}
			num--;
		}
	}

}