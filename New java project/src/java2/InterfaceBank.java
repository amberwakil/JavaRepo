package java2;
interface Bank
{
	String bankName = "CityBank";
	String name = "Andeela";
	void bankName();
	void accountHolderName();	
}

public class InterfaceBank implements Bank {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Bank obj = new InterfaceBank();
 obj.bankName();
 obj.accountHolderName();
	}
	
@Override
public void bankName() {
	System.out.println("the name of bank" +bankName);
}
@Override
public void accountHolderName() {
System.out.println("the name of accountholder"+name);
}
}
