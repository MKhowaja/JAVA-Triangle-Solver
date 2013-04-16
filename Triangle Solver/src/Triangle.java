/**
 * CLASS TRIANGLE
 * Contains all the fields of a possible triangle (including an additional triangle in the case of ambiguity) 
 * Performs all the necessary calculations to solve a triangle according to case type (i.e. SSS, SAS, ASA, SAA, SSA)
 * @author Mustaqeem Khowaja and Aniket Verma
*/
public class Triangle {
	private Double a1; //Side a
	private Double b1; //Side b
	private Double c1; //Side c
	private Double A1; //Angle A (Opposite of Side a)
	private Double B1; //Angle B (Opposite of Side b)
	private Double C1; //Angle C (Opposite of Side c)
	
	//Ambiguous Case 2nd Solution
	private Double a2; //Other Side a
	private Double b2; //Other Side b
	private Double c2; //Other Side c
	private Double A2; //Other Angle A (Opposite of Side a)
	private Double B2; //Other Angle B (Opposite of Side b)
	private Double C2; //Other Angle C (Opposite of Side c)
	
	/**
	 * Call the value of sidea1. If the field has a value, 
	 * the value is rounded to 2 decimal places.
	 * <p>
	 * @return sidea1
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/
	
	public Double geta1 (){
		if (a1 != null){
			return round(a1);
		}
		else{
			return a1;
		}
	}
	
	/**
	 * Call the value of sidea2. If the field has a value, 
	 * the value is rounded to 2 decimal places.
	 * <p>
	 * @return sidea2
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/
	
	public Double geta2 (){
		if (a2 != null){
			return round(a2);
		}
		else{
			return a2;
		}

	}
	
	/**
	 * Call the value of sideb1. If the field has a value, 
	 * the value is rounded to 2 decimal places.
	 * <p>
	 * @return sideb1
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/
	
	public Double getb1 (){
		if (b1 != null){
			return round(b1);
		}
		else{
			return b1;
		}
	}
	
	/**
	 * Call the value of sideb2. If the field has a value, 
	 * the value is rounded to 2 decimal places.
	 * <p>
	 * @return sideb2
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/
	
	public Double getb2 (){
		if (b2 != null){
			return round(b2);
		}
		else{
			return b2;
		}
	}
	
	/**
	 * Call the value of sidec1. If the field has a value, 
	 * the value is rounded to 2 decimal places.
	 * <p>
	 * @return sidec1
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/

	public Double getc1 (){
		if (c1 != null){
			return round(c1);
		}
		else{
			return c1;
		}
	}
	
	/**
	 * Call the value of sidec2. If the field has a value, 
	 * the value is rounded to 2 decimal places.
	 * <p>
	 * @return sidec2
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/

	public Double getc2 (){
		if (c2 != null){
			return round(c2);
		}
		else{
			return c2;
		}
	}
	
	/**
	 * Call the value of angleA1. If the field has a value, 
	 * the value is rounded to 2 decimal places.
	 * <p>
	 * @return angleA1
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/

	public Double getA1 (){
		if (A1 != null){
			return round(A1);
		}
		else{
			return A1;
		}
	}
	
	/**
	 * Call the value of angleA2. If the field has a value, 
	 * the value is rounded to 2 decimal places.
	 * <p>
	 * @return angleA2
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/

	public Double getA2 (){
		if (A2 != null){
			return round(A2);
		}
		else{
			return A2;
		}
	}
	
	/**
	 * Call the value of angleB1. If the field has a value, 
	 * the value is rounded to 2 decimal places.
	 * <p>
	 * @return angleB1
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/

	public Double getB1 (){
		if (B1 != null){
			return round(B1);
		}
		else{
			return B1;
		}
	}
	
	/**
	 * Call the value of angleB2. If the field has a value, 
	 * the value is rounded to 2 decimal places.
	 * <p>
	 * @return angleB2
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/

	public Double getB2 (){
		if (B2 != null){
			return round(B2);
		}
		else{
			return B2;
		}
	}
	
	/**
	 * Call the value of angleC1. If the field has a value, 
	 * the value is rounded to 2 decimal places.
	 * <p>
	 * @return angleC1
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/

	public Double getC1 (){
		if (C1 != null){
			return round(C1);
		}
		else{
			return C1;
		}
	}
	
	/**
	 * Call the value of angleC2. If the field has a value, 
	 * the value is rounded to 2 decimal places.
	 * <p>
	 * @return angleC2
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/

	public Double getC2 (){
		if (C2 != null){
			return round(C2);
		}
		else{
			return C2;
		}
	}
	
	/**
	 * Stores value that is received as a parameter in sidea1.
	 * <p>
	 * @param x, of type double
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/

	public void puta1 (Double x){ 
		a1 = x;
	}
	
	/**
	 * Stores value that is received as a parameter in sidea2.
	 * <p>
	 * @param x, of type double
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/

	public void puta2 (Double x){
		a2 = x;
	}
	
	/**
	 * Stores value that is received as a parameter in sideb1.
	 * <p>
	 * @param x, of type double
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/

	public void putb1 (Double x){
		b1 = x;
	}
	
	/**
	 * Stores value that is received as a parameter in sideb2. 
	 * <p>
	 * @param x, of type double
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/

	public void putb2 (Double x){
		b2 = x;
	}
	
	/**
	 * Stores value that is received as a parameter in sidec1.
	 * <p>
	 * @param x, of type double
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/

	public void putc1 (Double x){
		c1 = x;
	}
	
	/**
	 * Stores value that is received as a parameter in sidec2. 
	 * <p>
	 * @param x, of type double
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/

	public void putc2 (Double x){
		c2 = x;
	}
	
	/**
	 * Stores value that is received as a parameter in angleA1.
	 * <p>
	 * @param x, of type Double
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/

	public void putA1 (Double x){
		A1 = x;
	}
	
	/**
	 * Stores value that is received as a parameter in angleA2.
	 * <p>
	 * @param x, of type Double
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/

	public void putA2 (Double x){
		A2 = x;
	}
	
	/**
	 * Stores value that is received as a parameter in angleB1.
	 * <p>
	 * @param x, of type Double
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/

	public void putB1 (Double x){
		B1 = x;
	}
	
	/**
	 * Stores value that is received as a parameter in angleB.
	 * <p>
	 * @param x, of type Double
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/

	public void putB2 (Double x){
		B2 = x;
	}
	
	/**
	 * Stores value that is received as a parameter in angleC1.
	 * <p>
	 * @param x, of type Double
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/

	public void putC1 (Double x){
		C1 = x;
	}
	
	/**
	 * Stores value that is received as a parameter in angleC2.
	 * <p>
	 * @param x, of type Double
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/

	public void putC2 (Double x){
		C2 = x;
	}
	
	/**
	 * Checks if there is a solution due to ambiguity in the triangle
	 * <p>
	 * @return cond, of type boolean; true if there is solution(s)   
	 * or false if a triangle cannot be created
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/

	public static boolean AmbiguousCheck(double x, double y, double a){
		if (x>y*Math.sin(Math.toDegrees(a))){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	/**
	 * Calculates and returns the area of the first triangle
	 * <p>
	 * @param Triangle x, an object defined by the class Triangle
	 * @return area of triangle 1
	 * @author Mustaqeem Khowaja and Aniket Verma
	 */

	public static double CalculateArea(Triangle x){
		return round(0.5*x.geta1()*x.getb1()*Math.sin(Math.toRadians(x.getC1())));
	}
	
	/**
	 * Calculates and returns the area of the second triangle (ambiguous case)
	 * <p>
	 * @param Triangle x, an object defined by the class Triangle
	 * @return area of triangle 2
	 * @author Mustaqeem Khowaja and Aniket Verma
	 */

	public static double CalculateArea2(Triangle x){
		return round(0.5*x.geta2()*x.getb2()*Math.sin(Math.toRadians(x.getC2())));
	}
	
	/**
	 * Calculates and returns the perimeter of the first triangle.
	 * <p>
	 * @param Triangle x, an object defined by the class Triangle
	 * @return perimeter of triangle 1
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/

	public static double CalculatePerimeter(Triangle x){
		return round(x.geta1() + x.getb1() + x.getc1());
	}
	
	/**
	 * Calculates and returns the perimeter of the second triangle (ambiguous case)
	 * <p>
	 * @param Triangle x, an object defined by the class Triangle
	 * @return perimeter of triangle 2
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/

	public static double CalculatePerimeter2(Triangle x){
		return round(x.geta2() + x.getb2() + x.getc2());
	}
	
	/**
	 * Assigns the values entered by the user to their respective 
	 * fields in the object and runs specific methods (cases) in 
	 * order to solve the triangle
	 * <p>
	 * @param double x1, double y1, double z1, Double X1, 
	 * Double Y1, Double Z1, double x2, double y2, double z2, 
	 * double X2, double Y2, double Z2
	 * <p>
	 * Represents sidea1, sideb1, sidec1, angleA1, angleB1, 
	 * angleC1, sidea2, sideb2, sidec2, angleA2, angleB2, 
	 * and angleC2 respectively. 
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/

	public Triangle(Double x1, Double y1, Double z1, Double X1, Double Y1, Double Z1, Double x2, Double y2, Double z2, Double X2, Double Y2, Double Z2){
		a1 = x1;
		a2 = x2;
		b1 = y1;
		b2 = y2;
		c1 = z1;
		c2 = z2;
		A1 = X1;
		A2 = X2;
		B1 = Y1;
		B2 = Y2;
		C1 = Z1;
		C2 = Z2;
		if ((a1!=null)&&(b1!=null)&&(c1!=null)){ //Checks 3 sides case
			CaseSSS();
		}
		else if (((a1!=null)&&(b1!=null)&&(C1!=null))||((a1!=null)&&(c1!=null)&&(B1!=null))||((b1!=null)&&(c1!=null)&&(A1!=null))){ //Checks for 2 sides and angle in between case
			CaseSAS();
		}
		else if (((a1!=null)&&(B1!=null)&&(C1!=null))||((b1!=null)&&(A1!=null)&&(C1!=null))||((c1!=null)&&(A1!=null)&&(B1!=null))){ //Checks for a side between 2 angles case
			CaseASA();
		}
		else if (((B1!=null)&&(C1!=null)&&((b1!=null)||(c1!=null)))||((A1!=null)&&(C1!=null)&&((a1!=null)||(c1!=null)))||((A1!=null)&&(B1!=null)&&((a1!=null)||(b1!=null)))){ //A side and 2 angles case
			CaseSAA();
		}
		else if (((a1!=null)&&(A1!=null)&&((b1!=null)||(c1!=null)))||((b1!=null)&&(B1!=null)&&((a1!=null)||(c1!=null)))||((c1!=null)&&(C1!=null)&&((a1!=null)||(b1!=null)))){ //2 sides and an angle case
			CaseSSA();
		}
		//The parameters sent in will always match one of the above cases, ergo no need for an else block
	}
	
	/**
	 * Initializes all the fields within the object to null
	 * <p>
	 * @param Triangle x – represents an object that is being initialized
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/

	public void ResetFields (){
		a1 = null;
		a2 = null;
		b1 = null;
		b2 = null;
		c1 = null;
		c2 = null;
		A1 = null;
		A2 = null;
		B1 = null;
		B2 = null;
		C1 = null;
		C2 = null;
	}
	
	/**
	 * Calculates angle opposite of the first parameter value that represents a 
	 * side on the triangle using the cosine law
	 * <p>
	 * @param double side1, double side2, double side3 – represents any three   
	 * sides of a triangle
	 * @return double angle opposite of side1
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/

	public static Double CosineAngle(Double side1, Double side2, Double side3){
		return round(Math.toDegrees(Math.acos(((Math.pow(side2, 2) + Math.pow(side3, 2) - Math.pow(side1, 2))/(2 * side2* side3)))));
	}
	
	
	/**
	 * calculates side opposite of the third parameter value that represents an 
	 * angle which is contained between two given sides on the triangle using the cosine law
	 * <p>
	 * @param double side1, Double angle, double side2 – represents any two sides 
	 * and a contained angle
	 * @return double side opposite of angle1
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/

	public static Double CosineSide(Double side1, Double angle1, Double side2){//return the calculated third side opposite of given contained angle using cosine law
		return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2) - (2*side1*side2*Math.cos(Math.toRadians(angle1))));
	}
	
	/**
	 * Calculates angle opposite of the third parameter value that represents a 
	 * side on the triangle using the sine law
	 * <p>
	 * @param double side1, Double angle1, double side2 – represents any one side 
	 * and an angle opposite to it, and any other side
	 * @return double angle opposite of side2
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/
	
	public static Double SineAngle(Double side1, Double angle1, Double side2){//return the calculated angle opposite of side2 using sine law 
		return round(Math.toDegrees(Math.asin(((side2*Math.sin(Math.toRadians(angle1)))/side1))));
	}
	
	/**
	 * Calculates side opposite of the third parameter value that represents an 
	 * angle on the triangle using the sine law
	 * <p>
	 * @param Double angle1, double side1, Double angle2 – represents any one angle 
	 * and a side opposite to it, and any other angle
	 * @return double side opposite of angle2
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/

	public static Double SineSide(Double side1, Double angle1, Double angle2){//return the calculated side opposite of angle 2 using sine law 
		return ((side1*Math.sin(Math.toRadians(angle2)))/Math.sin(Math.toRadians(angle1)));
	}
	
	/**
	* solves the triangle as a “side side side” case by manipulating the
	* implicit object
	* <p>
	* @author Mustaqeem Khowaja and Aniket Verma
	*/

	public void CaseSSS(){
		A1 = CosineAngle(a1, b1, c1);
		B1 = CosineAngle(b1, c1, a1);
		C1 = 180 - A1 - B1;
	}
	
	/**
	 * solves the triangle as a “angle side angle” (side between 
	 * two angles) case by manipulating the implicit object.
	 * <p>
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/

	public void CaseASA(){
		if (A1==null){
			A1 = 180 - B1 - C1;
			b1 = SineSide(a1, A1, B1);
			c1 = SineSide(a1, A1, C1);
		}
		else if (B1 == null){
			B1 = 180 - A1 - C1;
			a1 = SineSide(b1, B1, A1);
			c1 = SineSide(b1, B1, C1);
		}
		else if (C1 == null){
			C1 = 180 - A1 - B1;
			a1 = SineSide(c1, C1, A1);
			b1 = SineSide(c1, C1, B1);
		}
	}
	
	/**
	 * Solves the triangle as a “side angle side” (angle between two sides) case 
	 * by manipulating the implicit object.
	 * <p>
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/

	public void CaseSAS(){
		if (a1 == null){
			a1 = CosineSide(b1, A1, c1);
			B1 = SineAngle(a1, A1, b1);
			C1 = 180 - A1 - B1;
		}
		else if (b1 == null){
			b1 = CosineSide(a1, B1, c1);
			A1 = SineAngle(b1, B1, a1);
			C1 = 180 - A1 - B1;
		}
		else if (c1 == null){
			c1 = CosineSide(a1, C1, b1);
			A1 = SineAngle(c1, C1, a1);
			B1 = 180 - A1 - C1;
		}
	}
	
	/**
	 * solves the triangle as a “side side angle” (two sides 
	 * and an angle not in between them) case by manipulating 
	 * the implicit object.
	 * <p>
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/

	public void CaseSAA(){
		if (A1 == null){
			A1 = 180 - B1 - C1;
			if (b1 == null){
				b1 = SineSide(c1, C1, B1);
			}else{
				c1 = SineSide(b1, B1, C1);
			}
			a1 = SineSide(b1, B1, A1);
		}
		else if (B1 == null){
			B1 = 180 - A1 - C1;
			if (a1 == null){
				a1 = SineSide(c1, C1, A1);
			}else{
				c1 = SineSide(a1, A1, C1);
			}
			b1 = SineSide(a1, A1, B1);
		}
		else if (C1 == null){
			C1 = 180 - A1 - B1;
			if (a1 == null){
				a1 = SineSide(b1, B1, A1);
			}else{
				b1 = SineSide(a1, A1, B1);
			}
			c1 = SineSide(a1, A1, C1);
		}
	}
	
	/**
	 * Solves the triangle as a “side angle angle” (two angles and 
	 * an side not in between them) case by manipulating the implicit 
	 * object
	 * Also takes into consideration, the ambiguity of triangles
	 * <p>
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/

	public void CaseSSA(){
		if((a1!=null)&&(b1!=null)&&(A1!=null)){
			if(Triangle.AmbiguousCheck(a1, b1, A1)){
				a2 = a1;
				b2 = b1;
				A2 = A1;
				B1 = SineAngle(a1, A1, b1);
				C1 = 180 - A1 - B1;
				c1 = SineSide(a1, A1, C1);
				B2 = 180 - B1;
				C2 = 180 - A2 - B2;
				if (C2<=0){
					this.ResetT2();
				}else{
					c2 = SineSide(a2, A2, C2);
				}
			}
			else{
				B1 = SineAngle(a1, A1, b1);
				C1 = 180 - A1 - B1;
				c1 = SineSide(a1, A1, C1);
			}
		}
		else if((a1!=null)&&(c1!=null)&&(A1!=null)){
			if(Triangle.AmbiguousCheck(a1, c1, A1)){
				a2 = a1;
				c2 = c1;
				A2 = A1;
				C1 = SineAngle(a1, A1, c1);
				B1 = 180 - A1 - C1;
				b1 = SineSide(a1, A1, B1);
				C2 = 180 - C1;
				B2 = 180 - A2 - C2;
				if (B2<=0){
					this.ResetT2();
				}else{
					b2 = SineSide(a2, A2, B2);
				}
			}
			else{
				C1 = SineAngle(a1, A1, b1);
				B1 = 180 - A1 - B1;
				b1 = SineSide(a1, A1, C1);
			}
		}
		else if((b1!=null)&&(a1!=null)&&(B1!=null)){
			if(Triangle.AmbiguousCheck(b1, a1, B1)){
				b2 = b1;
				a2 = a1;
				B2 = B1;
				A1 = SineAngle(b1, B1, a1);
				C1 = 180 - A1 - B1;
				c1 = SineSide(b1, B1, C1);
				A2 = 180 - A1;
				C2 = 180 - A2 - B2;
				if (C2<=0){
					this.ResetT2();
				}else{
					c2 = SineSide(b2, B2, C2);
				}
			}
			else{
				A1 = SineAngle(b1, B1, a1);
				C1 = 180 - A1 - B1;
				c1 = SineSide(b1, B1, C1);
			}
		}
		else if((b1!=null)&&(c1!=null)&&(B1!=null)){
			if(Triangle.AmbiguousCheck(b1, c1, B1)){
				b2 = b1;
				c2 = c1;
				B2 = B1;
				C1 = SineAngle(b1, B1, c1);
				A1 = 180 - B1 - C1;
				a1 = SineSide(b1, B1, A1);
				C2 = 180 - C1;
				A2 = 180 - B2 - C2;
				if (A2<=0){
					this.ResetT2();
				}else{
					a2 = SineSide(b2, B2, A2);
				}
			}
			else{
				C1 = SineAngle(b1, B1, c1);
				A1 = 180 - B1 - C1;
				a1 = SineSide(b1, B1, A1);
			}
		}
		else if((c1!=null)&&(a1!=null)&&(C1!=null)){
			if(Triangle.AmbiguousCheck(c1, a1, C1)){
				c2 = c1;
				a2 = a1;
				C2 = C1;
				A1 = SineAngle(c1, C1, a1);
				B1 = 180 - A1 - C1;
				b1 = SineSide(c1, C1, B1);
				A2 = 180 - A1;
				B2 = 180 - A2 - C2;
				if (B2<=0){
					this.ResetT2();
				}else{
					b2 = SineSide(c2, C2, B2);
				}		
			}
			else{
				A1 = SineAngle(c1, C1, a1);
				B1 = 180 - A1 - C1;
				b1 = SineSide(b1, B1, B1);
			}
		}
		else if((c1!=null)&&(b1!=null)&&(C1!=null)){
			if(Triangle.AmbiguousCheck(c1, b1, C1)){
				c2 = c1;
				b2 = b1;
				C2 = C1;
				B1 = SineAngle(c1, C1, b1);
				A1 = 180 - B1 - C1;
				a1 = SineSide(c1, C1, A1);
				B2 = 180 - B1;
				A2 = 180 - B2 - C2;
				if (A2<=0){
					this.ResetT2();
				}else{
					a2 = SineSide(c2, C2, A2);
				}	
			}
			else{
				B1 = SineAngle(c1, C1, b1);
				A1 = 180 - B1 - C1;
				a1 = SineSide(b1, B1, A1);
			}
		}
	}
	
	
	/**
	 * Checks if the fields are valid 
	 * <p>
	 * @param Double a, Double b, Double c, Double A, Double B, Double C - represents all fields of Triangle
	 * @return true if a triangle can be created
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/
	public static boolean Check(Double a, Double b, Double c, Double A, Double B, Double C) {
		boolean temp = true;
		int angleCount=3;
		int sideCount=3;
		double h;
		double s1, s2, angle;
		if (a==null) {sideCount--;}
		if (b==null) {sideCount--;}
		if (c==null) {sideCount--;}
		if (A==null) {angleCount--;}
		if (B==null) {angleCount--;}
		if (C==null) {angleCount--;}
		if (angleCount >= 2) {
			if (A==null) {angleCount--;A = 0.0;}
			if (B==null) {angleCount--;B = 0.0;}
			if (C==null) {angleCount--;C = 0.0;}
			//no 2 obtuse, no 2 right angles, and sum of 2 angles less than 180
			if (A + B + C >= 180) {
				temp = false;
			}
		}
		else if (sideCount == 2) {
			if (a!=null && b!=null && A!=null) { //abA
				s1 = a;
				s2 = b;
				angle = A;
			}
			else if (b!=null && c!=null && B!=null) { //bcB
				s1 = b;
				s2 = c;
				angle = B;
			}
			else if (c!=null && a!=null && C!=null) { //caC
				s1 = c;
				s2 = a;
				angle = C;
			}
			else if (b!=null && a!=null && B!=null) { //baB
				s1 = b;
				s2 = a;
				angle = B;
			}
			else if (c!=null && b!=null && C!=null) { //cbC
				s1 = c;
				s2 = b;
				angle = C;
			}
			else if (a!=null && c!=null && A!=null) { //acA
				s1 = a;
				s2 = c;
				angle = A;
			}
			else {
				//a random case where there is only 1 solution
				s1 = 20;
				s2 = 16;
				angle = 30;
			}
			h = s2*Math.sin(Math.toRadians(angle));
			if (angle<90&&s1<h)
				temp = false;
			else if (angle>90&&s1<=s2)
				temp = false;
		}	
		else if (sideCount == 3) {
			if ((a+b<=c)||(a+b<=c)||(b+c<=a)) {
				temp = false;
			}
		}else{
			temp = false;
		}
		return temp;
	}
	
	/**
	* Checks if value entered is greater that zero
	 * <p>
	 * @param double x – represents an value that is being checked
	 * @return cond, of type boolean, which is set to true if the value entered
	 * is valid
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/
	public static boolean checkSide(double side) {
		boolean temp = true;
		if (side<0) {
			temp = false;
		}
		return temp;
	}
	
	/**
	* Checks if angle is valid
	 * <p>
	 * @param Double x – represents an value that is being checked
	 * @return cond, of type boolean, which is set to true if the value entered
	 * is valid
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/
	public static boolean checkAngle(Double angle) {
		boolean temp = true;
		if ((angle<1)||(angle>179)) {
			temp = false;
		}
		return temp;
	}
	
	/**
	 * Initializes all fields in only the second triangle to null
	 * <p>
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/
	public void ResetT2(){
		a2 = null;
		b2 = null;
		c2 = null;
		A2 = null;
		B2 = null;
		C2 = null;
	}
	
	/**
	 * Rounds to two decimal places
	 * <p>
	 * @param double x - the value to be rounded
	 * @return x rounded to two decimal places
	 * @author Mustaqeem Khowaja and Aniket Verma
	*/
	public static double round(double x) {
		double place = 100;
		x = Math.round(x*place)/place;
		return x;
	}
}
