package methods;

public class Method_overloading {

	public static int Salary(int a) {
		return a;
	}
	public static int Salary(int a , int bonus) {
		return a+bonus;
	}
	
	public static double Salary (int a , double hra, int bonus) {
		return a+hra+bonus ;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sal=70000;
		int bon=3000;
		double hras=3000;
		
		System.out.println("Salary calculator");
		System.out.println("------------------");
		
		System.out.println("System associate:" + Salary(sal));
		System.out.println("System Engineer:"+ Salary(sal,bon));
		System.out.println("Managers:"+ Salary(sal,hras,bon));
		
		
		

	}

}
