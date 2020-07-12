class factorial{
	void calculate(int n){
		int fact=1;
		for(int i=n;i>=1;i--){
			fact=fact*i;
		}
		System.out.println("Factorial = "+ fact);
	}

	public static void main(String args[]){
		new factorial().calculate(5);
	}
}