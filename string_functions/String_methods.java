package string_functions;

public class String_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first_name="Pavithra";
		String last_name="S P";
		String White_space ="          s           p          ";
		
		String word1="apple";
		String word2="apple";
		
		String case1 ="Orange";
		String case2 ="orange";
		
		System.out.println("Concat_Method: "+ first_name.concat(last_name));
		System.out.println("Trim method : " + White_space.trim()); //front and back la iruka white space edukum 
		
		System.out.println("Equals method using string variable :"+ (word1==word2));
		System.out.println("Equals menthod S3==S4"+word1.equals(word2));
		
		String s3= new String("world");
		String s4 = new String ("world");
		
		System.out.println("Object created menthod S3==S4 :"+(s3==s4));
		
		System.out.println("Replace :  "+ word1.replace("a", "peo"));
		
		System.out.println("Replace All : " + word2.replaceAll(word2, "hiii"));
		
		System.out.println("Starts With : " + first_name.startsWith("P"));
		System.out.println("Ends with : " + last_name.endsWith("P"));
		System.out.println("Char_At : " + first_name.charAt(0));
		System.out.println("compareTo Lexicograhically : "+ word1.compareTo(word2)); //0 vantha true ,1 vantha false ithu athoda ascii value ah compare panum aprm value ah return panum onu onu um check panum first check panitu true ah irutha next letter check panum ( cap and small letters has diff asccii values )
		System.out.println("Equals Ignore Case : "+case1.equalsIgnoreCase(case2));
		
		System.out.println("SubString : "+ first_name.substring(3));// ignores the given number of letters 
		
		System.out.println("Last index of :  "+ case2.lastIndexOf("a") );// if the given letter or a word is not there it will give -1
		
		System.out.println("Index of : " + case1.indexOf("a"));
	}

}
