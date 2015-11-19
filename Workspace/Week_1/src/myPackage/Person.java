package myPackage;

public class Person {

	int _age;
	String _name;
	
	public void setAge(int age){
		_age = age;
	}
	
	public int getAge(){
		return _age;
	}
	
	public void setName(String name){
		_name = name;
	}
	
	public String getName(){
		return _name;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello!");
		Person mario = new Person();
		mario.setAge(30);
		mario.setName("Mario");
		System.out.println(mario.getName() + " is " + mario.getAge() + " years old!");
		
	}

}
