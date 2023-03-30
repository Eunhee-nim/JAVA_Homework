package homework;



public class Loop2 {

	public static void main(String[] args) {
			int res = 2;
		for (int i = 1 ; i < 10 ; i++) {
			System.out.print("2");
			for (int j=0 ; j < i ; j++) {
			System.out.print("*2" );
			}
			res *= 2;			
			System.out.println("= " + res);
		} 
	
		
		
	}
}
