package string_builder_string_buffer;

public class String_Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		StringBuffer sb =new StringBuffer(); //empty buffer
		StringBuffer s =new StringBuffer(90);// string buffer with capacity  ithu vanthu evalo capacity us		
		StringBuffer a= new StringBuffer("hello");//string buffer with string value 		
		System.out.println(a.length());
		System.out.println(a.append("World"));
		System.out.println("insert:"+a.insert(2, "er"));
		System.out.println("replace ="+a.replace(0, 2, "lllo"));
		System.out.println("Delete method= "+a.delete(1, 6));
		System.out.println("reverse the mentioned string = "+a.reverse());
		System.out.println("Capacity= "+a.capacity());// show how much space it has consume ( default is 16)
		System.out.println("Character at property = "+a.charAt(6));
		sb.ensureCapacity(70); // increses the capacity value if it is less than the given value 
		System.out.println("Ensure capacity:"+sb.capacity());
		a.setLength(4); // ithu kudutha letter varaikum tha katum 4 letter varaikum tha display panum 
		System.out.println("SetLength:"+a);
		StringBuffer sb1 = new StringBuffer("LIGHT");
		sb1.setCharAt(0, 'H'); // namba sona place la character ah set panum 
		System.out.println("set character at :"+sb1 );
		sb1.deleteCharAt(3);
		System.out.println("delete_char:"+sb1);// namba sona place la iruka character ah delete panum 		
		//Substring 		
		sb.append("Hardworking");
		System.out.println("Substring:"+sb.substring(4)); // first 4 letters ah omit panitu methi irukuratha display panum 		
		 // ipadi kudutha namba range la kudukura value ah matum display panum 		
		System.out.println("substring with start and end value :" +sb.substring(0, 4));
	}

}
