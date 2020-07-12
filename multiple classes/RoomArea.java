class Room{
	float length;
	float breadth;

	void getdata(float a ,float b){
		length = a;
		breadth = b;
	}
}

class RoomArea{
	public static void main(String args[]){
		Room r = new Room();
		r.getdata(2,4);
		float result = r.length * r.breadth;
		System.out.println(result);
	}
}