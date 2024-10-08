package java2;

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonRecord obj = new PersonRecord();
		obj.personDetails();
		obj.courseDetails();
	}
	}

abstract class Person{
	String name= "harry";
String address="chicago";
	String sex ="male";
	int fee;
	String courseName ="QA automation";
	abstract void personDetails();
	public void courseDetails()
	{
	System.out.println("course selected");
	}
}		

class PersonRecord extends Person{
	@Override
	void personDetails() {
		System.out.println("the name of the person"+name);
		System.out.println("the address of person"+address);
		System.out.println("the sex of person"+sex);
		System.out.println("the fee of person"+fee);
	}
	
public void courseDetails()
{
	System.out.println("the course selected"+courseName);
}
}
