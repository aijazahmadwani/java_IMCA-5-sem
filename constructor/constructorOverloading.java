class constructorOverloading{
	int id;
	String name;
	int age;

	constructorOverloading(int i,String n){
		id = i;
		name = n;
	}
	constructorOverloading(int i,String n,int a){
		id = i;
		name = n;
		age = a;
	}
	void display(){
		System.out.println(id+"  "+name+"  "+age);
	}

	static public void main(String args[]){
		constructorOverloading s1 = new constructorOverloading(1,"Aijaz");
		constructorOverloading s2 = new constructorOverloading(1,"Haider",21);
		s1.display();
		s2.display();
	}
}