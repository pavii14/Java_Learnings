package pattern_pratice;

public class Alphabet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char i='E';i>='A';i--) {
			for (char j='A';j<='E';j++) {
				System.out.print(i);
				
			}
			System.out.println("");
		}
		
		System.out.println("-------------------------------------------------------");
		for(char i='E';i>='A';i--) {
			for (char j='E';j>='A';j--) {
				System.out.print(j);
				
			}
			System.out.println("");
		}
		
		System.out.println("-------------------------------------------------------");

	}

}
