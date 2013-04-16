import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class solver implements ActionListener {

	//Main Frame
	private JFrame frmTriangleSolver;
	
	//Fields for user to enter information
	private JTextField fielda1;
	private JTextField fieldA1;
	private JTextField fielda2;
	private JTextField fieldA2;
	private JTextField fieldb1;
	private JTextField fieldB1;
	private JTextField fieldb2;
	private JTextField fieldB2;
	private JTextField fieldc1;
	private JTextField fieldC1;
	private JTextField fieldc2;
	private JTextField fieldC2;
	
	//Buttons
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	
	private JFrame DFrame; //Error Message Frame
	
	//Variables to hold dimensions of triangle
	private Double A;
	private Double B;
	private Double C;
	private Double a;
	private Double b;
	private Double c;
	
	//Labels indicating fields
	private JLabel side1;
	private JLabel side2;
	private JLabel side3;
	private JLabel side4;
	private JLabel side5;
	private JLabel side6;
	private JLabel angle1;
	private JLabel angle2;
	private JLabel angle3;
	private JLabel angle4;
	private JLabel angle5;
	private JLabel angle6;
	private JLabel credits;
	
	//Object triangle
	private Triangle t;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			//Run GUI
			public void run() {
				try {
					solver window = new solver();
					window.frmTriangleSolver.setVisible(true); //Shows Window
				} catch (Exception e) {
					e.printStackTrace(); //General error message
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public solver() {
		
		initialize();
	}

	private void initialize() {
		
		//Creates interface
		frmTriangleSolver = new JFrame();
		frmTriangleSolver.setForeground(new Color(192, 192, 192));
		frmTriangleSolver.setTitle("Triangle Solver");
		frmTriangleSolver.setBounds(50, 50, 589, 670);
		frmTriangleSolver.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//Panel for the background
		JPanel Outline = new JPanel();
		frmTriangleSolver.getContentPane().add(Outline);
		Outline.setLayout(null);
		
		//Picture of a triangle
		JLabel picture = new JLabel();
		picture.setIcon(new ImageIcon("labelled-triangle-diagram.png"));
		picture.setBounds(45, 0, 486, 250); //Dimensions of picture
		Outline.add(picture);
		
		//Fields for user to enter values
		//Fields for second triangle are disabled and only appear when ambiguous case
		fielda1 = new JTextField();
		fielda1.setBounds(128, 267, 47, 20);
		Outline.add(fielda1);
		fielda1.setColumns(10);
		
		fieldA1 = new JTextField();
		fieldA1.setColumns(10);
		fieldA1.setBounds(128, 307, 47, 20);
		Outline.add(fieldA1);
		
		fielda2 = new JTextField();
		fielda2.setVisible(false);
		fielda2.setColumns(10);
		fielda2.setBounds(128, 348, 47, 20);
		fielda2.setEnabled(false);
		Outline.add(fielda2);
		
		fieldA2 = new JTextField();
		fieldA2.setVisible(false);
		fieldA2.setColumns(10);
		fieldA2.setBounds(128, 393, 47, 20);
		fieldA2.setEnabled(false);
		Outline.add(fieldA2);
		
		fieldb1 = new JTextField();
		fieldb1.setColumns(10);
		fieldb1.setBounds(310, 267, 47, 20);
		Outline.add(fieldb1);
		
		fieldB1 = new JTextField();
		fieldB1.setColumns(10);
		fieldB1.setBounds(310, 307, 47, 20);
		Outline.add(fieldB1);
		
		fieldb2 = new JTextField();
		fieldb2.setVisible(false);
		fieldb2.setColumns(10);
		fieldb2.setBounds(310, 348, 47, 20);
		fieldb2.setEnabled(false);
		Outline.add(fieldb2);
		
		fieldB2 = new JTextField();
		fieldB2.setVisible(false);
		fieldB2.setColumns(10);
		fieldB2.setBounds(310, 393, 47, 20);
		fieldB2.setEnabled(false);
		Outline.add(fieldB2);
		
		fieldc1 = new JTextField();
		fieldc1.setColumns(10);
		fieldc1.setBounds(505, 267, 47, 20);
		Outline.add(fieldc1);
		
		fieldC1 = new JTextField();
		fieldC1.setColumns(10);
		fieldC1.setBounds(505, 307, 47, 20);
		Outline.add(fieldC1);
		
		fieldc2 = new JTextField();
		fieldc2.setVisible(false);
		fieldc2.setColumns(10);
		fieldc2.setBounds(505, 348, 47, 20);
		fieldc2.setEnabled(false);
		Outline.add(fieldc2);
		
		fieldC2 = new JTextField();
		fieldC2.setVisible(false);
		fieldC2.setColumns(10);
		fieldC2.setBounds(505, 393, 47, 20);
		fieldC2.setEnabled(false);
		Outline.add(fieldC2);
		
		//Buttons with different operations
		JButton solve = new JButton("Solve Triangle");
		
		buttonGroup.add(solve);
		solve.setBounds(23, 455, 529, 45);
		Outline.add(solve);
		solve.setActionCommand("Solve");
		solve.addActionListener(this);
		solve.setToolTipText("Solves the triangle with the current dimensions");
		
		
		JButton area = new JButton("Calculate Area");
		area.setBounds(20, 511, 155, 96);
		Outline.add(area);
		area.setActionCommand("Area");
		area.addActionListener(this);
		area.setToolTipText("Displays the area of the triangle");
		
		JButton perimeter = new JButton("Calculate Perimeter");
		perimeter.setBounds(202, 511, 155, 96);
		Outline.add(perimeter);
		perimeter.setActionCommand("Perimeter");
		perimeter.addActionListener(this);
		perimeter.setToolTipText("Displays the perimeter of the triangle");
		
		JButton reset = new JButton("Reset Fields");
		reset.setBounds(397, 511, 155, 96);
		Outline.add(reset);
		reset.setActionCommand("Reset");
		reset.addActionListener(this);
		reset.setToolTipText("Deletes the current triangle");
		
		//Labels for the fields
		side1 = new JLabel("Side a = ");
		side1.setBounds(20, 261, 76, 37);
		Outline.add(side1);
		side1.setFont(new Font("Cambria", Font.BOLD, 18));
		
		angle1 = new JLabel("Angle A = ");
		angle1.setBounds(20, 301, 93, 37);
		Outline.add(angle1);
		angle1.setFont(new Font("Cambria", Font.BOLD, 18));
		
		side4 = new JLabel("Side a2 = ");
		side4.setBounds(20, 342, 90, 37);
		Outline.add(side4);
		side4.setVisible(false);
		side4.setFont(new Font("Cambria", Font.BOLD, 18));
		
		angle4 = new JLabel("Angle A2 = ");
		angle4.setBounds(20, 382, 97, 37);
		Outline.add(angle4);
		angle4.setVisible(false);
		angle4.setFont(new Font("Cambria", Font.BOLD, 18));
		
		side2 = new JLabel("Side b = ");
		side2.setBounds(200, 261, 76, 37);
		Outline.add(side2);
		side2.setFont(new Font("Cambria", Font.BOLD, 18));
		
		angle2 = new JLabel("Angle B = ");
		angle2.setBounds(200, 301, 93, 37);
		Outline.add(angle2);
		angle2.setFont(new Font("Cambria", Font.BOLD, 18));
		
		side5 = new JLabel("Side b2 = ");
		side5.setBounds(200, 342, 90, 37);
		Outline.add(side5);
		side5.setVisible(false);
		side5.setFont(new Font("Cambria", Font.BOLD, 18));
		
		angle5 = new JLabel("Angle B2 = ");
		angle5.setBounds(200, 382, 100, 37);
		Outline.add(angle5);
		angle5.setVisible(false);
		angle5.setFont(new Font("Cambria", Font.BOLD, 18));
		
		side3 = new JLabel("Side c = ");
		side3.setBounds(396, 261, 76, 37);
		Outline.add(side3);
		side3.setFont(new Font("Cambria", Font.BOLD, 18));
		
		angle3 = new JLabel("Angle C = ");
		angle3.setBounds(396, 301, 93, 37);
		Outline.add(angle3);
		angle3.setFont(new Font("Cambria", Font.BOLD, 18));
		
		side6 = new JLabel("Side c2 = ");
		side6.setBounds(396, 342, 90, 37);
		Outline.add(side6);
		side6.setVisible(false);
		side6.setFont(new Font("Cambria", Font.BOLD, 18));
		
		angle6 = new JLabel("Angle C2 = ");
		angle6.setBounds(396, 382, 93, 37);
		Outline.add(angle6);
		angle6.setVisible(false);
		angle6.setFont(new Font("Cambria", Font.BOLD, 18));
		
		credits = new JLabel ("Made by Mustaqeem Khowaja and Aniket Verma");
		credits.setBounds(20, 610, 600, 20);
		Outline.add(credits);
		credits.setFont(new Font("Courier New", Font.ITALIC, 20));
		credits.setForeground(new Color(0, 57, 145));
		
	}
	public void actionPerformed(ActionEvent e){
		boolean validAngle = true; //true if angle fields are valid
		boolean validSide = true; //true if side fields are valid
		boolean validField = true; //true if general numerical values are valid
		if ("Solve".equals(e.getActionCommand())) {
			int angleCount = 0, sideCount = 0;
			String temp = fieldA1.getText().trim(); //Temporary variable to store what is entered in the "A" field
			if ((temp!=null) && (!temp.equals(""))) { //Checks if "A" field has a value in it
				if (isDouble(temp)==false){ //Checks if there is a letter instead of a integer
					validField=false;
				}else{
					A = Double.parseDouble(temp); //Converts temp to an Double and stores it in angle "A"
					if (Triangle.checkAngle(A)==false) //Checks if angle is between 0 and 180 degrees
						validAngle=false;
					else
						angleCount++;
				}
			}
			//Process above is repeated for all fields
			temp = fieldB1.getText().trim();
			if ((temp!=null)&&(!temp.equals(""))) {
				if (isDouble(temp)==false){ 
					validField=false;
				}else{
					B = Double.parseDouble(temp); 
					if (Triangle.checkAngle(B)==false)
						validAngle=false;
					else
						angleCount++;
				}
			}
			temp = fieldC1.getText().trim();
			if ((temp!=null)&&(!temp.equals(""))) {
				if (isDouble(temp)==false){
					validField=false;
				}else{
					C = Double.parseDouble(temp);
					if (Triangle.checkAngle(C)==false)
						validAngle=false;
					else
						angleCount++;
				}
			}
			temp = fielda1.getText().trim();
			if ((temp!=null)&&(!temp.equals(""))) {
				if (isDouble(temp)==false){
					validField=false;
				}else{
					a = Double.parseDouble(temp); //Converts temp to a Double and stores it in side "a"
					if (Triangle.checkSide(a)==false) //Checks if side length is non-negative
						validSide=false;
					else
						sideCount++;
				}
			}
			temp = fieldb1.getText().trim();
			if ((temp!=null)&&(!temp.equals(""))) {
				if (isDouble(temp)==false){
					validField=false;
				}else{
					b = Double.parseDouble(temp);
					if (Triangle.checkSide(b)==false)
						validSide=false;
					else
						sideCount++;
				}
			}
			temp = fieldc1.getText().trim();
			if ((temp!=null)&&(!temp.equals(""))) {
				if (isDouble(temp)==false){
					validField=false;
				}else{
					c = Double.parseDouble(temp);
					if (Triangle.checkSide(c)==false)
						validSide=false;
					else
						sideCount++;
				}
			}
			if ((angleCount+sideCount==3)&&(sideCount!=0)) { //Checks if enough fields to create a triangle have been entered when the solve button been clicked
				if (Triangle.Check(a, b, c, A, B, C)){ //Checks if the triangle is can be created with the given angles and side lengths
					t=new Triangle (a, b, c, A, B, C, null, null, null,null, null, null); //Creates triangle
					JOptionPane.showMessageDialog(DFrame, "Triangle has been solved.", "Solve", JOptionPane.PLAIN_MESSAGE);
					setFields();
					enableFields(false); //Fields can no longer be edited					
				}
				else{
					JOptionPane.showMessageDialog(DFrame, "Cannot solve triangle.", "Error", JOptionPane.ERROR_MESSAGE);
					A = B = C = null;
					a = b = c = null;
					}
			}else if (validAngle==false){ //Outputs error if the angle is not between 0 and 180 degrees
				JOptionPane.showMessageDialog(DFrame, "Angle field(s) are invalid.", "Error", JOptionPane.ERROR_MESSAGE);
				A = B = C = null;
				a = b = c = null;
			}else if (validSide==false){ //Outputs error if the side length is non-negative
				JOptionPane.showMessageDialog(DFrame, "Side length field(s) are invalid.", "Error", JOptionPane.ERROR_MESSAGE);
				A = B = C = null;
				a = b = c = null;
			}else if (validField==false){ //Outputs error if any of the fields have letters in them
				JOptionPane.showMessageDialog(DFrame, "Field must contain numerical values.", "Error", JOptionPane.ERROR_MESSAGE);
				A = B = C = null;
				a = b = c = null;
			}else { //Error if wrong combination of sides and angles
				JOptionPane.showMessageDialog(DFrame, "Please enter a combination of SSA, AAS, ASA, SAS, or SSS", "Error", JOptionPane.ERROR_MESSAGE);
				A = B = C = null;
				a = b = c = null;
			}
			
		}else if ("Perimeter".equals(e.getActionCommand())){ //When Output Perimeter is clicked, it will output the triangle's perimeter
			if (t.getA2()==null){ //Checks how many triangles there are and outputs their perimeter accordingly
				JOptionPane.showMessageDialog(DFrame, "The perimeter is: "+(Triangle.CalculatePerimeter(t))+" units.", "Perimeter", JOptionPane.PLAIN_MESSAGE);
			}else{
				JOptionPane.showMessageDialog(DFrame, "The perimeter of the first triangle is: "+(Triangle.CalculatePerimeter(t))+" units and the perimeter of the second triangle is "+(Triangle.CalculatePerimeter2(t))+" units.", "Perimeter", JOptionPane.PLAIN_MESSAGE);
			}
		}else if ("Area".equals(e.getActionCommand())){ //When Output Area is clicked, it will output the triangle's area
			if (t.getA2()==null){//Checks how many triangles there are and outputs their area accordingly
				JOptionPane.showMessageDialog(DFrame, "The area is: "+(Triangle.CalculateArea(t))+" units squared.", "Area", JOptionPane.PLAIN_MESSAGE);
			}else{
				JOptionPane.showMessageDialog(DFrame, "The area of the first triangle is: "+(Triangle.CalculateArea(t)) + " units squared and the area of the second triangle is " + (Triangle.CalculateArea2(t))+" units squared.", "Area", JOptionPane.PLAIN_MESSAGE);
			}
		}else if ("Reset".equals(e.getActionCommand())){ //Checks if the Change Attributes button is clicked, it will reset the angles and sides lengths of the triangle
			enableFields(true); //Enables the text fields to be editable
			A = B = C = null; //Resets to values of the triangle
			a = b = c = null;
			clearFields();
			JOptionPane.showMessageDialog(DFrame, "The specifications have been reset.", "Reset", JOptionPane.PLAIN_MESSAGE);
		}
	}
	
	/**
	 * Checks if x is an double or has letters in it
	 */
	public static boolean isDouble(String x){ //Checks if field is a double
		try { 
	        Double.parseDouble(x); //Attempts to convert 
	    } catch(NumberFormatException e) { 
	        return false;
	    }
	    return true;
	}
	public void enableFields(boolean x){
		if (x){
			//Allows fields to be editable
			fieldA1.setEnabled(true);
			fieldB1.setEnabled(true);
			fieldC1.setEnabled(true);
			fielda1.setEnabled(true);
			fieldb1.setEnabled(true);
			fieldc1.setEnabled(true);
			//Hides ambiguous fields
			side4.setVisible(false);
			side5.setVisible(false);
			side6.setVisible(false);
			angle4.setVisible(false);
			angle5.setVisible(false);
			angle6.setVisible(false);
			fielda2.setVisible(false);
			fieldb2.setVisible(false);
			fieldc2.setVisible(false);
			fieldA2.setVisible(false);
			fieldB2.setVisible(false);
			fieldC2.setVisible(false);
		}else{
			//Disables editing
			fieldA1.setEnabled(false);
			fieldB1.setEnabled(false);
			fieldC1.setEnabled(false);
			fielda1.setEnabled(false);
			fieldb1.setEnabled(false);
			fieldc1.setEnabled(false);
		}
	}
	public void setFields(){
		//Sets fields with value of triangle after it has been solved
		fieldA1.setText(String.valueOf(t.getA1()));
		fieldB1.setText(String.valueOf(t.getB1()));
		fieldC1.setText(String.valueOf(t.getC1()));
		fielda1.setText(String.valueOf(t.geta1()));
		fieldb1.setText(String.valueOf(t.getb1()));
		fieldc1.setText(String.valueOf(t.getc1()));
		if (t.getA2()!=null){
			fieldA2.setText(String.valueOf(t.getA2()));
			fieldB2.setText(String.valueOf(t.getB2()));
			fieldC2.setText(String.valueOf(t.getC2()));
			fielda2.setText(String.valueOf(t.geta2()));
			fieldb2.setText(String.valueOf(t.getb2()));
			fieldc2.setText(String.valueOf(t.getc2()));
			side4.setVisible(true);
			side5.setVisible(true);
			side6.setVisible(true);
			angle4.setVisible(true);
			angle5.setVisible(true);
			angle6.setVisible(true);
			fielda2.setVisible(true);
			fieldb2.setVisible(true);
			fieldc2.setVisible(true);
			fieldA2.setVisible(true);
			fieldB2.setVisible(true);
			fieldC2.setVisible(true);
		}
	}
	public void clearFields(){
		//Empties fields
		fieldA1.setText("");
		fieldB1.setText("");
		fieldC1.setText("");
		fielda1.setText("");
		fieldb1.setText("");
		fieldc1.setText("");
		fieldA2.setText("");
		fieldB2.setText("");
		fieldC2.setText("");
		fielda2.setText("");
		fieldb2.setText("");
		fieldc2.setText("");
	}
}
