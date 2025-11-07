package area_of_shapes;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Area of Square");
       System.out.println("Formula : A = Side * Side or A = a² ");
       int  num_val=5;
       System.out.println("Area of square of :"+num_val +"="+ num_val* num_val);
       
       System.out.println("-------------------------------------------");
       
       int length =5;
       int breadth=4;
       System.out.println("Area of Rectangle");
       System.out.println("formula: A = length × breadth");
       System.out.println("Area of Rectangle=" + (length*breadth));
       
       System.out.println("-------------------------------------------");
       
       System.out.println("Area of Parallelogram ");
       System.out.println("Formula : A = base × height");
       int base=2;
       int height=3;
       System.out.println("Area of Parallelogram :  "+ (base*height));
       
       System.out.println("-------------------------------------------");
       System.out.println("Area of Triangle ");
       System.out.println("Formula : A = ½ × base × height or A = (b × h) / 2");
  
       System.out.println("Area of triangle : "+ (base*height)*0.5);
       
       System.out.println("-----------------------------------------------");
       
       System.out.println("Area of Circle");
       System.out.println("formula: A = π × r²");
       int r =3;
       System.out.println("Area of circle is : " + Math.PI *(r*r));
       
       System.out.println("-----------------------------------------------");
       
       System.out.println("Area of Ellipse");
       System.out.println("Formula : A = π × a × b");
       int semi_major_a =3;
       int semi_minor_b=4;
       System.out.println( "Area of Ellipse: "+ Math.PI * semi_major_a *semi_minor_b);
       
       System.out.println("-------------------------------------------------------");
       
       System.out.println("Area of cube");

       System.out.println("formula: A = 6 × a² ");
      
       int a=2;
       System.out.println("Area of cube : " + (6*(a*a)));
       
       
       System.out.println("-------------------------------------------------------");
       System.out.println("Area of Sphere");
       System.out.println("formula:A = 4πr² ");
       System.out.println("Area of Sphere : " + (4*Math.PI*(r*r)));
       
       System.out.println("-------------------------------------------------------");
       System.out.println("Area of Hemisphere");
       System.out.println("formula:A = 3πr² ");
       
       System.out.println("Area of Hemisphere : " + (3*Math.PI*(r*r)));
       
       
       System.out.println("-------------------------------------------------------");
       System.out.println("Area of Equilateral Triangle");
       System.out.println("formula: A = (√3 / 4) × a² ");
       double areaa = 5;
       
       System.out.println(" Area of Equilateral Triangle : " + ((Math.sqrt(3)/4)*areaa*areaa) );
       
       
	}

}
