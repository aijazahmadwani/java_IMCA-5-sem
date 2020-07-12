/*
There is no copy constructor in java. But, we can copy the values of 
one object to another like copy constructor in C++.

*/
class copyConstructor{
	int id;
	String name;

	copyConstructor(int i,String n){
		id = i;
		name = n;
	} 
	copyConstructor(copyConstructor s){
		id=s.id;
		name=s.name;
	}
	void display(){
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
	copyConstructor c1 = new copyConstructor(1,"Aijaz");
	copyConstructor	c2= new copyConstructor(c1);
	c1.display();
	c2.display();
	}
}