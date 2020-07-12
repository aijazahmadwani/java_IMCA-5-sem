class rectangleArea{
	int length,breadth;

	void insert(int l,int b){
		length=l;
		breadth=b;
	}
	void calculateArea(){
		System.out.println(length*breadth);
	}

	static public void main(String args[]){
		rectangleArea r1 = new rectangleArea();
		rectangleArea r2 = new rectangleArea();

		r1.insert(11,5);
		r2.insert(3,15);

		r1.calculateArea();
		r2.calculateArea();
	}
}