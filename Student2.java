class Student2{
	int id;
	String name;

	void insertData(int r,String n){
		id=r;
		name=n;
	}

	void showData(){
		System.out.println(id + " " + name);
	}

	public static void main(String args[]){
		Student2 s1 = new Student2();
		Student2 s2 = new Student2();

		s1.insertData(1,"Aijaz");
		s2.insertData(2,"Sam");

		s1.showData();
		s2.showData();
	}
}