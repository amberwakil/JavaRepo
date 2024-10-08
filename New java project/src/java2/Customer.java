package java2;

public class Customer {
	String name;
	String address;
	String sex;
	int fee;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer obj = new Customer();
		obj.name="regina";
		obj.address ="chicago";
		obj.sex ="male";
		obj.fee =500;
		
		System.out.println("the name of customer"+obj.name);
		System.out.println("the address of customer"+obj.address);
		System.out.println("the sex of customer"+obj.sex);
		System.out.println("the fee of customer"+obj.fee);

	}

}
