class methodOverloading2{
	void sum(int a ,int b){
		System.out.println("Sum = "+ (a+b));
	}
	void sum(int a ,double b,double c){
		System.out.println("Sum = "+ (a+b+c));
	}

	static public void main(String args[]){
		methodOverloading2 s1 = new methodOverloading2();
		s1.sum(1,2);
		s1.sum(2,2.5,2.5); 
	}
}