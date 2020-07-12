class parameterizedConstructor{  
    int id;  
    String name;  
      
    parameterizedConstructor(int i,String n){  
    id = i;  
    name = n;  
    }  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    parameterizedConstructor s1 = new parameterizedConstructor(111,"Aijaz");  
    parameterizedConstructor s2 = new parameterizedConstructor(222,"Haider");  
    s1.display();  
    s2.display();  
   }  
}