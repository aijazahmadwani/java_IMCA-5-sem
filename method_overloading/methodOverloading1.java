class methodOverloading1{
	void sum(int a ,int b){
		System.out.println("Sum = "+ (a+b));
	}
	void sum(int a ,int b,int c){
		System.out.println("Sum = "+ (a+b+c));
	}

	static public void main(String args[]){
		methodOverloading1 s1 = new methodOverloading1();
		s1.sum(1,2);
		s1.sum(2,2,2); 
	}
}