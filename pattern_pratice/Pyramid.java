package pattern_pratice;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=8;
		for (int i =0; i<num;i++) { //row 
			for (int j=i; j< num;j++) {
				System.out.print(" ");
			}
			for (int k =0; k<(2*i-1);k++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
		

	}

}
