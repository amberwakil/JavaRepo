package java2;

public class NewCustomer {
 String name;
 String address;
 String sex;
 int fee;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewCustomer obj = new NewCustomer();
		obj.name = "regina";
		obj.sex ="male";
		obj.address = "chicago";
		obj.fee = 500;
		 System.out.println("the name of the customer"+obj.name);
		 System.out.println("the address of the customer"+obj.address);
		 System.out.println("the sex of the customer"+obj.sex);
		 System.out.println("the fee of the customer"+obj.fee);
	}

}
