package _01_introduction_to_encapsulation;

import static org.junit.Assert.*;
/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	private float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();
	
	public static void main(String[] args) {
		EncapsulateTheData etd = new EncapsulateTheData();
		etd.setItemsReceived(10);
		etd.setItemsReceived(-100);
		if (etd.getItemsReceived() != 0)
		{
			fail("itemsReceived = " + etd.getItemsReceived());
		}
		etd.setDegreesTurned(50);
		etd.setDegreesTurned(-50);
		etd.setDegreesTurned(700);
		if (etd.getDegreesTurned() != 50)
		{
			fail("degreesTurned = " + etd.getDegreesTurned());
		}
		etd.setNomenclature("abc");
		etd.setNomenclature("");
		if (etd.getNomenclature() != " ")
		{
			fail("Nomencalture = " + etd.getNomenclature());
		}
		etd.setMemberObj(3);
		etd.setMemberObj("I am a string. That is not wrong");
		try {
			String test = (String) etd.getMemberObj();
			fail("MemberObj = " + etd.getMemberObj());
		} catch (Exception e){}
		
	}

	public int getItemsReceived() {
		return itemsReceived;
	}

	public void setItemsReceived(int itemsReceived) {
		this.itemsReceived = itemsReceived;
		if (itemsReceived < 0) this.itemsReceived = 0;
	}

	public float getDegreesTurned() {
		return degreesTurned;
	}

	public void setDegreesTurned(float degreesTurned) {
		if (degreesTurned >= 0 && degreesTurned <= 360)
		{
			this.degreesTurned = degreesTurned;
		}
	}

	public String getNomenclature() {
		return nomenclature;
	}

	public void setNomenclature(String nomenclature) {
		this.nomenclature = nomenclature;
		if (nomenclature == "") this.nomenclature = " ";
	}

	public Object getMemberObj() {
		return memberObj;
	}

	public void setMemberObj(Object memberObj) {
		this.memberObj = memberObj;
		try {
			String test = (String) memberObj;
			System.out.println("I am a string");
			this.memberObj = new Object();
		} catch (Exception e){System.out.println("I am not a string");}
	}
}
