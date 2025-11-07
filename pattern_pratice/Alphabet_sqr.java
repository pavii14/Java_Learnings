package pattern_pratice;

public class Alphabet_sqr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(char i='A';i<='E';i++) {
			for (char j='A';j<='E';j++) {
				System.out.print(i);
			}
			System.out.println("");
		}

		System.out.println("-------------------------------------------------------");
		
		
		for(char i='A';i<='E';i++) {
			for (char j='A';j<='E';j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		
		
		System.out.println("-------------------------------------------------------");
		char temp='A';
		
		for(char i='A';i<='E';i++) {
			for (char j='A';j<='E';j++) {
				System.out.print(temp + " ");
				temp++;
			}
			System.out.println("");
		}
		
		System.out.println("-------------------------------------------------------");
		
		
	}

}
