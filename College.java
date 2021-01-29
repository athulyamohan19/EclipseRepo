package javaBasics;

public class College {
	public static void main(String[] args) {
		Student joe=new Student();
		joe.collegeFee=50000;
		joe.examFee=5000;
		joe.name="joe";
		int i=joe.totalPay(35000,5000);
		
		Student sam=new Student();
		sam.collegeFee=80000;
		sam.examFee=5000;
		sam.name="sam";
		int j=sam.totalPay(55000,5000);
		
		int z=i+j;
		System.out.println("Total amount recieved : "+z);
	}
}
