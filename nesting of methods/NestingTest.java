class Nesting{
	int a, b;

	Nesting(int x, int y){
		a=x;
		b=y;
	}
	int largest(){
		if(a>b){
			return a;
		}
		else{
			return b;
		}
	}
	void display(){
		int large = largest(); // calling a method
		System.out.println("Largest Number = "+ large);
	}
}
class NestingTest{
	public static void main(String args[]){
		Nesting nest = new Nesting(100,100);
		nest.display();

	}


}