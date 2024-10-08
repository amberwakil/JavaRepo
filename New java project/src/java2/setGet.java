package java2;

public class setGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		CreateCustomer obj = new CreateCustomer();
obj.setName("Andeela");
obj.setAddress("US");
obj.setSex("Female");
obj.setFee(500);

System.out.println("Name of the customer " +obj.getName());
System.out.println("Name of the customer " +obj.getAddress());
System.out.println("Name of the customer " +obj.getSex());
System.out.println("Name of the customer " +obj.getFee());
		
	}

}

class CreateCustomer
{
	private String name;
	private String address;
	private String sex;
	private int fee;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	
	
}
