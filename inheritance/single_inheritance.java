class Room{
	int length, breadth;

	Room(int x, int y){
		length = x;
		breadth = y;
	}
	int area(){
		return length*breadth;
	}
}
class BedRoom extends Room{
	int height;

	BedRoom(int l,int b, int h){
		super(l,b); 	// pass values to super class
		height = h;
	}

	int volume(){
		return length*breadth*height;
	}
}
 
class single_inheritance{
	public static void main(String args[]){

		BedRoom b1 = new BedRoom(14,12,10);
		System.out.println("Area = "+ b1.area());
		System.out.println("Volume = "+ b1.volume());



	}

}